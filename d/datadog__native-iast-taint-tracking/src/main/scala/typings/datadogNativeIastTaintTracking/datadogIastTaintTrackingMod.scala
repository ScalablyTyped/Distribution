package typings.datadogNativeIastTaintTracking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datadogIastTaintTrackingMod {
  
  trait Metrics extends StObject {
    
    var requestCount: Double
  }
  object Metrics {
    
    inline def apply(requestCount: Double): Metrics = {
      val __obj = js.Dynamic.literal(requestCount = requestCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metrics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
      
      inline def setRequestCount(value: Double): Self = StObject.set(x, "requestCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeInputInfo extends StObject {
    
    var parameterName: String
    
    var parameterValue: String
    
    val ref: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object NativeInputInfo {
    
    inline def apply(parameterName: String, parameterValue: String, `type`: String): NativeInputInfo = {
      val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], parameterValue = parameterValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeInputInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeInputInfo] (val x: Self) extends AnyVal {
      
      inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
      
      inline def setParameterValue(value: String): Self = StObject.set(x, "parameterValue", value.asInstanceOf[js.Any])
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeTaintedRange extends StObject {
    
    var end: Double
    
    var iinfo: NativeInputInfo
    
    val ref: js.UndefOr[String] = js.undefined
    
    var start: Double
  }
  object NativeTaintedRange {
    
    inline def apply(end: Double, iinfo: NativeInputInfo, start: Double): NativeTaintedRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], iinfo = iinfo.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeTaintedRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeTaintedRange] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setIinfo(value: NativeInputInfo): Self = StObject.set(x, "iinfo", value.asInstanceOf[js.Any])
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaintedUtils extends StObject {
    
    def concat(transactionId: String, result: String, op1: String, op2: String): String
    
    def createTransaction(transactionId: String): String
    
    def getMetrics(transactionId: String, telemetryVerbosity: Double): Metrics
    
    def getRanges(transactionId: String, original: String): js.Array[NativeTaintedRange]
    
    def isTainted(transactionId: String, args: String*): Boolean
    
    def newTaintedString(transactionId: String, original: String, paramName: String, `type`: String): String
    
    def removeTransaction(transactionId: String): Unit
    
    def replace(transactionId: String, result: String, thisArg: String, matcher: Any, replacer: Any): String
    
    def setMaxTransactions(maxTransactions: Double): Unit
    
    def slice(transactionId: String, result: String, original: String, start: Double, end: Double): String
    
    def substr(transactionId: String, subject: String, result: String, start: Double, length: Double): String
    
    def substring(transactionId: String, subject: String, result: String, start: Double, end: Double): String
    
    def trim(transactionId: String, result: String, thisArg: String): String
    
    def trimEnd(transactionId: String, result: String, thisArg: String): String
  }
  object TaintedUtils {
    
    inline def apply(
      concat: (String, String, String, String) => String,
      createTransaction: String => String,
      getMetrics: (String, Double) => Metrics,
      getRanges: (String, String) => js.Array[NativeTaintedRange],
      isTainted: (String, /* repeated */ String) => Boolean,
      newTaintedString: (String, String, String, String) => String,
      removeTransaction: String => Unit,
      replace: (String, String, String, Any, Any) => String,
      setMaxTransactions: Double => Unit,
      slice: (String, String, String, Double, Double) => String,
      substr: (String, String, String, Double, Double) => String,
      substring: (String, String, String, Double, Double) => String,
      trim: (String, String, String) => String,
      trimEnd: (String, String, String) => String
    ): TaintedUtils = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction4(concat), createTransaction = js.Any.fromFunction1(createTransaction), getMetrics = js.Any.fromFunction2(getMetrics), getRanges = js.Any.fromFunction2(getRanges), isTainted = js.Any.fromFunction2(isTainted), newTaintedString = js.Any.fromFunction4(newTaintedString), removeTransaction = js.Any.fromFunction1(removeTransaction), replace = js.Any.fromFunction5(replace), setMaxTransactions = js.Any.fromFunction1(setMaxTransactions), slice = js.Any.fromFunction5(slice), substr = js.Any.fromFunction5(substr), substring = js.Any.fromFunction5(substring), trim = js.Any.fromFunction3(trim), trimEnd = js.Any.fromFunction3(trimEnd))
      __obj.asInstanceOf[TaintedUtils]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaintedUtils] (val x: Self) extends AnyVal {
      
      inline def setConcat(value: (String, String, String, String) => String): Self = StObject.set(x, "concat", js.Any.fromFunction4(value))
      
      inline def setCreateTransaction(value: String => String): Self = StObject.set(x, "createTransaction", js.Any.fromFunction1(value))
      
      inline def setGetMetrics(value: (String, Double) => Metrics): Self = StObject.set(x, "getMetrics", js.Any.fromFunction2(value))
      
      inline def setGetRanges(value: (String, String) => js.Array[NativeTaintedRange]): Self = StObject.set(x, "getRanges", js.Any.fromFunction2(value))
      
      inline def setIsTainted(value: (String, /* repeated */ String) => Boolean): Self = StObject.set(x, "isTainted", js.Any.fromFunction2(value))
      
      inline def setNewTaintedString(value: (String, String, String, String) => String): Self = StObject.set(x, "newTaintedString", js.Any.fromFunction4(value))
      
      inline def setRemoveTransaction(value: String => Unit): Self = StObject.set(x, "removeTransaction", js.Any.fromFunction1(value))
      
      inline def setReplace(value: (String, String, String, Any, Any) => String): Self = StObject.set(x, "replace", js.Any.fromFunction5(value))
      
      inline def setSetMaxTransactions(value: Double => Unit): Self = StObject.set(x, "setMaxTransactions", js.Any.fromFunction1(value))
      
      inline def setSlice(value: (String, String, String, Double, Double) => String): Self = StObject.set(x, "slice", js.Any.fromFunction5(value))
      
      inline def setSubstr(value: (String, String, String, Double, Double) => String): Self = StObject.set(x, "substr", js.Any.fromFunction5(value))
      
      inline def setSubstring(value: (String, String, String, Double, Double) => String): Self = StObject.set(x, "substring", js.Any.fromFunction5(value))
      
      inline def setTrim(value: (String, String, String) => String): Self = StObject.set(x, "trim", js.Any.fromFunction3(value))
      
      inline def setTrimEnd(value: (String, String, String) => String): Self = StObject.set(x, "trimEnd", js.Any.fromFunction3(value))
    }
  }
}
