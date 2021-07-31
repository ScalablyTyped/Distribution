package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainRequest extends StObject {
  
  /**
    * Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.    PublicInternetOnly - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows direct internet access    VpcOnly - All Studio traffic is through the specified VPC and subnets  
    */
  var AppNetworkAccessType: js.UndefOr[typings.awsSdk.sagemakerMod.AppNetworkAccessType] = js.undefined
  
  /**
    * The mode of authentication that members use to access the domain.
    */
  var AuthMode: typings.awsSdk.sagemakerMod.AuthMode
  
  /**
    * The default user settings.
    */
  var DefaultUserSettings: UserSettings
  
  /**
    * A name for the domain.
    */
  var DomainName: typings.awsSdk.sagemakerMod.DomainName
  
  /**
    * This member is deprecated and replaced with KmsKeyId.
    */
  var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key (CMK) by default. For more control, specify a customer managed CMK.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * The VPC subnets that Studio uses for communication.
    */
  var SubnetIds: Subnets
  
  /**
    * Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags are searchable using the Search API.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
    */
  var VpcId: typings.awsSdk.sagemakerMod.VpcId
}
object CreateDomainRequest {
  
  @scala.inline
  def apply(
    AuthMode: AuthMode,
    DefaultUserSettings: UserSettings,
    DomainName: DomainName,
    SubnetIds: Subnets,
    VpcId: VpcId
  ): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(AuthMode = AuthMode.asInstanceOf[js.Any], DefaultUserSettings = DefaultUserSettings.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainRequest]
  }
  
  @scala.inline
  implicit class CreateDomainRequestMutableBuilder[Self <: CreateDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppNetworkAccessType(value: AppNetworkAccessType): Self = StObject.set(x, "AppNetworkAccessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppNetworkAccessTypeUndefined: Self = StObject.set(x, "AppNetworkAccessType", js.undefined)
    
    @scala.inline
    def setAuthMode(value: AuthMode): Self = StObject.set(x, "AuthMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUserSettings(value: UserSettings): Self = StObject.set(x, "DefaultUserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeEfsFileSystemKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "HomeEfsFileSystemKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeEfsFileSystemKmsKeyIdUndefined: Self = StObject.set(x, "HomeEfsFileSystemKmsKeyId", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: Subnets): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
