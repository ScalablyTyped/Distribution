package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationResponse extends js.Object {
  /**
    * Describes application updates.
    */
  var ApplicationDetail: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationDetail = js.native
}

object UpdateApplicationResponse {
  @scala.inline
  def apply(ApplicationDetail: ApplicationDetail): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
  @scala.inline
  implicit class UpdateApplicationResponseOps[Self <: UpdateApplicationResponse] (val x: Self) extends AnyVal {
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
    def setApplicationDetail(value: ApplicationDetail): Self = this.set("ApplicationDetail", value.asInstanceOf[js.Any])
  }
  
}

