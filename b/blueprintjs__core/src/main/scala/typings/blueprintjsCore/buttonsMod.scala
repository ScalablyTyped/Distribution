package typings.blueprintjsCore

import typings.blueprintjsCore.abstractButtonMod.AbstractButton
import typings.blueprintjsCore.refsMod.IRefObject
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/button/buttons", JSImport.Namespace)
@js.native
object buttonsMod extends js.Object {
  @js.native
  class AnchorButton () extends AbstractButton[AnchorHTMLAttributes[HTMLAnchorElement]] {
    @JSName("buttonRef")
    var buttonRef_AnchorButton: HTMLAnchorElement | IRefObject[HTMLAnchorElement] | Null = js.native
    var handleRef: IRefObject[HTMLAnchorElement] | (js.Function1[/* ref */ HTMLAnchorElement, Unit]) = js.native
  }
  
  @js.native
  class Button () extends AbstractButton[ButtonHTMLAttributes[HTMLButtonElement]] {
    @JSName("buttonRef")
    var buttonRef_Button: HTMLButtonElement | IRefObject[HTMLButtonElement] | Null = js.native
    var handleRef: IRefObject[HTMLButtonElement] | (js.Function1[/* ref */ HTMLButtonElement, Unit]) = js.native
  }
  
  /* static members */
  @js.native
  object AnchorButton extends js.Object {
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object Button extends js.Object {
    var displayName: String = js.native
  }
  
}

