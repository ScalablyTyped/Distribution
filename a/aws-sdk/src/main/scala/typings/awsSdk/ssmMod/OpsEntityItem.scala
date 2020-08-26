package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsEntityItem extends js.Object {
  /**
    * The time OpsItem data was captured.
    */
  var CaptureTime: js.UndefOr[OpsEntityItemCaptureTime] = js.native
  /**
    * The detailed data content for an OpsItem summaries result item.
    */
  var Content: js.UndefOr[OpsEntityItemEntryList] = js.native
}

object OpsEntityItem {
  @scala.inline
  def apply(): OpsEntityItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsEntityItem]
  }
  @scala.inline
  implicit class OpsEntityItemOps[Self <: OpsEntityItem] (val x: Self) extends AnyVal {
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
    def setCaptureTime(value: OpsEntityItemCaptureTime): Self = this.set("CaptureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureTime: Self = this.set("CaptureTime", js.undefined)
    @scala.inline
    def setContentVarargs(value: OpsEntityItemEntry*): Self = this.set("Content", js.Array(value :_*))
    @scala.inline
    def setContent(value: OpsEntityItemEntryList): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
  }
  
}

