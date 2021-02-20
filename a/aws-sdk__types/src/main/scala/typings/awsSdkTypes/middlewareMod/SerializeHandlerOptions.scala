package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.awsSdkTypesStrings.serialize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializeHandlerOptions extends HandlerOptions {
  
  @JSName("step")
  var step_SerializeHandlerOptions: serialize = js.native
}
object SerializeHandlerOptions {
  
  @scala.inline
  def apply(step: serialize): SerializeHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeHandlerOptions]
  }
  
  @scala.inline
  implicit class SerializeHandlerOptionsMutableBuilder[Self <: SerializeHandlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStep(value: serialize): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
