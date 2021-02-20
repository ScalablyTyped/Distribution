package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.typesMod.FunctionCov
import typings.bcoeV8Coverage.typesMod.RangeCov
import typings.bcoeV8Coverage.typesMod.ScriptCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.FunctionCov> */
  @js.native
  trait ReadonlyFunctionCov extends StObject {
    
    val functionName: String = js.native
    
    val isBlockCoverage: Boolean = js.native
    
    val ranges: js.Array[RangeCov] = js.native
  }
  object ReadonlyFunctionCov {
    
    @scala.inline
    def apply(functionName: String, isBlockCoverage: Boolean, ranges: js.Array[RangeCov]): ReadonlyFunctionCov = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], isBlockCoverage = isBlockCoverage.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyFunctionCov]
    }
    
    @scala.inline
    implicit class ReadonlyFunctionCovMutableBuilder[Self <: ReadonlyFunctionCov] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBlockCoverage(value: Boolean): Self = StObject.set(x, "isBlockCoverage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRanges(value: js.Array[RangeCov]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesVarargs(value: RangeCov*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.ProcessCov> */
  @js.native
  trait ReadonlyProcessCov extends StObject {
    
    val result: js.Array[ScriptCov] = js.native
  }
  object ReadonlyProcessCov {
    
    @scala.inline
    def apply(result: js.Array[ScriptCov]): ReadonlyProcessCov = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyProcessCov]
    }
    
    @scala.inline
    implicit class ReadonlyProcessCovMutableBuilder[Self <: ReadonlyProcessCov] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResult(value: js.Array[ScriptCov]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultVarargs(value: ScriptCov*): Self = StObject.set(x, "result", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.RangeCov> */
  @js.native
  trait ReadonlyRangeCov extends StObject {
    
    val count: Double = js.native
    
    val endOffset: Double = js.native
    
    val startOffset: Double = js.native
  }
  object ReadonlyRangeCov {
    
    @scala.inline
    def apply(count: Double, endOffset: Double, startOffset: Double): ReadonlyRangeCov = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyRangeCov]
    }
    
    @scala.inline
    implicit class ReadonlyRangeCovMutableBuilder[Self <: ReadonlyRangeCov] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.ScriptCov> */
  @js.native
  trait ReadonlyScriptCov extends StObject {
    
    val functions: js.Array[FunctionCov] = js.native
    
    val scriptId: String = js.native
    
    val url: String = js.native
  }
  object ReadonlyScriptCov {
    
    @scala.inline
    def apply(functions: js.Array[FunctionCov], scriptId: String, url: String): ReadonlyScriptCov = {
      val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyScriptCov]
    }
    
    @scala.inline
    implicit class ReadonlyScriptCovMutableBuilder[Self <: ReadonlyScriptCov] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctions(value: js.Array[FunctionCov]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsVarargs(value: FunctionCov*): Self = StObject.set(x, "functions", js.Array(value :_*))
      
      @scala.inline
      def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
