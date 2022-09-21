package typings.blueprintjsCore.mod

import typings.blueprintjsCore.abstractButtonMod.ButtonProps
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "AnchorButton")
@js.native
open class AnchorButton protected ()
  extends typings.blueprintjsCore.componentsMod.AnchorButton {
  def this(props: ButtonProps[HTMLAnchorElement] & (AnchorHTMLAttributes[HTMLAnchorElement] | ButtonHTMLAttributes[HTMLButtonElement])) = this()
  def this(
    props: ButtonProps[HTMLAnchorElement] & (AnchorHTMLAttributes[HTMLAnchorElement] | ButtonHTMLAttributes[HTMLButtonElement]),
    context: Any
  ) = this()
}
/* static members */
object AnchorButton {
  
  @JSImport("@blueprintjs/core", "AnchorButton")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "AnchorButton.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
