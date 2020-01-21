package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trigger extends js.Object {
  /**
    * The actions initiated by this trigger.
    */
  var Actions: js.UndefOr[ActionList] = js.native
  /**
    * A description of this trigger.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * Reserved for future use.
    */
  var Id: js.UndefOr[IdString] = js.native
  /**
    * The name of the trigger.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * The predicate of this trigger, which defines when it will fire.
    */
  var Predicate: js.UndefOr[typings.awsSdk.glueMod.Predicate] = js.native
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[GenericString] = js.native
  /**
    * The current state of the trigger.
    */
  var State: js.UndefOr[TriggerState] = js.native
  /**
    * The type of trigger that this is.
    */
  var Type: js.UndefOr[TriggerType] = js.native
  /**
    * The name of the workflow associated with the trigger.
    */
  var WorkflowName: js.UndefOr[NameString] = js.native
}

object Trigger {
  @scala.inline
  def apply(
    Actions: ActionList = null,
    Description: DescriptionString = null,
    Id: IdString = null,
    Name: NameString = null,
    Predicate: Predicate = null,
    Schedule: GenericString = null,
    State: TriggerState = null,
    Type: TriggerType = null,
    WorkflowName: NameString = null
  ): Trigger = {
    val __obj = js.Dynamic.literal()
    if (Actions != null) __obj.updateDynamic("Actions")(Actions.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Predicate != null) __obj.updateDynamic("Predicate")(Predicate.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (WorkflowName != null) __obj.updateDynamic("WorkflowName")(WorkflowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
}

