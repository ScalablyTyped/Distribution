package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.distLibTypesMod.FunctionCov
import typings.bcoeV8Coverage.distLibTypesMod.RangeCov
import typings.bcoeV8Coverage.distLibTypesMod.ScriptCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.FunctionCov> */
  trait ReadonlyFunctionCov extends StObject {
    
    val functionName: String
    
    val isBlockCoverage: Boolean
    
    val ranges: js.Array[RangeCov]
  }
  object ReadonlyFunctionCov {
    
    inline def apply(functionName: String, isBlockCoverage: Boolean, ranges: js.Array[RangeCov]): ReadonlyFunctionCov = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], isBlockCoverage = isBlockCoverage.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyFunctionCov]
    }
    
    extension [Self <: ReadonlyFunctionCov](x: Self) {
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setIsBlockCoverage(value: Boolean): Self = StObject.set(x, "isBlockCoverage", value.asInstanceOf[js.Any])
      
      inline def setRanges(value: js.Array[RangeCov]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesVarargs(value: RangeCov*): Self = StObject.set(x, "ranges", js.Array(value*))
    }
  }
  
  /* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.ProcessCov> */
  trait ReadonlyProcessCov extends StObject {
    
    val result: js.Array[ScriptCov]
  }
  object ReadonlyProcessCov {
    
    inline def apply(result: js.Array[ScriptCov]): ReadonlyProcessCov = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyProcessCov]
    }
    
    extension [Self <: ReadonlyProcessCov](x: Self) {
      
      inline def setResult(value: js.Array[ScriptCov]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultVarargs(value: ScriptCov*): Self = StObject.set(x, "result", js.Array(value*))
    }
  }
  
  /* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.RangeCov> */
  trait ReadonlyRangeCov extends StObject {
    
    val count: Double
    
    val endOffset: Double
    
    val startOffset: Double
  }
  object ReadonlyRangeCov {
    
    inline def apply(count: Double, endOffset: Double, startOffset: Double): ReadonlyRangeCov = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyRangeCov]
    }
    
    extension [Self <: ReadonlyRangeCov](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.ScriptCov> */
  trait ReadonlyScriptCov extends StObject {
    
    val functions: js.Array[FunctionCov]
    
    val scriptId: String
    
    val url: String
  }
  object ReadonlyScriptCov {
    
    inline def apply(functions: js.Array[FunctionCov], scriptId: String, url: String): ReadonlyScriptCov = {
      val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyScriptCov]
    }
    
    extension [Self <: ReadonlyScriptCov](x: Self) {
      
      inline def setFunctions(value: js.Array[FunctionCov]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsVarargs(value: FunctionCov*): Self = StObject.set(x, "functions", js.Array(value*))
      
      inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
