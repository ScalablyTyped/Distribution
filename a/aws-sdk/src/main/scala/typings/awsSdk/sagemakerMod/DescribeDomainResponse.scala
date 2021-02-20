package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainResponse extends StObject {
  
  /**
    * Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.    PublicInternetOnly - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows direct internet access    VpcOnly - All Studio traffic is through the specified VPC and subnets  
    */
  var AppNetworkAccessType: js.UndefOr[typings.awsSdk.sagemakerMod.AppNetworkAccessType] = js.native
  
  /**
    * The domain's authentication mode.
    */
  var AuthMode: js.UndefOr[typings.awsSdk.sagemakerMod.AuthMode] = js.native
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.sagemakerMod.CreationTime] = js.native
  
  /**
    * Settings which are applied to all UserProfiles in this domain, if settings are not explicitly specified in a given UserProfile. 
    */
  var DefaultUserSettings: js.UndefOr[UserSettings] = js.native
  
  /**
    * The domain's Amazon Resource Name (ARN).
    */
  var DomainArn: js.UndefOr[typings.awsSdk.sagemakerMod.DomainArn] = js.native
  
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typings.awsSdk.sagemakerMod.DomainId] = js.native
  
  /**
    * The domain name.
    */
  var DomainName: js.UndefOr[typings.awsSdk.sagemakerMod.DomainName] = js.native
  
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
    */
  var HomeEfsFileSystemId: js.UndefOr[ResourceId] = js.native
  
  /**
    * This member is deprecated and replaced with KmsKeyId.
    */
  var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  
  /**
    * The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.native
  
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[typings.awsSdk.sagemakerMod.LastModifiedTime] = js.native
  
  /**
    * The SSO managed application instance ID.
    */
  var SingleSignOnManagedApplicationInstanceId: js.UndefOr[String256] = js.native
  
  /**
    * The status.
    */
  var Status: js.UndefOr[DomainStatus] = js.native
  
  /**
    * The VPC subnets that Studio uses for communication.
    */
  var SubnetIds: js.UndefOr[Subnets] = js.native
  
  /**
    * The domain's URL.
    */
  var Url: js.UndefOr[String1024] = js.native
  
  /**
    * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
    */
  var VpcId: js.UndefOr[typings.awsSdk.sagemakerMod.VpcId] = js.native
}
object DescribeDomainResponse {
  
  @scala.inline
  def apply(): DescribeDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainResponse]
  }
  
  @scala.inline
  implicit class DescribeDomainResponseMutableBuilder[Self <: DescribeDomainResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppNetworkAccessType(value: AppNetworkAccessType): Self = StObject.set(x, "AppNetworkAccessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppNetworkAccessTypeUndefined: Self = StObject.set(x, "AppNetworkAccessType", js.undefined)
    
    @scala.inline
    def setAuthMode(value: AuthMode): Self = StObject.set(x, "AuthMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthModeUndefined: Self = StObject.set(x, "AuthMode", js.undefined)
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDefaultUserSettings(value: UserSettings): Self = StObject.set(x, "DefaultUserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUserSettingsUndefined: Self = StObject.set(x, "DefaultUserSettings", js.undefined)
    
    @scala.inline
    def setDomainArn(value: DomainArn): Self = StObject.set(x, "DomainArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainArnUndefined: Self = StObject.set(x, "DomainArn", js.undefined)
    
    @scala.inline
    def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setHomeEfsFileSystemId(value: ResourceId): Self = StObject.set(x, "HomeEfsFileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeEfsFileSystemIdUndefined: Self = StObject.set(x, "HomeEfsFileSystemId", js.undefined)
    
    @scala.inline
    def setHomeEfsFileSystemKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "HomeEfsFileSystemKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeEfsFileSystemKmsKeyIdUndefined: Self = StObject.set(x, "HomeEfsFileSystemKmsKeyId", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: LastModifiedTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setSingleSignOnManagedApplicationInstanceId(value: String256): Self = StObject.set(x, "SingleSignOnManagedApplicationInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleSignOnManagedApplicationInstanceIdUndefined: Self = StObject.set(x, "SingleSignOnManagedApplicationInstanceId", js.undefined)
    
    @scala.inline
    def setStatus(value: DomainStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: Subnets): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String1024): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
