package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbInstanceVpcSecurityGroup extends js.Object {
  
  /**
    * The status of the VPC security group.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the VPC security group.
    */
  var VpcSecurityGroupId: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbInstanceVpcSecurityGroup {
  
  @scala.inline
  def apply(): AwsRdsDbInstanceVpcSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbInstanceVpcSecurityGroup]
  }
  
  @scala.inline
  implicit class AwsRdsDbInstanceVpcSecurityGroupOps[Self <: AwsRdsDbInstanceVpcSecurityGroup] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupId(value: NonEmptyString): Self = this.set("VpcSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroupId: Self = this.set("VpcSecurityGroupId", js.undefined)
  }
}
