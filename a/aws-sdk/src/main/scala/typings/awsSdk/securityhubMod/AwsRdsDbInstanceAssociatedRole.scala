package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbInstanceAssociatedRole extends js.Object {
  
  /**
    * The name of the feature associated with the IAM)role.
    */
  var FeatureName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Describes the state of the association between the IAM role and the DB instance. The Status property returns one of the following values:    ACTIVE - The IAM role ARN is associated with the DB instance and can be used to access other AWS services on your behalf.    PENDING - The IAM role ARN is being associated with the DB instance.    INVALID - The IAM role ARN is associated with the DB instance. But the DB instance is unable to assume the IAM role in order to access other AWS services on your behalf.   
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbInstanceAssociatedRole {
  
  @scala.inline
  def apply(): AwsRdsDbInstanceAssociatedRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbInstanceAssociatedRole]
  }
  
  @scala.inline
  implicit class AwsRdsDbInstanceAssociatedRoleOps[Self <: AwsRdsDbInstanceAssociatedRole] (val x: Self) extends AnyVal {
    
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
    def setFeatureName(value: NonEmptyString): Self = this.set("FeatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureName: Self = this.set("FeatureName", js.undefined)
    
    @scala.inline
    def setRoleArn(value: NonEmptyString): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
