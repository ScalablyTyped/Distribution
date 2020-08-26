package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsResponse extends js.Object {
  /**
    * A token used to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of streams.
    */
  var streams: js.UndefOr[StreamsSummary] = js.native
}

object ListStreamsResponse {
  @scala.inline
  def apply(): ListStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsResponse]
  }
  @scala.inline
  implicit class ListStreamsResponseOps[Self <: ListStreamsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setStreamsVarargs(value: StreamSummary*): Self = this.set("streams", js.Array(value :_*))
    @scala.inline
    def setStreams(value: StreamsSummary): Self = this.set("streams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreams: Self = this.set("streams", js.undefined)
  }
  
}

