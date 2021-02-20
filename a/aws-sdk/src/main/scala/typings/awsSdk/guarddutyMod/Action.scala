package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends StObject {
  
  /**
    * The GuardDuty finding activity type.
    */
  var ActionType: js.UndefOr[String] = js.native
  
  /**
    * Information about the AWS_API_CALL action described in this finding.
    */
  var AwsApiCallAction: js.UndefOr[typings.awsSdk.guarddutyMod.AwsApiCallAction] = js.native
  
  /**
    * Information about the DNS_REQUEST action described in this finding.
    */
  var DnsRequestAction: js.UndefOr[typings.awsSdk.guarddutyMod.DnsRequestAction] = js.native
  
  /**
    * Information about the NETWORK_CONNECTION action described in this finding.
    */
  var NetworkConnectionAction: js.UndefOr[typings.awsSdk.guarddutyMod.NetworkConnectionAction] = js.native
  
  /**
    * Information about the PORT_PROBE action described in this finding.
    */
  var PortProbeAction: js.UndefOr[typings.awsSdk.guarddutyMod.PortProbeAction] = js.native
}
object Action {
  
  @scala.inline
  def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: String): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    @scala.inline
    def setAwsApiCallAction(value: AwsApiCallAction): Self = StObject.set(x, "AwsApiCallAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsApiCallActionUndefined: Self = StObject.set(x, "AwsApiCallAction", js.undefined)
    
    @scala.inline
    def setDnsRequestAction(value: DnsRequestAction): Self = StObject.set(x, "DnsRequestAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsRequestActionUndefined: Self = StObject.set(x, "DnsRequestAction", js.undefined)
    
    @scala.inline
    def setNetworkConnectionAction(value: NetworkConnectionAction): Self = StObject.set(x, "NetworkConnectionAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConnectionActionUndefined: Self = StObject.set(x, "NetworkConnectionAction", js.undefined)
    
    @scala.inline
    def setPortProbeAction(value: PortProbeAction): Self = StObject.set(x, "PortProbeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortProbeActionUndefined: Self = StObject.set(x, "PortProbeAction", js.undefined)
  }
}
