package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIPSetRequest extends js.Object {
  /**
    * The unique ID of the detector associated with the IPSet.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The unique ID of the IPSet to delete.
    */
  var IpSetId: String = js.native
}

object DeleteIPSetRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, IpSetId: String): DeleteIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], IpSetId = IpSetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIPSetRequest]
  }
}

