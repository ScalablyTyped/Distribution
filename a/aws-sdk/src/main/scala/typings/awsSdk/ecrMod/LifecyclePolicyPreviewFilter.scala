package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyPreviewFilter extends js.Object {
  /**
    * The tag status of the image.
    */
  var tagStatus: js.UndefOr[TagStatus] = js.native
}

object LifecyclePolicyPreviewFilter {
  @scala.inline
  def apply(): LifecyclePolicyPreviewFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyPreviewFilter]
  }
  @scala.inline
  implicit class LifecyclePolicyPreviewFilterOps[Self <: LifecyclePolicyPreviewFilter] (val x: Self) extends AnyVal {
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
    def setTagStatus(value: TagStatus): Self = this.set("tagStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagStatus: Self = this.set("tagStatus", js.undefined)
  }
  
}

