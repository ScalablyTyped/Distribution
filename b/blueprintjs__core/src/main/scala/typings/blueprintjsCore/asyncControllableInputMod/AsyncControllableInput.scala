package typings.blueprintjsCore.asyncControllableInputMod

import typings.blueprintjsCore.anon.PartialIAsyncControllable
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components/forms/asyncControllableInput", "AsyncControllableInput")
@js.native
class AsyncControllableInput ()
  extends Component[IAsyncControllableInputProps, IAsyncControllableInputState, js.Any] {
  
  var handleChange: js.Any = js.native
  
  var handleCompositionEnd: js.Any = js.native
  
  var handleCompositionStart: js.Any = js.native
}
/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/forms/asyncControllableInput", "AsyncControllableInput")
@js.native
object AsyncControllableInput extends js.Object {
  
  var displayName: String = js.native
  
  def getDerivedStateFromProps(nextProps: IAsyncControllableInputProps, nextState: IAsyncControllableInputState): PartialIAsyncControllable | Null = js.native
}
