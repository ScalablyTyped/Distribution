package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLambdaFunctionConfigurationMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectCreatedColonAsterisk
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectCreatedColonCopy
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectCreatedColonPost
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectCreatedColonPut
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectRemovedColonAsterisk
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectRemovedColonDelete
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.s3ColonReducedRedundancyLostObject
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreNotificationConfigurationFilterMod._UnmarshalledNotificationConfigurationFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledLambdaFunctionConfiguration extends _LambdaFunctionConfiguration {
  /**
    * _EventList shape
    */
  @JSName("Events")
  var Events__UnmarshalledLambdaFunctionConfiguration: js.Array[
    s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
  ]
  /**
    * <p>Container for object key name filtering rules. For information about key name filtering, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
    */
  @JSName("Filter")
  var Filter__UnmarshalledLambdaFunctionConfiguration: js.UndefOr[_UnmarshalledNotificationConfigurationFilter] = js.undefined
}

object _UnmarshalledLambdaFunctionConfiguration {
  @scala.inline
  def apply(
    Events: js.Array[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ],
    LambdaFunctionArn: String,
    Filter: _UnmarshalledNotificationConfigurationFilter = null,
    Id: String = null
  ): _UnmarshalledLambdaFunctionConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], LambdaFunctionArn = LambdaFunctionArn.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledLambdaFunctionConfiguration]
  }
}

