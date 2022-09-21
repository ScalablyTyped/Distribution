package typings.blueprintjsCore.mod

import typings.blueprintjsCore.navbarGroupMod.NavbarGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "NavbarGroup")
@js.native
open class NavbarGroup protected ()
  extends typings.blueprintjsCore.componentsMod.NavbarGroup {
  def this(props: NavbarGroupProps) = this()
  def this(props: NavbarGroupProps, context: Any) = this()
}
/* static members */
object NavbarGroup {
  
  @JSImport("@blueprintjs/core", "NavbarGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "NavbarGroup.defaultProps")
  @js.native
  def defaultProps: NavbarGroupProps = js.native
  inline def defaultProps_=(x: NavbarGroupProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "NavbarGroup.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
