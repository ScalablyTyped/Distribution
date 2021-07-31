package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.awsSdkTypesStrings.finalizeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalizeRequestHandlerOptions
  extends StObject
     with HandlerOptions {
  
  @JSName("step")
  var step_FinalizeRequestHandlerOptions: finalizeRequest
}
object FinalizeRequestHandlerOptions {
  
  @scala.inline
  def apply(): FinalizeRequestHandlerOptions = {
    val __obj = js.Dynamic.literal(step = "finalizeRequest")
    __obj.asInstanceOf[FinalizeRequestHandlerOptions]
  }
  
  @scala.inline
  implicit class FinalizeRequestHandlerOptionsMutableBuilder[Self <: FinalizeRequestHandlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStep(value: finalizeRequest): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
