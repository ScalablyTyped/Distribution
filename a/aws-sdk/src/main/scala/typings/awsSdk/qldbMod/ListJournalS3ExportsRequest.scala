package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJournalS3ExportsRequest extends js.Object {
  /**
    * The maximum number of results to return in a single ListJournalS3Exports request. (The actual number of results returned might be fewer.)
    */
  var MaxResults: js.UndefOr[typings.awsSdk.qldbMod.MaxResults] = js.native
  /**
    * A pagination token, indicating that you want to retrieve the next page of results. If you received a value for NextToken in the response from a previous ListJournalS3Exports call, then you should use that value as input here.
    */
  var NextToken: js.UndefOr[typings.awsSdk.qldbMod.NextToken] = js.native
}

object ListJournalS3ExportsRequest {
  @scala.inline
  def apply(): ListJournalS3ExportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJournalS3ExportsRequest]
  }
  @scala.inline
  implicit class ListJournalS3ExportsRequestOps[Self <: ListJournalS3ExportsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

