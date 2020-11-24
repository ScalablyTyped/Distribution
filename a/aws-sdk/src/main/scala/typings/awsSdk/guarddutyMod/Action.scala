package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
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
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionType(value: String): Self = this.set("ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("ActionType", js.undefined)
    
    @scala.inline
    def setAwsApiCallAction(value: AwsApiCallAction): Self = this.set("AwsApiCallAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsApiCallAction: Self = this.set("AwsApiCallAction", js.undefined)
    
    @scala.inline
    def setDnsRequestAction(value: DnsRequestAction): Self = this.set("DnsRequestAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsRequestAction: Self = this.set("DnsRequestAction", js.undefined)
    
    @scala.inline
    def setNetworkConnectionAction(value: NetworkConnectionAction): Self = this.set("NetworkConnectionAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkConnectionAction: Self = this.set("NetworkConnectionAction", js.undefined)
    
    @scala.inline
    def setPortProbeAction(value: PortProbeAction): Self = this.set("PortProbeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortProbeAction: Self = this.set("PortProbeAction", js.undefined)
  }
}
