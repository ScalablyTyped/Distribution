package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.drawerMod.IDrawerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Drawer")
@js.native
class Drawer protected ()
  extends typings.blueprintjsCore.drawerMod.Drawer {
  def this(props: IDrawerProps) = this()
  def this(props: IDrawerProps, context: js.Any) = this()
}
/* static members */
object Drawer {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Drawer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Drawer.SIZE_LARGE")
  @js.native
  val SIZE_LARGE: /* "90%" */ String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Drawer.SIZE_SMALL")
  @js.native
  val SIZE_SMALL: /* "360px" */ String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Drawer.SIZE_STANDARD")
  @js.native
  val SIZE_STANDARD: /* "50%" */ String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Drawer.defaultProps")
  @js.native
  def defaultProps: IDrawerProps = js.native
  @scala.inline
  def defaultProps_=(x: IDrawerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Drawer.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
