package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotScheduleMessage extends js.Object {
  /**
    * 
    */
  var DryRun: js.UndefOr[BooleanOptional] = js.native
  /**
    * 
    */
  var NextInvocations: js.UndefOr[IntegerOptional] = js.native
  /**
    * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example "cron(30 12 *)" or "rate(12 hours)". 
    */
  var ScheduleDefinitions: js.UndefOr[ScheduleDefinitionList] = js.native
  /**
    * The description of the snapshot schedule.
    */
  var ScheduleDescription: js.UndefOr[String] = js.native
  /**
    * A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.native
  /**
    * An optional set of tags you can use to search for the schedule.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateSnapshotScheduleMessage {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[BooleanOptional] = js.undefined,
    NextInvocations: js.UndefOr[IntegerOptional] = js.undefined,
    ScheduleDefinitions: ScheduleDefinitionList = null,
    ScheduleDescription: String = null,
    ScheduleIdentifier: String = null,
    Tags: TagList = null
  ): CreateSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NextInvocations)) __obj.updateDynamic("NextInvocations")(NextInvocations.get.asInstanceOf[js.Any])
    if (ScheduleDefinitions != null) __obj.updateDynamic("ScheduleDefinitions")(ScheduleDefinitions.asInstanceOf[js.Any])
    if (ScheduleDescription != null) __obj.updateDynamic("ScheduleDescription")(ScheduleDescription.asInstanceOf[js.Any])
    if (ScheduleIdentifier != null) __obj.updateDynamic("ScheduleIdentifier")(ScheduleIdentifier.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotScheduleMessage]
  }
}

