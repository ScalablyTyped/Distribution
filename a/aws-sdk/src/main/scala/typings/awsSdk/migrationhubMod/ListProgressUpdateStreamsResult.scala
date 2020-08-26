package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProgressUpdateStreamsResult extends js.Object {
  /**
    * If there are more streams created than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * List of progress update streams up to the max number of results passed in the input.
    */
  var ProgressUpdateStreamSummaryList: js.UndefOr[typings.awsSdk.migrationhubMod.ProgressUpdateStreamSummaryList] = js.native
}

object ListProgressUpdateStreamsResult {
  @scala.inline
  def apply(): ListProgressUpdateStreamsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProgressUpdateStreamsResult]
  }
  @scala.inline
  implicit class ListProgressUpdateStreamsResultOps[Self <: ListProgressUpdateStreamsResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setProgressUpdateStreamSummaryListVarargs(value: ProgressUpdateStreamSummary*): Self = this.set("ProgressUpdateStreamSummaryList", js.Array(value :_*))
    @scala.inline
    def setProgressUpdateStreamSummaryList(value: ProgressUpdateStreamSummaryList): Self = this.set("ProgressUpdateStreamSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressUpdateStreamSummaryList: Self = this.set("ProgressUpdateStreamSummaryList", js.undefined)
  }
  
}

