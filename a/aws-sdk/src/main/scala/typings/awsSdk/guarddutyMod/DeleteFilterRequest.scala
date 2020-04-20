package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFilterRequest extends js.Object {
  /**
    * The unique ID of the detector the filter is associated with.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The name of the filter you want to delete.
    */
  var FilterName: String = js.native
}

object DeleteFilterRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FilterName: String): DeleteFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilterRequest]
  }
}

