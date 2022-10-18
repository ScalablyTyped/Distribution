package typings.blueprintjsCore.mod

import typings.blueprintjsCore.libEsmComponentsMenuMenuMod.MenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Menu")
@js.native
open class Menu protected ()
  extends typings.blueprintjsCore.libEsmComponentsMod.Menu {
  def this(props: MenuProps) = this()
  def this(props: MenuProps, context: Any) = this()
}
/* static members */
object Menu {
  
  @JSImport("@blueprintjs/core", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Menu.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
