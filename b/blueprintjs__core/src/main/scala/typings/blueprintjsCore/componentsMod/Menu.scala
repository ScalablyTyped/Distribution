package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.TypeofMenuDivider
import typings.blueprintjsCore.anon.TypeofMenuItem
import typings.blueprintjsCore.menuMod.IMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Menu")
@js.native
class Menu protected ()
  extends typings.blueprintjsCore.menuMod.Menu {
  def this(props: IMenuProps) = this()
  def this(props: IMenuProps, context: js.Any) = this()
}
/* static members */
object Menu {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Menu.Divider")
  @js.native
  def Divider: TypeofMenuDivider = js.native
  @scala.inline
  def Divider_=(x: TypeofMenuDivider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Menu.Item")
  @js.native
  def Item: TypeofMenuItem = js.native
  @scala.inline
  def Item_=(x: TypeofMenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Menu.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
