package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTopicConfigurationDeprecatedMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectCreatedColonAsterisk
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectCreatedColonCopy
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectCreatedColonPost
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectCreatedColonPut
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectRemovedColonAsterisk
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectRemovedColonDelete
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonReducedRedundancyLostObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledTopicConfigurationDeprecated extends _TopicConfigurationDeprecated {
  /**
    * _EventList shape
    */
  @JSName("Events")
  var Events__UnmarshalledTopicConfigurationDeprecated: js.UndefOr[
    js.Array[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ]
  ] = js.undefined
}

object _UnmarshalledTopicConfigurationDeprecated {
  @scala.inline
  def apply(
    Event: s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String = null,
    Events: js.Array[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ] = null,
    Id: String = null,
    Topic: String = null
  ): _UnmarshalledTopicConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    if (Event != null) __obj.updateDynamic("Event")(Event.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Topic != null) __obj.updateDynamic("Topic")(Topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledTopicConfigurationDeprecated]
  }
}

