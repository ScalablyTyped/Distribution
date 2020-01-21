package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * Information about the activity described in a finding.
    */
  var Action: js.UndefOr[typings.awsSdk.guarddutyMod.Action] = js.native
  /**
    * Indicates whether this finding is archived.
    */
  var Archived: js.UndefOr[Boolean] = js.native
  /**
    * Total count of the occurrences of this finding type.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * Detector ID for the GuardDuty service.
    */
  var DetectorId: js.UndefOr[typings.awsSdk.guarddutyMod.DetectorId] = js.native
  /**
    * First seen timestamp of the activity that prompted GuardDuty to generate this finding.
    */
  var EventFirstSeen: js.UndefOr[String] = js.native
  /**
    * Last seen timestamp of the activity that prompted GuardDuty to generate this finding.
    */
  var EventLastSeen: js.UndefOr[String] = js.native
  /**
    * An evidence object associated with the service.
    */
  var Evidence: js.UndefOr[typings.awsSdk.guarddutyMod.Evidence] = js.native
  /**
    * Resource role information for this finding.
    */
  var ResourceRole: js.UndefOr[String] = js.native
  /**
    * The name of the AWS service (GuardDuty) that generated a finding.
    */
  var ServiceName: js.UndefOr[String] = js.native
  /**
    * Feedback left about the finding.
    */
  var UserFeedback: js.UndefOr[String] = js.native
}

object Service {
  @scala.inline
  def apply(
    Action: Action = null,
    Archived: js.UndefOr[scala.Boolean] = js.undefined,
    Count: Int | scala.Double = null,
    DetectorId: DetectorId = null,
    EventFirstSeen: String = null,
    EventLastSeen: String = null,
    Evidence: Evidence = null,
    ResourceRole: String = null,
    ServiceName: String = null,
    UserFeedback: String = null
  ): Service = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (!js.isUndefined(Archived)) __obj.updateDynamic("Archived")(Archived.asInstanceOf[js.Any])
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (DetectorId != null) __obj.updateDynamic("DetectorId")(DetectorId.asInstanceOf[js.Any])
    if (EventFirstSeen != null) __obj.updateDynamic("EventFirstSeen")(EventFirstSeen.asInstanceOf[js.Any])
    if (EventLastSeen != null) __obj.updateDynamic("EventLastSeen")(EventLastSeen.asInstanceOf[js.Any])
    if (Evidence != null) __obj.updateDynamic("Evidence")(Evidence.asInstanceOf[js.Any])
    if (ResourceRole != null) __obj.updateDynamic("ResourceRole")(ResourceRole.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    if (UserFeedback != null) __obj.updateDynamic("UserFeedback")(UserFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

