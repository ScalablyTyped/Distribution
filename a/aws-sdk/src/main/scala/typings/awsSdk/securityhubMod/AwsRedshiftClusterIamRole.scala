package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterIamRole extends StObject {
  
  /**
    * The status of the IAM role's association with the cluster. Valid values: in-sync | adding | removing 
    */
  var ApplyStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the IAM role.
    */
  var IamRoleArn: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterIamRole {
  
  @scala.inline
  def apply(): AwsRedshiftClusterIamRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterIamRole]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterIamRoleMutableBuilder[Self <: AwsRedshiftClusterIamRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyStatus(value: NonEmptyString): Self = StObject.set(x, "ApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyStatusUndefined: Self = StObject.set(x, "ApplyStatus", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: NonEmptyString): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
  }
}
