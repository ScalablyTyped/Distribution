package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingControl extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the control panel that includes the routing control.
    */
  var ControlPanelArn: js.UndefOr[stringMin1Max256PatternAZaZ09] = js.undefined
  
  /**
    * The name of the routing control.
    */
  var Name: js.UndefOr[stringMin1Max64PatternS] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the routing control.
    */
  var RoutingControlArn: js.UndefOr[stringMin1Max256PatternAZaZ09] = js.undefined
  
  /**
    * The deployment status of a routing control. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
    */
  var Status: js.UndefOr[typings.awsSdk.route53recoverycontrolconfigMod.Status] = js.undefined
}
object RoutingControl {
  
  inline def apply(): RoutingControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingControl]
  }
  
  extension [Self <: RoutingControl](x: Self) {
    
    inline def setControlPanelArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
    
    inline def setControlPanelArnUndefined: Self = StObject.set(x, "ControlPanelArn", js.undefined)
    
    inline def setName(value: stringMin1Max64PatternS): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoutingControlArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "RoutingControlArn", value.asInstanceOf[js.Any])
    
    inline def setRoutingControlArnUndefined: Self = StObject.set(x, "RoutingControlArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
