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
  def apply(
    arn: Arn = null,
    assetSizeBytes: js.UndefOr[Long] = js.undefined,
    createdTime: Timestamp = null,
    encryptionKey: Arn = null,
    name: DomainName = null,
    owner: AccountId = null,
    repositoryCount: js.UndefOr[Integer] = js.undefined,
    status: DomainStatus = null
  ): DomainDescription = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (!js.isUndefined(assetSizeBytes)) __obj.updateDynamic("assetSizeBytes")(assetSizeBytes.get.asInstanceOf[js.Any])
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(repositoryCount)) __obj.updateDynamic("repositoryCount")(repositoryCount.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDescription]
  }
}

