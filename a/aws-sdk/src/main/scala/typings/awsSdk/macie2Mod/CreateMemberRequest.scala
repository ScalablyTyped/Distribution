package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMemberRequest extends js.Object {
  /**
    * The details for the account to associate with the master account.
    */
  var account: AccountDetail = js.native
  /**
    * A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie. An account can have a maximum of 50 tags. Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateMemberRequest {
  @scala.inline
  def apply(account: AccountDetail, tags: TagMap = null): CreateMemberRequest = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMemberRequest]
  }
}

