package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserProfileResponse extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the domain that contains the profile.
    */
  var DomainId: js.UndefOr[typings.awsSdk.sagemakerMod.DomainId] = js.undefined
  
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.undefined
  
  /**
    * The ID of the user's profile in the Amazon Elastic File System (EFS) volume.
    */
  var HomeEfsFileSystemUid: js.UndefOr[EfsUid] = js.undefined
  
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The IAM Identity Center user identifier.
    */
  var SingleSignOnUserIdentifier: js.UndefOr[typings.awsSdk.sagemakerMod.SingleSignOnUserIdentifier] = js.undefined
  
  /**
    * The IAM Identity Center user value.
    */
  var SingleSignOnUserValue: js.UndefOr[String256] = js.undefined
  
  /**
    * The status.
    */
  var Status: js.UndefOr[UserProfileStatus] = js.undefined
  
  /**
    * The user profile Amazon Resource Name (ARN).
    */
  var UserProfileArn: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileArn] = js.undefined
  
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileName] = js.undefined
  
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typings.awsSdk.sagemakerMod.UserSettings] = js.undefined
}
object DescribeUserProfileResponse {
  
  inline def apply(): DescribeUserProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserProfileResponse]
  }
  
  extension [Self <: DescribeUserProfileResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setHomeEfsFileSystemUid(value: EfsUid): Self = StObject.set(x, "HomeEfsFileSystemUid", value.asInstanceOf[js.Any])
    
    inline def setHomeEfsFileSystemUidUndefined: Self = StObject.set(x, "HomeEfsFileSystemUid", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSingleSignOnUserIdentifier(value: SingleSignOnUserIdentifier): Self = StObject.set(x, "SingleSignOnUserIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSingleSignOnUserIdentifierUndefined: Self = StObject.set(x, "SingleSignOnUserIdentifier", js.undefined)
    
    inline def setSingleSignOnUserValue(value: String256): Self = StObject.set(x, "SingleSignOnUserValue", value.asInstanceOf[js.Any])
    
    inline def setSingleSignOnUserValueUndefined: Self = StObject.set(x, "SingleSignOnUserValue", js.undefined)
    
    inline def setStatus(value: UserProfileStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserProfileArn(value: UserProfileArn): Self = StObject.set(x, "UserProfileArn", value.asInstanceOf[js.Any])
    
    inline def setUserProfileArnUndefined: Self = StObject.set(x, "UserProfileArn", js.undefined)
    
    inline def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    inline def setUserProfileNameUndefined: Self = StObject.set(x, "UserProfileName", js.undefined)
    
    inline def setUserSettings(value: UserSettings): Self = StObject.set(x, "UserSettings", value.asInstanceOf[js.Any])
    
    inline def setUserSettingsUndefined: Self = StObject.set(x, "UserSettings", js.undefined)
  }
}
