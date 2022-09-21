package typings.blueprintjsCore.mod

import typings.blueprintjsCore.abstractButtonMod.ButtonProps
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Button")
@js.native
open class Button protected ()
  extends typings.blueprintjsCore.componentsMod.Button {
  def this(props: ButtonProps[HTMLButtonElement] & (AnchorHTMLAttributes[HTMLAnchorElement] | ButtonHTMLAttributes[HTMLButtonElement])) = this()
  def this(
    props: ButtonProps[HTMLButtonElement] & (AnchorHTMLAttributes[HTMLAnchorElement] | ButtonHTMLAttributes[HTMLButtonElement]),
    context: Any
  ) = this()
}
/* static members */
object Button {
  
  @JSImport("@blueprintjs/core", "Button")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Button.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
