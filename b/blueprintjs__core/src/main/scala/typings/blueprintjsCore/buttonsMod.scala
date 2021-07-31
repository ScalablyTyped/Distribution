package typings.blueprintjsCore

import typings.blueprintjsCore.abstractButtonMod.AbstractButton
import typings.blueprintjsCore.abstractButtonMod.IButtonProps
import typings.blueprintjsCore.refsMod.IRefObject
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/button/buttons", "AnchorButton")
  @js.native
  class AnchorButton protected () extends AbstractButton[AnchorHTMLAttributes[HTMLAnchorElement]] {
    def this(props: IButtonProps & AnchorHTMLAttributes[HTMLAnchorElement]) = this()
    def this(props: IButtonProps & AnchorHTMLAttributes[HTMLAnchorElement], context: js.Any) = this()
    
    @JSName("buttonRef")
    var buttonRef_AnchorButton: HTMLAnchorElement | IRefObject[HTMLAnchorElement] | Null = js.native
    
    var handleRef: IRefObject[HTMLAnchorElement] | (js.Function1[/* ref */ HTMLAnchorElement | Null, Unit]) = js.native
  }
  /* static members */
  object AnchorButton {
    
    @JSImport("@blueprintjs/core/lib/esm/components/button/buttons", "AnchorButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/button/buttons", "AnchorButton.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/button/buttons", "Button")
  @js.native
  class Button protected () extends AbstractButton[ButtonHTMLAttributes[HTMLButtonElement]] {
    def this(props: IButtonProps & ButtonHTMLAttributes[HTMLButtonElement]) = this()
    def this(props: IButtonProps & ButtonHTMLAttributes[HTMLButtonElement], context: js.Any) = this()
    
    @JSName("buttonRef")
    var buttonRef_Button: HTMLButtonElement | IRefObject[HTMLButtonElement] | Null = js.native
    
    var handleRef: IRefObject[HTMLButtonElement] | (js.Function1[/* ref */ HTMLButtonElement | Null, Unit]) = js.native
  }
  /* static members */
  object Button {
    
    @JSImport("@blueprintjs/core/lib/esm/components/button/buttons", "Button")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/button/buttons", "Button.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
