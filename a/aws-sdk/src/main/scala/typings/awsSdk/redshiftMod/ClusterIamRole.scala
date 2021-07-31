package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterIamRole extends StObject {
  
  /**
    * A value that describes the status of the IAM role's association with an Amazon Redshift cluster. The following are possible statuses and descriptions.    in-sync: The role is available for use by the cluster.    adding: The role is in the process of being associated with the cluster.    removing: The role is in the process of being disassociated with the cluster.  
    */
  var ApplyStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role, for example, arn:aws:iam::123456789012:role/RedshiftCopyUnload. 
    */
  var IamRoleArn: js.UndefOr[String] = js.undefined
}
object ClusterIamRole {
  
  @scala.inline
  def apply(): ClusterIamRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterIamRole]
  }
  
  @scala.inline
  implicit class ClusterIamRoleMutableBuilder[Self <: ClusterIamRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyStatus(value: String): Self = StObject.set(x, "ApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyStatusUndefined: Self = StObject.set(x, "ApplyStatus", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: String): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
  }
}
