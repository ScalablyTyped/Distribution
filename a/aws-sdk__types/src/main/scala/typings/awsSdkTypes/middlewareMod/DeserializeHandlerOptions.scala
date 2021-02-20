package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.awsSdkTypesStrings.deserialize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeserializeHandlerOptions extends HandlerOptions {
  
  @JSName("step")
  var step_DeserializeHandlerOptions: deserialize = js.native
}
object DeserializeHandlerOptions {
  
  @scala.inline
  def apply(step: deserialize): DeserializeHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeHandlerOptions]
  }
  
  @scala.inline
  implicit class DeserializeHandlerOptionsMutableBuilder[Self <: DeserializeHandlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStep(value: deserialize): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
