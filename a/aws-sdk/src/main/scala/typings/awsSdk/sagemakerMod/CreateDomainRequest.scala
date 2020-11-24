package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDomainRequest extends js.Object {
  
  /**
    * Specifies the VPC used for non-EFS traffic. The default value is PublicInternetOnly.    PublicInternetOnly - Non-EFS traffic is through a VPC managed by Amazon SageMaker, which allows direct internet access    VpcOnly - All Studio traffic is through the specified VPC and subnets  
    */
  var AppNetworkAccessType: js.UndefOr[typings.awsSdk.sagemakerMod.AppNetworkAccessType] = js.native
  
  /**
    * The mode of authentication that members use to access the domain.
    */
  var AuthMode: typings.awsSdk.sagemakerMod.AuthMode = js.native
  
  /**
    * The default user settings.
    */
  var DefaultUserSettings: UserSettings = js.native
  
  /**
    * A name for the domain.
    */
  var DomainName: typings.awsSdk.sagemakerMod.DomainName = js.native
  
  /**
    * This member is deprecated and replaced with KmsKeyId.
    */
  var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  
  /**
    * SageMaker uses AWS KMS to encrypt the EFS volume attached to the domain with an AWS managed customer master key (CMK) by default. For more control, specify a customer managed CMK.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.native
  
  /**
    * The VPC subnets that Studio uses for communication.
    */
  var SubnetIds: Subnets = js.native
  
  /**
    * Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags are searchable using the Search API.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
    */
  var VpcId: typings.awsSdk.sagemakerMod.VpcId = js.native
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
  implicit class CreateDomainRequestOps[Self <: CreateDomainRequest] (val x: Self) extends AnyVal {
    
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
    def setAuthMode(value: AuthMode): Self = this.set("AuthMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUserSettings(value: UserSettings): Self = this.set("DefaultUserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: Subnets): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppNetworkAccessType(value: AppNetworkAccessType): Self = this.set("AppNetworkAccessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppNetworkAccessType: Self = this.set("AppNetworkAccessType", js.undefined)
    
    @scala.inline
    def setHomeEfsFileSystemKmsKeyId(value: KmsKeyId): Self = this.set("HomeEfsFileSystemKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeEfsFileSystemKmsKeyId: Self = this.set("HomeEfsFileSystemKmsKeyId", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
