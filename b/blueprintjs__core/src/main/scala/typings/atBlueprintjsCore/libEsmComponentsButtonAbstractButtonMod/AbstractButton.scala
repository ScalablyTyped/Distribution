package typings.atBlueprintjsCore.libEsmComponentsButtonAbstractButtonMod

import typings.atBlueprintjsCore.Anon_Button
import typings.atBlueprintjsCore.Anon_ClassName
import typings.atBlueprintjsCore.Anon_IsActive
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.PureComponent
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/button/abstractButton", "AbstractButton")
@js.native
abstract class AbstractButton[H /* <: HTMLAttributes[_] */] ()
  extends PureComponent[IButtonProps with H, IButtonState, js.Any] {
  var buttonRef: HTMLElement = js.native
  var currentKeyDown: js.Any = js.native
  var refHandlers: Anon_Button = js.native
  @JSName("state")
  var state_AbstractButton: Anon_IsActive = js.native
  /* protected */ def getCommonButtonProps(): Anon_ClassName[H] = js.native
  /* protected */ def handleKeyDown(e: KeyboardEvent[_]): Unit = js.native
  /* protected */ def handleKeyUp(e: KeyboardEvent[_]): Unit = js.native
  /* protected */ def renderChildren(): ReactNode = js.native
}

