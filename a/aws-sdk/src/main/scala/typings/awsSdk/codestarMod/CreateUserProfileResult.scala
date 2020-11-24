package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserProfileResult extends js.Object {
  
  /**
    * The date the user profile was created, in timestamp format.
    */
  var createdTimestamp: js.UndefOr[CreatedTimestamp] = js.native
  
  /**
    * The name that is displayed as the friendly name for the user in AWS CodeStar.
    */
  var displayName: js.UndefOr[UserProfileDisplayName] = js.native
  
  /**
    * The email address that is displayed as part of the user's profile in AWS CodeStar.
    */
  var emailAddress: js.UndefOr[Email] = js.native
  
  /**
    * The date the user profile was last modified, in timestamp format.
    */
  var lastModifiedTimestamp: js.UndefOr[LastModifiedTimestamp] = js.native
  
  /**
    * The SSH public key associated with the user in AWS CodeStar. This is the public portion of the public/private keypair the user can use to access project resources if a project owner allows the user remote access to those resources.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the user in IAM.
    */
  var userArn: UserArn = js.native
}
object CreateUserProfileResult {
  
  @scala.inline
  def apply(userArn: UserArn): CreateUserProfileResult = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserProfileResult]
  }
  
  @scala.inline
  implicit class CreateUserProfileResultOps[Self <: CreateUserProfileResult] (val x: Self) extends AnyVal {
    
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
    def setUserArn(value: UserArn): Self = this.set("userArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestamp(value: CreatedTimestamp): Self = this.set("createdTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("createdTimestamp", js.undefined)
    
    @scala.inline
    def setDisplayName(value: UserProfileDisplayName): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: Email): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setLastModifiedTimestamp(value: LastModifiedTimestamp): Self = this.set("lastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTimestamp: Self = this.set("lastModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setSshPublicKey(value: SshPublicKey): Self = this.set("sshPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshPublicKey: Self = this.set("sshPublicKey", js.undefined)
  }
}
