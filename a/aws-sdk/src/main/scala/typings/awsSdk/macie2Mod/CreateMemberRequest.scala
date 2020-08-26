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
  def apply(account: AccountDetail): CreateMemberRequest = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMemberRequest]
  }
  @scala.inline
  implicit class CreateMemberRequestOps[Self <: CreateMemberRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccount(value: AccountDetail): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

