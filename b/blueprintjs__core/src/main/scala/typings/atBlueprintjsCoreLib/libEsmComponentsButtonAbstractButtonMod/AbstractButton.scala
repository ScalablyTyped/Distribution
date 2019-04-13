package typings
package atBlueprintjsCoreLib.libEsmComponentsButtonAbstractButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/button/abstractButton", "AbstractButton")
@js.native
abstract class AbstractButton[H /* <: reactLib.reactMod.HTMLAttributes[_] */] ()
  extends reactLib.reactMod.PureComponent[IButtonProps with H, IButtonState, js.Any] {
  var buttonRef: stdLib.HTMLElement = js.native
  var currentKeyDown: js.Any = js.native
  var refHandlers: atBlueprintjsCoreLib.Anon_Button = js.native
  @JSName("state")
  var state_AbstractButton: atBlueprintjsCoreLib.Anon_IsActive = js.native
  /* protected */ def getCommonButtonProps(): atBlueprintjsCoreLib.Anon_ClassName[H] = js.native
  /* protected */ def handleKeyDown(e: reactLib.reactMod.KeyboardEvent[_]): scala.Unit = js.native
  /* protected */ def handleKeyUp(e: reactLib.reactMod.KeyboardEvent[_]): scala.Unit = js.native
  /* protected */ def renderChildren(): reactLib.reactMod.ReactNode = js.native
}

