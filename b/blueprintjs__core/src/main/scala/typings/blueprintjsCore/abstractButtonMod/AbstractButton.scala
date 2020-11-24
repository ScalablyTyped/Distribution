package typings.blueprintjsCore.abstractButtonMod

import typings.blueprintjsCore.anon.ClassName
import typings.blueprintjsCore.anon.IsActive
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.refsMod.IRefObject
import typings.react.mod.FocusEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components/button/abstractButton", "AbstractButton")
@js.native
abstract class AbstractButton[H /* <: HTMLAttributes[HTMLElement] */] ()
  extends AbstractPureComponent2[IButtonProps with H, IButtonState, js.Object] {
  
  var buttonRef: HTMLElement | IRefObject[HTMLElement] | Null = js.native
  
  var currentKeyDown: js.Any = js.native
  
  /* protected */ def getCommonButtonProps(): ClassName[H] = js.native
  
  /* protected */ def handleBlur(e: FocusEvent[_]): Unit = js.native
  
  /* protected */ def handleKeyDown(e: KeyboardEvent[_]): Unit = js.native
  
  /* protected */ def handleKeyUp(e: KeyboardEvent[_]): Unit = js.native
  
  /* protected */ def renderChildren(): ReactNode = js.native
  
  @JSName("state")
  var state_AbstractButton: IsActive = js.native
}
