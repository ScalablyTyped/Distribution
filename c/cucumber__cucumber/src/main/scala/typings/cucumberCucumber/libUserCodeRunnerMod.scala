package typings.cucumberCucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUserCodeRunnerMod {
  
  object default {
    
    @JSImport("@cucumber/cucumber/lib/user_code_runner", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def run(param0: IRunRequest): js.Promise[IRunResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IRunResponse]]
  }
  
  trait IRunRequest extends StObject {
    
    var argsArray: js.Array[Any]
    
    var fn: js.Function
    
    var thisArg: Any
    
    var timeoutInMilliseconds: Double
  }
  object IRunRequest {
    
    inline def apply(argsArray: js.Array[Any], fn: js.Function, thisArg: Any, timeoutInMilliseconds: Double): IRunRequest = {
      val __obj = js.Dynamic.literal(argsArray = argsArray.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], thisArg = thisArg.asInstanceOf[js.Any], timeoutInMilliseconds = timeoutInMilliseconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRunRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRunRequest] (val x: Self) extends AnyVal {
      
      inline def setArgsArray(value: js.Array[Any]): Self = StObject.set(x, "argsArray", value.asInstanceOf[js.Any])
      
      inline def setArgsArrayVarargs(value: Any*): Self = StObject.set(x, "argsArray", js.Array(value*))
      
      inline def setFn(value: js.Function): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setThisArg(value: Any): Self = StObject.set(x, "thisArg", value.asInstanceOf[js.Any])
      
      inline def setTimeoutInMilliseconds(value: Double): Self = StObject.set(x, "timeoutInMilliseconds", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRunResponse extends StObject {
    
    var error: js.UndefOr[Any] = js.undefined
    
    var result: js.UndefOr[Any] = js.undefined
  }
  object IRunResponse {
    
    inline def apply(): IRunResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRunResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRunResponse] (val x: Self) extends AnyVal {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
