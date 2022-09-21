package typings.blueprintjsCore

import typings.blueprintjsCore.abstractButtonMod.AbstractButton
import typings.blueprintjsCore.abstractButtonMod.AnchorButtonProps
import typings.blueprintjsCore.abstractButtonMod.ButtonProps
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.Ref
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/button/buttons", "AnchorButton")
  @js.native
  open class AnchorButton protected () extends AbstractButton[HTMLAnchorElement] {
    def this(props: ButtonProps[HTMLAnchorElement] & (AnchorHTMLAttributes[HTMLAnchorElement] | ButtonHTMLAttributes[HTMLButtonElement])) = this()
    def this(
      props: ButtonProps[HTMLAnchorElement] & (AnchorHTMLAttributes[HTMLAnchorElement] | ButtonHTMLAttributes[HTMLButtonElement]),
      context: Any
    ) = this()
    
    @JSName("buttonRef")
    var buttonRef_AnchorButton: HTMLAnchorElement | Null = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAnchorButton(prevProps: AnchorButtonProps): Unit = js.native
    
    /* protected */ var handleRef: Ref[HTMLAnchorElement] = js.native
  }
  /* static members */
  object AnchorButton {
    
    @JSImport("@blueprintjs/core/lib/esm/components/button/buttons", "AnchorButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/button/buttons", "AnchorButton.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/button/buttons", "Button")
  @js.native
  open class Button protected () extends AbstractButton[HTMLButtonElement] {
    def this(props: ButtonProps[HTMLButtonElement] & (AnchorHTMLAttributes[HTMLAnchorElement] | ButtonHTMLAttributes[HTMLButtonElement])) = this()
    def this(
      props: ButtonProps[HTMLButtonElement] & (AnchorHTMLAttributes[HTMLAnchorElement] | ButtonHTMLAttributes[HTMLButtonElement]),
      context: Any
    ) = this()
    
    @JSName("buttonRef")
    var buttonRef_Button: HTMLButtonElement | Null = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MButton(prevProps: ButtonProps[HTMLButtonElement]): Unit = js.native
    
    /* protected */ var handleRef: Ref[HTMLButtonElement] = js.native
  }
  /* static members */
  object Button {
    
    @JSImport("@blueprintjs/core/lib/esm/components/button/buttons", "Button")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/button/buttons", "Button.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
