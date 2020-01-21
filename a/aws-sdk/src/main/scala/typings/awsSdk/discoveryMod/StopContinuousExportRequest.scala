package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopContinuousExportRequest extends js.Object {
  /**
    * The unique ID assigned to this export.
    */
  var exportId: ConfigurationsExportId = js.native
}

object StopContinuousExportRequest {
  @scala.inline
  def apply(exportId: ConfigurationsExportId): StopContinuousExportRequest = {
    val __obj = js.Dynamic.literal(exportId = exportId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopContinuousExportRequest]
  }
}

