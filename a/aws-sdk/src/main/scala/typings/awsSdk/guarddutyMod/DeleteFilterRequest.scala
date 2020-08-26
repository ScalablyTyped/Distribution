package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFilterRequest extends js.Object {
  /**
    * The unique ID of the detector that the filter is associated with.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The name of the filter that you want to delete.
    */
  var FilterName: String = js.native
}

object DeleteFilterRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FilterName: String): DeleteFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilterRequest]
  }
  @scala.inline
  implicit class DeleteFilterRequestOps[Self <: DeleteFilterRequest] (val x: Self) extends AnyVal {
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
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterName(value: String): Self = this.set("FilterName", value.asInstanceOf[js.Any])
  }
  
}

