package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplatesResponse extends js.Object {
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * A structure containing information about the templates in the list.
    */
  var TemplateSummaryList: js.UndefOr[typings.awsSdk.quicksightMod.TemplateSummaryList] = js.native
}

object ListTemplatesResponse {
  @scala.inline
  def apply(): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplatesResponse]
  }
  @scala.inline
  implicit class ListTemplatesResponseOps[Self <: ListTemplatesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTemplateSummaryListVarargs(value: TemplateSummary*): Self = this.set("TemplateSummaryList", js.Array(value :_*))
    @scala.inline
    def setTemplateSummaryList(value: TemplateSummaryList): Self = this.set("TemplateSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateSummaryList: Self = this.set("TemplateSummaryList", js.undefined)
  }
  
}

