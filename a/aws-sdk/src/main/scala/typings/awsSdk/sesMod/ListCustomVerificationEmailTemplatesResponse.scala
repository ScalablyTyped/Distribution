package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCustomVerificationEmailTemplatesResponse extends js.Object {
  /**
    * A list of the custom verification email templates that exist in your account.
    */
  var CustomVerificationEmailTemplates: js.UndefOr[typings.awsSdk.sesMod.CustomVerificationEmailTemplates] = js.native
  /**
    * A token indicating that there are additional custom verification email templates available to be listed. Pass this token to a subsequent call to ListTemplates to retrieve the next 50 custom verification email templates.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesMod.NextToken] = js.native
}

object ListCustomVerificationEmailTemplatesResponse {
  @scala.inline
  def apply(
    CustomVerificationEmailTemplates: CustomVerificationEmailTemplates = null,
    NextToken: NextToken = null
  ): ListCustomVerificationEmailTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomVerificationEmailTemplates != null) __obj.updateDynamic("CustomVerificationEmailTemplates")(CustomVerificationEmailTemplates.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomVerificationEmailTemplatesResponse]
  }
}

