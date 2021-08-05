package typings.blueprintjsCore.mod

import typings.blueprintjsCore.abstractButtonMod.IButtonProps
import typings.react.mod.AnchorHTMLAttributes
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "AnchorButton")
@js.native
class AnchorButton protected ()
  extends typings.blueprintjsCore.componentsMod.AnchorButton {
  def this(props: IButtonProps & AnchorHTMLAttributes[HTMLAnchorElement]) = this()
  def this(props: IButtonProps & AnchorHTMLAttributes[HTMLAnchorElement], context: js.Any) = this()
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
