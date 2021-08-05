package typings.bcoeV8Coverage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait FunctionCov extends StObject {
    
    var functionName: String
    
    var isBlockCoverage: Boolean
    
    var ranges: js.Array[RangeCov]
  }
  object FunctionCov {
    
    inline def apply(functionName: String, isBlockCoverage: Boolean, ranges: js.Array[RangeCov]): FunctionCov = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], isBlockCoverage = isBlockCoverage.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionCov]
    }
    
    extension [Self <: FunctionCov](x: Self) {
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setIsBlockCoverage(value: Boolean): Self = StObject.set(x, "isBlockCoverage", value.asInstanceOf[js.Any])
      
      inline def setRanges(value: js.Array[RangeCov]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesVarargs(value: RangeCov*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    }
  }
  
  trait ProcessCov extends StObject {
    
    var result: js.Array[ScriptCov]
  }
  object ProcessCov {
    
    inline def apply(result: js.Array[ScriptCov]): ProcessCov = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessCov]
    }
    
    extension [Self <: ProcessCov](x: Self) {
      
      inline def setResult(value: js.Array[ScriptCov]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultVarargs(value: ScriptCov*): Self = StObject.set(x, "result", js.Array(value :_*))
    }
  }
  
  trait Range extends StObject {
    
    val end: Double
    
    val start: Double
  }
  object Range {
    
    inline def apply(end: Double, start: Double): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait RangeCov extends StObject {
    
    var count: Double
    
    var endOffset: Double
    
    var startOffset: Double
  }
  object RangeCov {
    
    inline def apply(count: Double, endOffset: Double, startOffset: Double): RangeCov = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeCov]
    }
    
    extension [Self <: RangeCov](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScriptCov extends StObject {
    
    var functions: js.Array[FunctionCov]
    
    var scriptId: String
    
    var url: String
  }
  object ScriptCov {
    
    inline def apply(functions: js.Array[FunctionCov], scriptId: String, url: String): ScriptCov = {
      val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptCov]
    }
    
    extension [Self <: ScriptCov](x: Self) {
      
      inline def setFunctions(value: js.Array[FunctionCov]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsVarargs(value: FunctionCov*): Self = StObject.set(x, "functions", js.Array(value :_*))
      
      inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
