package typings.blueprintjsCore.mod

import typings.blueprintjsCore.menuItemMod.IMenuItemProps
import typings.react.mod.AnchorHTMLAttributes
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "MenuItem")
@js.native
class MenuItem protected ()
  extends typings.blueprintjsCore.componentsMod.MenuItem {
  def this(props: IMenuItemProps & AnchorHTMLAttributes[HTMLAnchorElement]) = this()
  def this(props: IMenuItemProps & AnchorHTMLAttributes[HTMLAnchorElement], context: js.Any) = this()
}
/* static members */
object MenuItem {
  
  @JSImport("@blueprintjs/core", "MenuItem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "MenuItem.defaultProps")
  @js.native
  def defaultProps: IMenuItemProps = js.native
  @scala.inline
  def defaultProps_=(x: IMenuItemProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "MenuItem.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
