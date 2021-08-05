package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserProfileRequest extends StObject {
  
  /**
    * The ID of the associated Domain.
    */
  var DomainId: typings.awsSdk.sagemakerMod.DomainId
  
  /**
    * A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified. 
    */
  var SingleSignOnUserIdentifier: js.UndefOr[typings.awsSdk.sagemakerMod.SingleSignOnUserIdentifier] = js.undefined
  
  /**
    * The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified. 
    */
  var SingleSignOnUserValue: js.UndefOr[String256] = js.undefined
  
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A name for the UserProfile.
    */
  var UserProfileName: typings.awsSdk.sagemakerMod.UserProfileName
  
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typings.awsSdk.sagemakerMod.UserSettings] = js.undefined
}
object CreateUserProfileRequest {
  
  inline def apply(DomainId: DomainId, UserProfileName: UserProfileName): CreateUserProfileRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserProfileRequest]
  }
  
  extension [Self <: CreateUserProfileRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setSingleSignOnUserIdentifier(value: SingleSignOnUserIdentifier): Self = StObject.set(x, "SingleSignOnUserIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSingleSignOnUserIdentifierUndefined: Self = StObject.set(x, "SingleSignOnUserIdentifier", js.undefined)
    
    inline def setSingleSignOnUserValue(value: String256): Self = StObject.set(x, "SingleSignOnUserValue", value.asInstanceOf[js.Any])
    
    inline def setSingleSignOnUserValueUndefined: Self = StObject.set(x, "SingleSignOnUserValue", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    inline def setUserSettings(value: UserSettings): Self = StObject.set(x, "UserSettings", value.asInstanceOf[js.Any])
    
    inline def setUserSettingsUndefined: Self = StObject.set(x, "UserSettings", js.undefined)
  }
}
