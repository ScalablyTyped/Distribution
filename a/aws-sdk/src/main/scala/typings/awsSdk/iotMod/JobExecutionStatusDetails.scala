package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionStatusDetails extends js.Object {
  /**
    * The job execution status.
    */
  var detailsMap: js.UndefOr[DetailsMap] = js.native
}

object JobExecutionStatusDetails {
  @scala.inline
  def apply(): JobExecutionStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionStatusDetails]
  }
  @scala.inline
  implicit class JobExecutionStatusDetailsOps[Self <: JobExecutionStatusDetails] (val x: Self) extends AnyVal {
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
    def setDetailsMap(value: DetailsMap): Self = this.set("detailsMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailsMap: Self = this.set("detailsMap", js.undefined)
  }
  
}

