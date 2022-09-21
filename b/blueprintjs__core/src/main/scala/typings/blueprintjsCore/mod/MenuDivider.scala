package typings.blueprintjsCore.mod

import typings.blueprintjsCore.menuDividerMod.MenuDividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "MenuDivider")
@js.native
open class MenuDivider protected ()
  extends typings.blueprintjsCore.componentsMod.MenuDivider {
  def this(props: MenuDividerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MenuDividerProps, context: Any) = this()
}
/* static members */
object MenuDivider {
  
  @JSImport("@blueprintjs/core", "MenuDivider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "MenuDivider.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
