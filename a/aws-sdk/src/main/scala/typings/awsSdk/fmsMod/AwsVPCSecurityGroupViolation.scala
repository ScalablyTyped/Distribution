package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsVPCSecurityGroupViolation extends StObject {
  
  /**
    * List of rules specified in the security group of the AWS Firewall Manager policy that partially match the ViolationTarget rule.
    */
  var PartialMatches: js.UndefOr[typings.awsSdk.fmsMod.PartialMatches] = js.native
  
  /**
    * Remediation options for the rule specified in the ViolationTarget.
    */
  var PossibleSecurityGroupRemediationActions: js.UndefOr[SecurityGroupRemediationActions] = js.native
  
  /**
    * The security group rule that is being evaluated.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.fmsMod.ViolationTarget] = js.native
  
  /**
    * A description of the security group that violates the policy.
    */
  var ViolationTargetDescription: js.UndefOr[LengthBoundedString] = js.native
}
object AwsVPCSecurityGroupViolation {
  
  @scala.inline
  def apply(): AwsVPCSecurityGroupViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsVPCSecurityGroupViolation]
  }
  
  @scala.inline
  implicit class AwsVPCSecurityGroupViolationMutableBuilder[Self <: AwsVPCSecurityGroupViolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartialMatches(value: PartialMatches): Self = StObject.set(x, "PartialMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialMatchesUndefined: Self = StObject.set(x, "PartialMatches", js.undefined)
    
    @scala.inline
    def setPartialMatchesVarargs(value: PartialMatch*): Self = StObject.set(x, "PartialMatches", js.Array(value :_*))
    
    @scala.inline
    def setPossibleSecurityGroupRemediationActions(value: SecurityGroupRemediationActions): Self = StObject.set(x, "PossibleSecurityGroupRemediationActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossibleSecurityGroupRemediationActionsUndefined: Self = StObject.set(x, "PossibleSecurityGroupRemediationActions", js.undefined)
    
    @scala.inline
    def setPossibleSecurityGroupRemediationActionsVarargs(value: SecurityGroupRemediationAction*): Self = StObject.set(x, "PossibleSecurityGroupRemediationActions", js.Array(value :_*))
    
    @scala.inline
    def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationTargetDescription(value: LengthBoundedString): Self = StObject.set(x, "ViolationTargetDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationTargetDescriptionUndefined: Self = StObject.set(x, "ViolationTargetDescription", js.undefined)
    
    @scala.inline
    def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
