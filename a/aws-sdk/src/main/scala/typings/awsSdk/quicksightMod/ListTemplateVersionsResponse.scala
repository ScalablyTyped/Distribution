package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplateVersionsResponse extends js.Object {
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
    * A structure containing a list of all the versions of the specified template.
    */
  var TemplateVersionSummaryList: js.UndefOr[typings.awsSdk.quicksightMod.TemplateVersionSummaryList] = js.native
}

object ListTemplateVersionsResponse {
  @scala.inline
  def apply(): ListTemplateVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplateVersionsResponse]
  }
  @scala.inline
  implicit class ListTemplateVersionsResponseOps[Self <: ListTemplateVersionsResponse] (val x: Self) extends AnyVal {
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
    def setTemplateVersionSummaryListVarargs(value: TemplateVersionSummary*): Self = this.set("TemplateVersionSummaryList", js.Array(value :_*))
    @scala.inline
    def setTemplateVersionSummaryList(value: TemplateVersionSummaryList): Self = this.set("TemplateVersionSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateVersionSummaryList: Self = this.set("TemplateVersionSummaryList", js.undefined)
  }
  
}

