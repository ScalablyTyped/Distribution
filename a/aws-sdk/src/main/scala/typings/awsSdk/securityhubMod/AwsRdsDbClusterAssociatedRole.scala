package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbClusterAssociatedRole extends StObject {
  
  /**
    * The ARN of the IAM role.
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the association between the IAM role and the DB cluster.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbClusterAssociatedRole {
  
  @scala.inline
  def apply(): AwsRdsDbClusterAssociatedRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbClusterAssociatedRole]
  }
  
  @scala.inline
  implicit class AwsRdsDbClusterAssociatedRoleMutableBuilder[Self <: AwsRdsDbClusterAssociatedRole] (val x: Self) extends AnyVal {
    
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
