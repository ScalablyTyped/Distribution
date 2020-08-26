package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetChannelResponse extends js.Object {
  var channels: js.UndefOr[Channels] = js.native
  /**
    * Each error object is related to a specific ARN in the request.
    */
  var errors: js.UndefOr[BatchErrors] = js.native
}

object BatchGetChannelResponse {
  @scala.inline
  def apply(): BatchGetChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetChannelResponse]
  }
  @scala.inline
  implicit class BatchGetChannelResponseOps[Self <: BatchGetChannelResponse] (val x: Self) extends AnyVal {
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
    def setChannelsVarargs(value: Channel*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: Channels): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: BatchError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: BatchErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

