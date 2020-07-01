package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateThreatIntelSetRequest extends js.Object {
  /**
    * The updated Boolean value that specifies whether the ThreateIntelSet is active or not.
    */
  var Activate: js.UndefOr[Boolean] = js.native
  /**
    * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to update.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The updated URI of the file that contains the ThreateIntelSet. For example: https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key.
    */
  var Location: js.UndefOr[typings.awsSdk.guarddutyMod.Location] = js.native
  /**
    * The unique ID that specifies the ThreatIntelSet that you want to update.
    */
  var Name: js.UndefOr[typings.awsSdk.guarddutyMod.Name] = js.native
  /**
    * The unique ID that specifies the ThreatIntelSet that you want to update.
    */
  var ThreatIntelSetId: String = js.native
}

object UpdateThreatIntelSetRequest {
  @scala.inline
  def apply(
    DetectorId: DetectorId,
    ThreatIntelSetId: String,
    Activate: js.UndefOr[Boolean] = js.undefined,
    Location: Location = null,
    Name: Name = null
  ): UpdateThreatIntelSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], ThreatIntelSetId = ThreatIntelSetId.asInstanceOf[js.Any])
    if (!js.isUndefined(Activate)) __obj.updateDynamic("Activate")(Activate.get.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThreatIntelSetRequest]
  }
}

