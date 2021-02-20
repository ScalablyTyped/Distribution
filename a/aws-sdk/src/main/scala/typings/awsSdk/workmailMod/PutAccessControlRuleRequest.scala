package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAccessControlRuleRequest extends StObject {
  
  /**
    * Access protocol actions to include in the rule. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var Actions: js.UndefOr[ActionsList] = js.native
  
  /**
    * The rule description.
    */
  var Description: AccessControlRuleDescription = js.native
  
  /**
    * The rule effect.
    */
  var Effect: AccessControlRuleEffect = js.native
  
  /**
    * IPv4 CIDR ranges to include in the rule.
    */
  var IpRanges: js.UndefOr[IpRangeList] = js.native
  
  /**
    * The rule name.
    */
  var Name: AccessControlRuleName = js.native
  
  /**
    * Access protocol actions to exclude from the rule. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var NotActions: js.UndefOr[ActionsList] = js.native
  
  /**
    * IPv4 CIDR ranges to exclude from the rule.
    */
  var NotIpRanges: js.UndefOr[IpRangeList] = js.native
  
  /**
    * User IDs to exclude from the rule.
    */
  var NotUserIds: js.UndefOr[UserIdList] = js.native
  
  /**
    * The identifier of the organization.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  
  /**
    * User IDs to include in the rule.
    */
  var UserIds: js.UndefOr[UserIdList] = js.native
}
object PutAccessControlRuleRequest {
  
  @scala.inline
  def apply(
    Description: AccessControlRuleDescription,
    Effect: AccessControlRuleEffect,
    Name: AccessControlRuleName,
    OrganizationId: OrganizationId
  ): PutAccessControlRuleRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccessControlRuleRequest]
  }
  
  @scala.inline
  implicit class PutAccessControlRuleRequestMutableBuilder[Self <: PutAccessControlRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: ActionsList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: AccessControlRuleAction*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: AccessControlRuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: AccessControlRuleEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpRanges(value: IpRangeList): Self = StObject.set(x, "IpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpRangesUndefined: Self = StObject.set(x, "IpRanges", js.undefined)
    
    @scala.inline
    def setIpRangesVarargs(value: IpRange*): Self = StObject.set(x, "IpRanges", js.Array(value :_*))
    
    @scala.inline
    def setName(value: AccessControlRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotActions(value: ActionsList): Self = StObject.set(x, "NotActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotActionsUndefined: Self = StObject.set(x, "NotActions", js.undefined)
    
    @scala.inline
    def setNotActionsVarargs(value: AccessControlRuleAction*): Self = StObject.set(x, "NotActions", js.Array(value :_*))
    
    @scala.inline
    def setNotIpRanges(value: IpRangeList): Self = StObject.set(x, "NotIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotIpRangesUndefined: Self = StObject.set(x, "NotIpRanges", js.undefined)
    
    @scala.inline
    def setNotIpRangesVarargs(value: IpRange*): Self = StObject.set(x, "NotIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setNotUserIds(value: UserIdList): Self = StObject.set(x, "NotUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUserIdsUndefined: Self = StObject.set(x, "NotUserIds", js.undefined)
    
    @scala.inline
    def setNotUserIdsVarargs(value: WorkMailIdentifier*): Self = StObject.set(x, "NotUserIds", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIds(value: UserIdList): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
    
    @scala.inline
    def setUserIdsVarargs(value: WorkMailIdentifier*): Self = StObject.set(x, "UserIds", js.Array(value :_*))
  }
}
