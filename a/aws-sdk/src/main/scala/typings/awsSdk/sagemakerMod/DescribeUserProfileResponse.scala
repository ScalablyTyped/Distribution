package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserProfileResponse extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.sagemakerMod.CreationTime] = js.native
  
  /**
    * The ID of the domain that contains the profile.
    */
  var DomainId: js.UndefOr[typings.awsSdk.sagemakerMod.DomainId] = js.native
  
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The ID of the user's profile in the Amazon Elastic File System (EFS) volume.
    */
  var HomeEfsFileSystemUid: js.UndefOr[EfsUid] = js.native
  
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[typings.awsSdk.sagemakerMod.LastModifiedTime] = js.native
  
  /**
    * The SSO user identifier.
    */
  var SingleSignOnUserIdentifier: js.UndefOr[typings.awsSdk.sagemakerMod.SingleSignOnUserIdentifier] = js.native
  
  /**
    * The SSO user value.
    */
  var SingleSignOnUserValue: js.UndefOr[String256] = js.native
  
  /**
    * The status.
    */
  var Status: js.UndefOr[UserProfileStatus] = js.native
  
  /**
    * The user profile Amazon Resource Name (ARN).
    */
  var UserProfileArn: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileArn] = js.native
  
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileName] = js.native
  
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typings.awsSdk.sagemakerMod.UserSettings] = js.native
}
object DescribeUserProfileResponse {
  
  @scala.inline
  def apply(): DescribeUserProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserProfileResponse]
  }
  
  @scala.inline
  implicit class DescribeUserProfileResponseMutableBuilder[Self <: DescribeUserProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setHomeEfsFileSystemUid(value: EfsUid): Self = StObject.set(x, "HomeEfsFileSystemUid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeEfsFileSystemUidUndefined: Self = StObject.set(x, "HomeEfsFileSystemUid", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: LastModifiedTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setSingleSignOnUserIdentifier(value: SingleSignOnUserIdentifier): Self = StObject.set(x, "SingleSignOnUserIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleSignOnUserIdentifierUndefined: Self = StObject.set(x, "SingleSignOnUserIdentifier", js.undefined)
    
    @scala.inline
    def setSingleSignOnUserValue(value: String256): Self = StObject.set(x, "SingleSignOnUserValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleSignOnUserValueUndefined: Self = StObject.set(x, "SingleSignOnUserValue", js.undefined)
    
    @scala.inline
    def setStatus(value: UserProfileStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUserProfileArn(value: UserProfileArn): Self = StObject.set(x, "UserProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileArnUndefined: Self = StObject.set(x, "UserProfileArn", js.undefined)
    
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileNameUndefined: Self = StObject.set(x, "UserProfileName", js.undefined)
    
    @scala.inline
    def setUserSettings(value: UserSettings): Self = StObject.set(x, "UserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettingsUndefined: Self = StObject.set(x, "UserSettings", js.undefined)
  }
}
