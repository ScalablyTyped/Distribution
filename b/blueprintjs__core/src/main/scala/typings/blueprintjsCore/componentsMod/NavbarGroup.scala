package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.navbarGroupMod.INavbarGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "NavbarGroup")
@js.native
class NavbarGroup protected ()
  extends typings.blueprintjsCore.navbarGroupMod.NavbarGroup {
  def this(props: INavbarGroupProps) = this()
  def this(props: INavbarGroupProps, context: js.Any) = this()
}
/* static members */
object NavbarGroup {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "NavbarGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "NavbarGroup.defaultProps")
  @js.native
  def defaultProps: INavbarGroupProps = js.native
  @scala.inline
  def defaultProps_=(x: INavbarGroupProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "NavbarGroup.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
