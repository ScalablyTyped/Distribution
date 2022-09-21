package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteControlPanelRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the control panel.
    */
  var ControlPanelArn: string
}
object DeleteControlPanelRequest {
  
  inline def apply(ControlPanelArn: string): DeleteControlPanelRequest = {
    val __obj = js.Dynamic.literal(ControlPanelArn = ControlPanelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteControlPanelRequest]
  }
  
  extension [Self <: DeleteControlPanelRequest](x: Self) {
    
    inline def setControlPanelArn(value: string): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
  }
}
