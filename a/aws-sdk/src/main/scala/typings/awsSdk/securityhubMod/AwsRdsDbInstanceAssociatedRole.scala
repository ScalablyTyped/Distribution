package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbInstanceAssociatedRole extends StObject {
  
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
  implicit class AwsRdsDbInstanceAssociatedRoleMutableBuilder[Self <: AwsRdsDbInstanceAssociatedRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatureName(value: NonEmptyString): Self = StObject.set(x, "FeatureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureNameUndefined: Self = StObject.set(x, "FeatureName", js.undefined)
    
    @scala.inline
    def setRoleArn(value: NonEmptyString): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
