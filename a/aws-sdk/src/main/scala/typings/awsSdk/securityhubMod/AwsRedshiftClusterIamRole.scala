package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterIamRole extends js.Object {
  
  /**
    * The status of the IAM role's association with the cluster. Valid values: in-sync | adding | removing 
    */
  var ApplyStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN of the IAM role.
    */
  var IamRoleArn: js.UndefOr[NonEmptyString] = js.native
}
object AwsRedshiftClusterIamRole {
  
  @scala.inline
  def apply(): AwsRedshiftClusterIamRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterIamRole]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterIamRoleOps[Self <: AwsRedshiftClusterIamRole] (val x: Self) extends AnyVal {
    
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
    def setApplyStatus(value: NonEmptyString): Self = this.set("ApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyStatus: Self = this.set("ApplyStatus", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: NonEmptyString): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
  }
}
