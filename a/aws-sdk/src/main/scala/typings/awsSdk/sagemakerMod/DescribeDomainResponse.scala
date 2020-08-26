package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainResponse extends js.Object {
  /**
    * The domain's authentication mode.
    */
  var AuthMode: js.UndefOr[typings.awsSdk.sagemakerMod.AuthMode] = js.native
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.sagemakerMod.CreationTime] = js.native
  /**
    * Settings which are applied to all UserProfile in this domain, if settings are not explicitly specified in a given UserProfile. 
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
    * The AWS Key Management Service encryption key ID.
    */
  var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.native
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
    * Security setting to limit to a set of subnets.
    */
  var SubnetIds: js.UndefOr[Subnets] = js.native
  /**
    * The domain's URL.
    */
  var Url: js.UndefOr[String1024] = js.native
  /**
    * The ID of the Amazon Virtual Private Cloud.
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
  implicit class DescribeDomainResponseOps[Self <: DescribeDomainResponse] (val x: Self) extends AnyVal {
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
    def deleteAuthMode: Self = this.set("AuthMode", js.undefined)
    @scala.inline
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDefaultUserSettings(value: UserSettings): Self = this.set("DefaultUserSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultUserSettings: Self = this.set("DefaultUserSettings", js.undefined)
    @scala.inline
    def setDomainArn(value: DomainArn): Self = this.set("DomainArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainArn: Self = this.set("DomainArn", js.undefined)
    @scala.inline
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainId: Self = this.set("DomainId", js.undefined)
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setHomeEfsFileSystemId(value: ResourceId): Self = this.set("HomeEfsFileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeEfsFileSystemId: Self = this.set("HomeEfsFileSystemId", js.undefined)
    @scala.inline
    def setHomeEfsFileSystemKmsKeyId(value: KmsKeyId): Self = this.set("HomeEfsFileSystemKmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeEfsFileSystemKmsKeyId: Self = this.set("HomeEfsFileSystemKmsKeyId", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: LastModifiedTime): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setSingleSignOnManagedApplicationInstanceId(value: String256): Self = this.set("SingleSignOnManagedApplicationInstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleSignOnManagedApplicationInstanceId: Self = this.set("SingleSignOnManagedApplicationInstanceId", js.undefined)
    @scala.inline
    def setStatus(value: DomainStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: Subnets): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    @scala.inline
    def setUrl(value: String1024): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

