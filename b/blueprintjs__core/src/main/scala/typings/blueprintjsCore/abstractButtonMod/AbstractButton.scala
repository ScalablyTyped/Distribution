package typings.blueprintjsCore.abstractButtonMod

import typings.blueprintjsCore.AnonButton
import typings.blueprintjsCore.AnonClassName
import typings.blueprintjsCore.AnonIsActive
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/button/abstractButton", "AbstractButton")
@js.native
abstract class AbstractButton[H /* <: HTMLAttributes[_] */] ()
  extends AbstractPureComponent2[IButtonProps with H, IButtonState, js.Object] {
  var buttonRef: HTMLElement = js.native
  var currentKeyDown: js.Any = js.native
  var refHandlers: AnonButton = js.native
  @JSName("state")
  var state_AbstractButton: AnonIsActive = js.native
  /* protected */ def getCommonButtonProps(): AnonClassName[H] = js.native
  /* protected */ def handleKeyDown(e: KeyboardEvent[_]): Unit = js.native
  /* protected */ def handleKeyUp(e: KeyboardEvent[_]): Unit = js.native
  /* protected */ def renderChildren(): ReactNode = js.native
}

