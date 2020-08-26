package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStreamKeyResponse extends js.Object {
  var streamKey: js.UndefOr[StreamKey] = js.native
}

object GetStreamKeyResponse {
  @scala.inline
  def apply(): GetStreamKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamKeyResponse]
  }
  @scala.inline
  implicit class GetStreamKeyResponseOps[Self <: GetStreamKeyResponse] (val x: Self) extends AnyVal {
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

