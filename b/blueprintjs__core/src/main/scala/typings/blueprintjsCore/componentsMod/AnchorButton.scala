package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.abstractButtonMod.IButtonProps
import typings.react.mod.AnchorHTMLAttributes
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "AnchorButton")
@js.native
class AnchorButton protected ()
  extends typings.blueprintjsCore.buttonsMod.AnchorButton {
  def this(props: IButtonProps & AnchorHTMLAttributes[HTMLAnchorElement]) = this()
  def this(props: IButtonProps & AnchorHTMLAttributes[HTMLAnchorElement], context: js.Any) = this()
}
/* static members */
object AnchorButton {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "AnchorButton")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "AnchorButton.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
