package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerSourceSecurityGroup extends js.Object {
  
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
  implicit class AwsElbLoadBalancerSourceSecurityGroupOps[Self <: AwsElbLoadBalancerSourceSecurityGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroupName(value: NonEmptyString): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    
    @scala.inline
    def setOwnerAlias(value: NonEmptyString): Self = this.set("OwnerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAlias: Self = this.set("OwnerAlias", js.undefined)
  }
}
