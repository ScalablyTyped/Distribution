package typings.awsSdk.route53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateControlPanelRequest extends StObject {
  
  /**
    * A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an action, specify a client token in the request.
    */
  var ClientToken: js.UndefOr[stringMin1Max64PatternS] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the cluster for the control panel.
    */
  var ClusterArn: stringMin1Max256PatternAZaZ09
  
  /**
    * The name of the control panel.
    */
  var ControlPanelName: stringMin1Max64PatternS
  
  /**
    * The tags associated with the control panel.
    */
  var Tags: js.UndefOr[mapOfStringMin0Max256PatternS] = js.undefined
}
object CreateControlPanelRequest {
  
  inline def apply(ClusterArn: stringMin1Max256PatternAZaZ09, ControlPanelName: stringMin1Max64PatternS): CreateControlPanelRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], ControlPanelName = ControlPanelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateControlPanelRequest]
  }
  
  extension [Self <: CreateControlPanelRequest](x: Self) {
    
    inline def setClientToken(value: stringMin1Max64PatternS): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setClusterArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setControlPanelName(value: stringMin1Max64PatternS): Self = StObject.set(x, "ControlPanelName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfStringMin0Max256PatternS): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
