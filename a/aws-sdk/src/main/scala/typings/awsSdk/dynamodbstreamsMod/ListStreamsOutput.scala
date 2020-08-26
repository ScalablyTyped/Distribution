package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsOutput extends js.Object {
  /**
    * The stream ARN of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedStreamArn is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedStreamArn is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedStreamArn is empty.
    */
  var LastEvaluatedStreamArn: js.UndefOr[StreamArn] = js.native
  /**
    * A list of stream descriptors associated with the current account and endpoint.
    */
  var Streams: js.UndefOr[StreamList] = js.native
}

object ListStreamsOutput {
  @scala.inline
  def apply(): ListStreamsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsOutput]
  }
  @scala.inline
  implicit class ListStreamsOutputOps[Self <: ListStreamsOutput] (val x: Self) extends AnyVal {
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
    def setLastEvaluatedStreamArn(value: StreamArn): Self = this.set("LastEvaluatedStreamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastEvaluatedStreamArn: Self = this.set("LastEvaluatedStreamArn", js.undefined)
    @scala.inline
    def setStreamsVarargs(value: Stream*): Self = this.set("Streams", js.Array(value :_*))
    @scala.inline
    def setStreams(value: StreamList): Self = this.set("Streams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreams: Self = this.set("Streams", js.undefined)
  }
  
}

