package typings.blueprintjsCore.controlsMod

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Checkbox")
@js.native
class Checkbox ()
  extends AbstractPureComponent2[ICheckboxProps, ICheckboxState, js.Object] {
  
  @JSName("componentDidMount")
  def componentDidMount_MCheckbox(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCheckbox(): Unit = js.native
  
  var handleChange: js.Any = js.native
  
  var handleInputRef: js.Any = js.native
  
  var input: js.Any = js.native
  
  var updateIndeterminate: js.Any = js.native
}
/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/forms/controls", "Checkbox")
@js.native
object Checkbox extends js.Object {
  
  var displayName: String = js.native
  
  def getDerivedStateFromProps(hasIndeterminate: ICheckboxProps): ICheckboxState | Null = js.native
}
