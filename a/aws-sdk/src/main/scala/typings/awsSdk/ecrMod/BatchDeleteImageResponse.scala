package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteImageResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[ImageFailureList] = js.native
  /**
    * The image IDs of the deleted images.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.native
}

object BatchDeleteImageResponse {
  @scala.inline
  def apply(): BatchDeleteImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteImageResponse]
  }
  @scala.inline
  implicit class BatchDeleteImageResponseOps[Self <: BatchDeleteImageResponse] (val x: Self) extends AnyVal {
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
    def setFailuresVarargs(value: ImageFailure*): Self = this.set("failures", js.Array(value :_*))
    @scala.inline
    def setFailures(value: ImageFailureList): Self = this.set("failures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailures: Self = this.set("failures", js.undefined)
    @scala.inline
    def setImageIdsVarargs(value: ImageIdentifier*): Self = this.set("imageIds", js.Array(value :_*))
    @scala.inline
    def setImageIds(value: ImageIdentifierList): Self = this.set("imageIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageIds: Self = this.set("imageIds", js.undefined)
  }
  
}

