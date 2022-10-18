package typings.blueprintjsCore.mod

import typings.blueprintjsCore.anon.PartialTabProps
import typings.blueprintjsCore.libEsmComponentsTabsTabMod.TabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Tab")
@js.native
open class Tab protected ()
  extends typings.blueprintjsCore.libEsmComponentsMod.Tab {
  def this(props: TabProps) = this()
  def this(props: TabProps, context: Any) = this()
}
/* static members */
object Tab {
  
  @JSImport("@blueprintjs/core", "Tab")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Tab.defaultProps")
  @js.native
  def defaultProps: PartialTabProps = js.native
  inline def defaultProps_=(x: PartialTabProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Tab.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
