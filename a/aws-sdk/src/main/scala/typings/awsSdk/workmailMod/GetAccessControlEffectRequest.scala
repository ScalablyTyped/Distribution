package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessControlEffectRequest extends StObject {
  
  /**
    * The access protocol action. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var Action: AccessControlRuleAction = js.native
  
  /**
    * The IPv4 address.
    */
  var IpAddress: typings.awsSdk.workmailMod.IpAddress = js.native
  
  /**
    * The identifier for the organization.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  
  /**
    * The user ID.
    */
  var UserId: WorkMailIdentifier = js.native
}
object GetAccessControlEffectRequest {
  
  @scala.inline
  def apply(
    Action: AccessControlRuleAction,
    IpAddress: IpAddress,
    OrganizationId: OrganizationId,
    UserId: WorkMailIdentifier
  ): GetAccessControlEffectRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessControlEffectRequest]
  }
  
  @scala.inline
  implicit class GetAccessControlEffectRequestMutableBuilder[Self <: GetAccessControlEffectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: AccessControlRuleAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: WorkMailIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
