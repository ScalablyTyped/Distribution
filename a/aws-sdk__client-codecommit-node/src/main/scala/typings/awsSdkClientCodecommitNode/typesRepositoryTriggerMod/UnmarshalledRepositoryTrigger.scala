package typings.awsSdkClientCodecommitNode.typesRepositoryTriggerMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.all
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.createReference
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.deleteReference
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.updateReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledRepositoryTrigger extends RepositoryTrigger {
  /**
    * <p>The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will apply to all branches.</p> <note> <p>While no content is required in the array, you must include the array itself.</p> </note>
    */
  @JSName("branches")
  var branches_UnmarshalledRepositoryTrigger: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). </p> <note> <p>The valid value "all" cannot be used with any other values.</p> </note>
    */
  @JSName("events")
  var events_UnmarshalledRepositoryTrigger: js.Array[all | updateReference | createReference | deleteReference | String]
}

object UnmarshalledRepositoryTrigger {
  @scala.inline
  def apply(
    destinationArn: String,
    events: js.Array[all | updateReference | createReference | deleteReference | String],
    name: String,
    branches: js.Array[String] = null,
    customData: String = null
  ): UnmarshalledRepositoryTrigger = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRepositoryTrigger]
  }
}

