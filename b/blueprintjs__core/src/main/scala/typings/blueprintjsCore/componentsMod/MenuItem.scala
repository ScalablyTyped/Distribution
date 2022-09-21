package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.menuItemMod.MenuItemProps
import typings.react.mod.AnchorHTMLAttributes
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "MenuItem")
@js.native
open class MenuItem protected ()
  extends typings.blueprintjsCore.menuItemMod.MenuItem {
  def this(props: MenuItemProps & AnchorHTMLAttributes[HTMLAnchorElement]) = this()
  def this(props: MenuItemProps & AnchorHTMLAttributes[HTMLAnchorElement], context: Any) = this()
}
/* static members */
object MenuItem {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MenuItem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MenuItem.defaultProps")
  @js.native
  def defaultProps: MenuItemProps = js.native
  inline def defaultProps_=(x: MenuItemProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MenuItem.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
