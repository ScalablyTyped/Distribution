package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserProfileRequest extends js.Object {
  
  /**
    * The ID of the associated Domain.
    */
  var DomainId: typings.awsSdk.sagemakerMod.DomainId = js.native
  
  /**
    * A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified. 
    */
  var SingleSignOnUserIdentifier: js.UndefOr[typings.awsSdk.sagemakerMod.SingleSignOnUserIdentifier] = js.native
  
  /**
    * The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified. 
    */
  var SingleSignOnUserValue: js.UndefOr[String256] = js.native
  
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * A name for the UserProfile.
    */
  var UserProfileName: typings.awsSdk.sagemakerMod.UserProfileName = js.native
  
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typings.awsSdk.sagemakerMod.UserSettings] = js.native
}
object CreateUserProfileRequest {
  
  @scala.inline
  def apply(DomainId: DomainId, UserProfileName: UserProfileName): CreateUserProfileRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserProfileRequest]
  }
  
  @scala.inline
  implicit class CreateUserProfileRequestOps[Self <: CreateUserProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = this.set("UserProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleSignOnUserIdentifier(value: SingleSignOnUserIdentifier): Self = this.set("SingleSignOnUserIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleSignOnUserIdentifier: Self = this.set("SingleSignOnUserIdentifier", js.undefined)
    
    @scala.inline
    def setSingleSignOnUserValue(value: String256): Self = this.set("SingleSignOnUserValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleSignOnUserValue: Self = this.set("SingleSignOnUserValue", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setUserSettings(value: UserSettings): Self = this.set("UserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserSettings: Self = this.set("UserSettings", js.undefined)
  }
}
