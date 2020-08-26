package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetStreamKeyResponse extends js.Object {
  var errors: js.UndefOr[BatchErrors] = js.native
  var streamKeys: js.UndefOr[StreamKeys] = js.native
}

object BatchGetStreamKeyResponse {
  @scala.inline
  def apply(): BatchGetStreamKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetStreamKeyResponse]
  }
  @scala.inline
  implicit class BatchGetStreamKeyResponseOps[Self <: BatchGetStreamKeyResponse] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: BatchError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: BatchErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setStreamKeysVarargs(value: StreamKey*): Self = this.set("streamKeys", js.Array(value :_*))
    @scala.inline
    def setStreamKeys(value: StreamKeys): Self = this.set("streamKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamKeys: Self = this.set("streamKeys", js.undefined)
  }
  
}

