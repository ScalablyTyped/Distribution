package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserProfileResult extends StObject {
  
  /**
    * The date the user profile was created, in timestamp format.
    */
  var createdTimestamp: js.UndefOr[CreatedTimestamp] = js.undefined
  
  /**
    * The name that is displayed as the friendly name for the user in AWS CodeStar.
    */
  var displayName: js.UndefOr[UserProfileDisplayName] = js.undefined
  
  /**
    * The email address that is displayed as part of the user's profile in AWS CodeStar.
    */
  var emailAddress: js.UndefOr[Email] = js.undefined
  
  /**
    * The date the user profile was last modified, in timestamp format.
    */
  var lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp] = js.undefined
  
  /**
    * The SSH public key associated with the user in AWS CodeStar. This is the public portion of the public/private keypair the user can use to access project resources if a project owner allows the user remote access to those resources.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user in IAM.
    */
  var userArn: UserArn
}
object UpdateUserProfileResult {
  
  @scala.inline
  def apply(userArn: UserArn): UpdateUserProfileResult = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserProfileResult]
  }
  
  @scala.inline
  implicit class UpdateUserProfileResultMutableBuilder[Self <: UpdateUserProfileResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTimestamp(value: CreatedTimestamp): Self = StObject.set(x, "createdTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "createdTimestamp", js.undefined)
    
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
    def setLastModifiedTimestampUndefined: Self = StObject.set(x, "lastModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setSshPublicKey(value: SshPublicKey): Self = StObject.set(x, "sshPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeyUndefined: Self = StObject.set(x, "sshPublicKey", js.undefined)
    
    @scala.inline
    def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
