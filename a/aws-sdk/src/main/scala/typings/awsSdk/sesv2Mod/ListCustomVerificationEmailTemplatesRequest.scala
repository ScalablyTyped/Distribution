package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCustomVerificationEmailTemplatesRequest extends js.Object {
  /**
    * A token returned from a previous call to ListCustomVerificationEmailTemplates to indicate the position in the list of custom verification email templates.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
  /**
    * The number of results to show in a single call to ListCustomVerificationEmailTemplates. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results. The value you specify has to be at least 1, and can be no more than 50.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
}

object ListCustomVerificationEmailTemplatesRequest {
  @scala.inline
  def apply(): ListCustomVerificationEmailTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomVerificationEmailTemplatesRequest]
  }
  @scala.inline
  implicit class ListCustomVerificationEmailTemplatesRequestOps[Self <: ListCustomVerificationEmailTemplatesRequest] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPageSize(value: MaxItems): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
  }
  
}

