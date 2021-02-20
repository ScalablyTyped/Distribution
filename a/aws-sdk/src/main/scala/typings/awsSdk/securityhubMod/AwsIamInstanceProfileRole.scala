package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamInstanceProfileRole extends StObject {
  
  /**
    * The ARN of the role.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The policy that grants an entity permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument] = js.native
  
  /**
    * Indicates when the role was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The path to the role.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the role.
    */
  var RoleId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the role.
    */
  var RoleName: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamInstanceProfileRole {
  
  @scala.inline
  def apply(): AwsIamInstanceProfileRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamInstanceProfileRole]
  }
  
  @scala.inline
  implicit class AwsIamInstanceProfileRoleMutableBuilder[Self <: AwsIamInstanceProfileRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAssumeRolePolicyDocument(value: AwsIamRoleAssumeRolePolicyDocument): Self = StObject.set(x, "AssumeRolePolicyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssumeRolePolicyDocumentUndefined: Self = StObject.set(x, "AssumeRolePolicyDocument", js.undefined)
    
    @scala.inline
    def setCreateDate(value: NonEmptyString): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setRoleId(value: NonEmptyString): Self = StObject.set(x, "RoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleIdUndefined: Self = StObject.set(x, "RoleId", js.undefined)
    
    @scala.inline
    def setRoleName(value: NonEmptyString): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
  }
}
