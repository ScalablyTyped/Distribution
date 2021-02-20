package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.awsSdkTypesStrings.build
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildHandlerOptions extends HandlerOptions {
  
  @JSName("step")
  var step_BuildHandlerOptions: build = js.native
}
object BuildHandlerOptions {
  
  @scala.inline
  def apply(step: build): BuildHandlerOptions = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildHandlerOptions]
  }
  
  @scala.inline
  implicit class BuildHandlerOptionsMutableBuilder[Self <: BuildHandlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStep(value: build): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
