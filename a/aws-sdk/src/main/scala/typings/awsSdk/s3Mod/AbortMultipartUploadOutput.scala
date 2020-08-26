package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortMultipartUploadOutput extends js.Object {
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
}

object AbortMultipartUploadOutput {
  @scala.inline
  def apply(): AbortMultipartUploadOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortMultipartUploadOutput]
  }
  @scala.inline
  implicit class AbortMultipartUploadOutputOps[Self <: AbortMultipartUploadOutput] (val x: Self) extends AnyVal {
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
    def setRequestCharged(value: RequestCharged): Self = this.set("RequestCharged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharged: Self = this.set("RequestCharged", js.undefined)
  }
  
}

