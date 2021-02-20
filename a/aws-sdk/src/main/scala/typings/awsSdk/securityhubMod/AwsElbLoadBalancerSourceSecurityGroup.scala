package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerSourceSecurityGroup extends StObject {
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The owner of the security group.
    */
  var OwnerAlias: js.UndefOr[NonEmptyString] = js.native
}
object AwsElbLoadBalancerSourceSecurityGroup {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerSourceSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerSourceSecurityGroup]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerSourceSecurityGroupMutableBuilder[Self <: AwsElbLoadBalancerSourceSecurityGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: NonEmptyString): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setOwnerAlias(value: NonEmptyString): Self = StObject.set(x, "OwnerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAliasUndefined: Self = StObject.set(x, "OwnerAlias", js.undefined)
  }
}
