package typings.awsSdkTypes.distTypesMiddlewareMod

import typings.awsSdkTypes.awsSdkTypesStrings.initialize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializeHandlerOptions
  extends StObject
     with HandlerOptions {
  
  @JSName("step")
  var step_InitializeHandlerOptions: js.UndefOr[initialize] = js.undefined
}
object InitializeHandlerOptions {
  
  inline def apply(): InitializeHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializeHandlerOptions]
  }
  
  extension [Self <: InitializeHandlerOptions](x: Self) {
    
    inline def setStep(value: initialize): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
