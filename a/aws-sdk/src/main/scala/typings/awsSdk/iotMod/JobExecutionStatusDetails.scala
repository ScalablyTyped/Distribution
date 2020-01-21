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
  def apply(detailsMap: DetailsMap = null): JobExecutionStatusDetails = {
    val __obj = js.Dynamic.literal()
    if (detailsMap != null) __obj.updateDynamic("detailsMap")(detailsMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecutionStatusDetails]
  }
}

