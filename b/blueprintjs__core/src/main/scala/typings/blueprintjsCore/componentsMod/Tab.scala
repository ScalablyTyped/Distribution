package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.anon.PartialITabProps
import typings.blueprintjsCore.tabMod.ITabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Tab")
@js.native
class Tab protected ()
  extends typings.blueprintjsCore.tabMod.Tab {
  def this(props: ITabProps) = this()
  def this(props: ITabProps, context: js.Any) = this()
}
/* static members */
object Tab {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tab")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tab.defaultProps")
  @js.native
  def defaultProps: PartialITabProps = js.native
  inline def defaultProps_=(x: PartialITabProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tab.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
