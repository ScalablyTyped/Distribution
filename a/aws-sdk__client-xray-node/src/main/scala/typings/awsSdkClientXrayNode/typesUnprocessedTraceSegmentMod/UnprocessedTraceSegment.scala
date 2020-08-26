package typings.awsSdkClientXrayNode.typesUnprocessedTraceSegmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedTraceSegment extends js.Object {
  /**
    * <p>The error that caused processing to fail.</p>
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * <p>The segment's ID.</p>
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * <p>The error message.</p>
    */
  var Message: js.UndefOr[String] = js.native
}

object UnprocessedTraceSegment {
  @scala.inline
  def apply(): UnprocessedTraceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedTraceSegment]
  }
  @scala.inline
  implicit class UnprocessedTraceSegmentOps[Self <: UnprocessedTraceSegment] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

