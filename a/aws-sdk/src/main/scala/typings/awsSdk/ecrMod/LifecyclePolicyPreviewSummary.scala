package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyPreviewSummary extends js.Object {
  /**
    * The number of expiring images.
    */
  var expiringImageTotalCount: js.UndefOr[ImageCount] = js.native
}

object LifecyclePolicyPreviewSummary {
  @scala.inline
  def apply(): LifecyclePolicyPreviewSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyPreviewSummary]
  }
  @scala.inline
  implicit class LifecyclePolicyPreviewSummaryOps[Self <: LifecyclePolicyPreviewSummary] (val x: Self) extends AnyVal {
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
    def setExpiringImageTotalCount(value: ImageCount): Self = this.set("expiringImageTotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiringImageTotalCount: Self = this.set("expiringImageTotalCount", js.undefined)
  }
  
}

