package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserProfileResult extends StObject {
  
  /**
    * The date and time when the user profile was created in AWS CodeStar, in timestamp format.
    */
  var createdTimestamp: CreatedTimestamp
  
  /**
    * The display name shown for the user in AWS CodeStar projects. For example, this could be set to both first and last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first character that appears after the space will be used as the second character in the user initial icon. The initial icon displays a maximum of two characters, so a display name with more than one space (for example "Mary Jane Major") would generate an initial icon using the first character and the first character after the space ("MJ", not "MM").
    */
  var displayName: js.UndefOr[UserProfileDisplayName] = js.undefined
  
  /**
    * The email address for the user. Optional.
    */
  var emailAddress: js.UndefOr[Email] = js.undefined
  
  /**
    * The date and time when the user profile was last modified, in timestamp format.
    */
  var lastModifiedTimestamp: LastModifiedTimestamp
  
  /**
    * The SSH public key associated with the user. This SSH public key is associated with the user profile, and can be used in conjunction with the associated private key for access to project resources, such as Amazon EC2 instances, if a project owner grants remote access to those resources.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var userArn: UserArn
}
object DescribeUserProfileResult {
  
  @scala.inline
  def apply(createdTimestamp: CreatedTimestamp, lastModifiedTimestamp: LastModifiedTimestamp, userArn: UserArn): DescribeUserProfileResult = {
    val __obj = js.Dynamic.literal(createdTimestamp = createdTimestamp.asInstanceOf[js.Any], lastModifiedTimestamp = lastModifiedTimestamp.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserProfileResult]
  }
  
  @scala.inline
  implicit class DescribeUserProfileResultMutableBuilder[Self <: DescribeUserProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTimestamp(value: CreatedTimestamp): Self = StObject.set(x, "createdTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: UserProfileDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: Email): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setLastModifiedTimestamp(value: LastModifiedTimestamp): Self = StObject.set(x, "lastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKey(value: SshPublicKey): Self = StObject.set(x, "sshPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeyUndefined: Self = StObject.set(x, "sshPublicKey", js.undefined)
    
    @scala.inline
    def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
