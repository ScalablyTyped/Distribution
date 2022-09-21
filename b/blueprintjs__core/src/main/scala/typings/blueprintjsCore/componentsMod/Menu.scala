package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.menuMod.MenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Menu")
@js.native
open class Menu protected ()
  extends typings.blueprintjsCore.menuMod.Menu {
  def this(props: MenuProps) = this()
  def this(props: MenuProps, context: Any) = this()
}
/* static members */
object Menu {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Menu.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
