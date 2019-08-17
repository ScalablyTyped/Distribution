package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreRepositoryTriggerMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.all
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.createReference
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.deleteReference
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.updateReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRepositoryTrigger extends _RepositoryTrigger {
  /**
    * <p>The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will apply to all branches.</p> <note> <p>While no content is required in the array, you must include the array itself.</p> </note>
    */
  @JSName("branches")
  var branches__UnmarshalledRepositoryTrigger: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). </p> <note> <p>The valid value "all" cannot be used with any other values.</p> </note>
    */
  @JSName("events")
  var events__UnmarshalledRepositoryTrigger: js.Array[all | updateReference | createReference | deleteReference | String]
}

object _UnmarshalledRepositoryTrigger {
  @scala.inline
  def apply(
    destinationArn: String,
    events: js.Array[all | updateReference | createReference | deleteReference | String],
    name: String,
    branches: js.Array[String] = null,
    customData: String = null
  ): _UnmarshalledRepositoryTrigger = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn, events = events, name = name)
    if (branches != null) __obj.updateDynamic("branches")(branches)
    if (customData != null) __obj.updateDynamic("customData")(customData)
    __obj.asInstanceOf[_UnmarshalledRepositoryTrigger]
  }
}

