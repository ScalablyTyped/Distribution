package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDescription extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the domain. 
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    *  The total size of all assets in the domain. 
    */
  var assetSizeBytes: js.UndefOr[Long] = js.native
  /**
    *  A timestamp that represents the date and time the domain was created. 
    */
  var createdTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain. 
    */
  var encryptionKey: js.UndefOr[Arn] = js.native
  /**
    *  The name of the domain. 
    */
  var name: js.UndefOr[DomainName] = js.native
  /**
    *  The AWS account ID that owns the domain. 
    */
  var owner: js.UndefOr[AccountId] = js.native
  /**
    *  The number of repositories in the domain. 
    */
  var repositoryCount: js.UndefOr[Integer] = js.native
  /**
    *  The current status of a domain. The valid values are     Active     Deleted   
    */
  var status: js.UndefOr[DomainStatus] = js.native
}

object DomainDescription {
  @scala.inline
  def apply(): DomainDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDescription]
  }
  @scala.inline
  implicit class DomainDescriptionOps[Self <: DomainDescription] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAssetSizeBytes(value: Long): Self = this.set("assetSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetSizeBytes: Self = this.set("assetSizeBytes", js.undefined)
    @scala.inline
    def setCreatedTime(value: Timestamp): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    @scala.inline
    def setEncryptionKey(value: Arn): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    @scala.inline
    def setName(value: DomainName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwner(value: AccountId): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setRepositoryCount(value: Integer): Self = this.set("repositoryCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryCount: Self = this.set("repositoryCount", js.undefined)
    @scala.inline
    def setStatus(value: DomainStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

