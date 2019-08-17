package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreRepositoryTriggerMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.all
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.createReference
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.deleteReference
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.updateReference
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RepositoryTrigger extends js.Object {
  /**
    * <p>The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will apply to all branches.</p> <note> <p>While no content is required in the array, you must include the array itself.</p> </note>
    */
  var branches: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.</p>
    */
  var customData: js.UndefOr[String] = js.undefined
  /**
    * <p>The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).</p>
    */
  var destinationArn: String
  /**
    * <p>The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). </p> <note> <p>The valid value "all" cannot be used with any other values.</p> </note>
    */
  var events: (js.Array[all | updateReference | createReference | deleteReference | String]) | (Iterable[all | updateReference | createReference | deleteReference | String])
  /**
    * <p>The name of the trigger.</p>
    */
  var name: String
}

object _RepositoryTrigger {
  @scala.inline
  def apply(
    destinationArn: String,
    events: (js.Array[all | updateReference | createReference | deleteReference | String]) | (Iterable[all | updateReference | createReference | deleteReference | String]),
    name: String,
    branches: js.Array[String] | Iterable[String] = null,
    customData: String = null
  ): _RepositoryTrigger = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn, events = events.asInstanceOf[js.Any], name = name)
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData)
    __obj.asInstanceOf[_RepositoryTrigger]
  }
}

