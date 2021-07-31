package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.alertMod.IAlertProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Alert")
@js.native
class Alert protected ()
  extends typings.blueprintjsCore.alertMod.Alert {
  def this(props: IAlertProps) = this()
  def this(props: IAlertProps, context: js.Any) = this()
}
/* static members */
object Alert {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Alert")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Alert.defaultProps")
  @js.native
  def defaultProps: IAlertProps = js.native
  @scala.inline
  def defaultProps_=(x: IAlertProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Alert.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
