package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTextTranslationJobsRequest extends js.Object {
  /**
    * The parameters that specify which batch translation jobs to retrieve. Filters include job name, job status, and submission time. You can only set one filter at a time.
    */
  var Filter: js.UndefOr[TextTranslationJobFilter] = js.native
  /**
    * The maximum number of results to return in each page. The default value is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.translateMod.NextToken] = js.native
}

object ListTextTranslationJobsRequest {
  @scala.inline
  def apply(): ListTextTranslationJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTextTranslationJobsRequest]
  }
  @scala.inline
  implicit class ListTextTranslationJobsRequestOps[Self <: ListTextTranslationJobsRequest] (val x: Self) extends AnyVal {
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
    def setFilter(value: TextTranslationJobFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResultsInteger): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

