package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamInstanceProfile extends StObject {
  
  /**
    * The ARN of the instance profile.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the instance profile was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the instance profile.
    */
  var InstanceProfileId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the instance profile.
    */
  var InstanceProfileName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The path to the instance profile.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The roles associated with the instance profile.
    */
  var Roles: js.UndefOr[AwsIamInstanceProfileRoles] = js.native
}
object AwsIamInstanceProfile {
  
  @scala.inline
  def apply(): AwsIamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamInstanceProfile]
  }
  
  @scala.inline
  implicit class AwsIamInstanceProfileMutableBuilder[Self <: AwsIamInstanceProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreateDate(value: NonEmptyString): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setInstanceProfileId(value: NonEmptyString): Self = StObject.set(x, "InstanceProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileIdUndefined: Self = StObject.set(x, "InstanceProfileId", js.undefined)
    
    @scala.inline
    def setInstanceProfileName(value: NonEmptyString): Self = StObject.set(x, "InstanceProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileNameUndefined: Self = StObject.set(x, "InstanceProfileName", js.undefined)
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setRoles(value: AwsIamInstanceProfileRoles): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: AwsIamInstanceProfileRole*): Self = StObject.set(x, "Roles", js.Array(value :_*))
  }
}
