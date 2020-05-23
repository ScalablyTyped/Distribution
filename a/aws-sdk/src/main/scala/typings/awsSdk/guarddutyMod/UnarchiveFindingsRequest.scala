package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnarchiveFindingsRequest extends js.Object {
  /**
    * The ID of the detector associated with the findings to unarchive.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The IDs of the findings to unarchive.
    */
  var FindingIds: typings.awsSdk.guarddutyMod.FindingIds = js.native
}

object UnarchiveFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, FindingIds: FindingIds): UnarchiveFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnarchiveFindingsRequest]
  }
}

