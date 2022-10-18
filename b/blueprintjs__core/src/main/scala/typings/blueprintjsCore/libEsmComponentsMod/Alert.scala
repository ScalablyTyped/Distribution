package typings.blueprintjsCore.libEsmComponentsMod

import typings.blueprintjsCore.libEsmComponentsAlertAlertMod.AlertProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Alert")
@js.native
open class Alert protected ()
  extends typings.blueprintjsCore.libEsmComponentsAlertAlertMod.Alert {
  def this(props: AlertProps) = this()
  def this(props: AlertProps, context: Any) = this()
}
/* static members */
object Alert {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Alert")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Alert.defaultProps")
  @js.native
  def defaultProps: AlertProps = js.native
  inline def defaultProps_=(x: AlertProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Alert.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
