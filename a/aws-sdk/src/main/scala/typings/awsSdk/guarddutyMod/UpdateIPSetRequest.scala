package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIPSetRequest extends js.Object {
  /**
    * The updated Boolean value that specifies whether the IPSet is active or not.
    */
  var Activate: js.UndefOr[Boolean] = js.native
  /**
    * The detectorID that specifies the GuardDuty service whose IPSet you want to update.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The unique ID that specifies the IPSet that you want to update.
    */
  var IpSetId: String = js.native
  /**
    * The updated URI of the file that contains the IPSet. For example: .
    */
  var Location: js.UndefOr[typings.awsSdk.guarddutyMod.Location] = js.native
  /**
    * The unique ID that specifies the IPSet that you want to update.
    */
  var Name: js.UndefOr[typings.awsSdk.guarddutyMod.Name] = js.native
}

object UpdateIPSetRequest {
  @scala.inline
  def apply(
    DetectorId: DetectorId,
    IpSetId: String,
    Activate: js.UndefOr[Boolean] = js.undefined,
    Location: Location = null,
    Name: Name = null
  ): UpdateIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], IpSetId = IpSetId.asInstanceOf[js.Any])
    if (!js.isUndefined(Activate)) __obj.updateDynamic("Activate")(Activate.get.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIPSetRequest]
  }
}

