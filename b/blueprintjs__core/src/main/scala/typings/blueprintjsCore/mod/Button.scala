package typings.blueprintjsCore.mod

import typings.blueprintjsCore.libEsmComponentsButtonAbstractButtonMod.ButtonProps
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Button")
@js.native
open class Button protected ()
  extends typings.blueprintjsCore.libEsmComponentsMod.Button {
  def this(props: ButtonProps[HTMLButtonElement] & (/* import warning: importer.ImportType#apply Failed type conversion: std.HTMLButtonElement extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement> */ js.Any)) = this()
  def this(
    props: ButtonProps[HTMLButtonElement] & (/* import warning: importer.ImportType#apply Failed type conversion: std.HTMLButtonElement extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement> */ js.Any),
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
