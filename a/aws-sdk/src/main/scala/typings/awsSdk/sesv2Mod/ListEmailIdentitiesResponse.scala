package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEmailIdentitiesResponse extends js.Object {
  /**
    * An array that includes all of the email identities associated with your AWS account.
    */
  var EmailIdentities: js.UndefOr[IdentityInfoList] = js.native
  /**
    * A token that indicates that there are additional configuration sets to list. To view additional configuration sets, issue another request to ListEmailIdentities, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
}

object ListEmailIdentitiesResponse {
  @scala.inline
  def apply(EmailIdentities: IdentityInfoList = null, NextToken: NextToken = null): ListEmailIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (EmailIdentities != null) __obj.updateDynamic("EmailIdentities")(EmailIdentities.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEmailIdentitiesResponse]
  }
}

