package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamKeyResponse extends js.Object {
  /**
    * Stream key used to authenticate an RTMPS stream for ingestion.
    */
  var streamKey: js.UndefOr[StreamKey] = js.native
}

object CreateStreamKeyResponse {
  @scala.inline
  def apply(): CreateStreamKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamKeyResponse]
  }
  @scala.inline
  implicit class CreateStreamKeyResponseOps[Self <: CreateStreamKeyResponse] (val x: Self) extends AnyVal {
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
    def setStreamKey(value: StreamKey): Self = this.set("streamKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamKey: Self = this.set("streamKey", js.undefined)
  }
  
}

