package typings.blueprintjsCore.mod

import typings.blueprintjsCore.anon.TypeofNavbarDivider
import typings.blueprintjsCore.anon.TypeofNavbarGroup
import typings.blueprintjsCore.anon.TypeofNavbarHeading
import typings.blueprintjsCore.navbarMod.INavbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Navbar")
@js.native
class Navbar protected ()
  extends typings.blueprintjsCore.componentsMod.Navbar {
  def this(props: INavbarProps) = this()
  def this(props: INavbarProps, context: js.Any) = this()
}
/* static members */
object Navbar {
  
  @JSImport("@blueprintjs/core", "Navbar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Navbar.Divider")
  @js.native
  def Divider: TypeofNavbarDivider = js.native
  @scala.inline
  def Divider_=(x: TypeofNavbarDivider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Navbar.Group")
  @js.native
  def Group: TypeofNavbarGroup = js.native
  @scala.inline
  def Group_=(x: TypeofNavbarGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Navbar.Heading")
  @js.native
  def Heading: TypeofNavbarHeading = js.native
  @scala.inline
  def Heading_=(x: TypeofNavbarHeading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Heading")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Navbar.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
