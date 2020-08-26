package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEmailIdentitiesResponse extends js.Object {
  /**
    * An array that includes all of the identities associated with your Amazon Pinpoint account.
    */
  var EmailIdentities: js.UndefOr[IdentityInfoList] = js.native
  /**
    * A token that indicates that there are additional configuration sets to list. To view additional configuration sets, issue another request to ListEmailIdentities, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointemailMod.NextToken] = js.native
}

object ListEmailIdentitiesResponse {
  @scala.inline
  def apply(): ListEmailIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEmailIdentitiesResponse]
  }
  @scala.inline
  implicit class ListEmailIdentitiesResponseOps[Self <: ListEmailIdentitiesResponse] (val x: Self) extends AnyVal {
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
    def setEmailIdentitiesVarargs(value: IdentityInfo*): Self = this.set("EmailIdentities", js.Array(value :_*))
    @scala.inline
    def setEmailIdentities(value: IdentityInfoList): Self = this.set("EmailIdentities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailIdentities: Self = this.set("EmailIdentities", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

