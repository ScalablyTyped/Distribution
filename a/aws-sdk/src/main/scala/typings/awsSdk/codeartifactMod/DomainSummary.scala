package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainSummary extends js.Object {
  /**
    *  The ARN of the domain. 
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    *  A timestamp that contains the date and time the domain was created. 
    */
  var createdTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The key used to encrypt the domain. 
    */
  var encryptionKey: js.UndefOr[Arn] = js.native
  /**
    *  The name of the domain. 
    */
  var name: js.UndefOr[DomainName] = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var owner: js.UndefOr[AccountId] = js.native
  /**
    *  A string that contains the status of the domain. The valid values are:     Active     Deleted   
    */
  var status: js.UndefOr[DomainStatus] = js.native
}

object DomainSummary {
  @scala.inline
  def apply(
    arn: Arn = null,
    createdTime: Timestamp = null,
    encryptionKey: Arn = null,
    name: DomainName = null,
    owner: AccountId = null,
    status: DomainStatus = null
  ): DomainSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainSummary]
  }
}

