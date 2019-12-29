package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCloudFunctionConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.s3ColonObjectCreatedColonAsterisk
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.s3ColonObjectCreatedColonCopy
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.s3ColonObjectCreatedColonPost
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.s3ColonObjectCreatedColonPut
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.s3ColonObjectRemovedColonAsterisk
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.s3ColonObjectRemovedColonDelete
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.s3ColonReducedRedundancyLostObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledCloudFunctionConfiguration extends _CloudFunctionConfiguration {
  /**
    * _EventList shape
    */
  @JSName("Events")
  var Events__UnmarshalledCloudFunctionConfiguration: js.UndefOr[
    js.Array[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ]
  ] = js.undefined
}

object _UnmarshalledCloudFunctionConfiguration {
  @scala.inline
  def apply(
    CloudFunction: String = null,
    Event: s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String = null,
    Events: js.Array[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ] = null,
    Id: String = null,
    InvocationRole: String = null
  ): _UnmarshalledCloudFunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CloudFunction != null) __obj.updateDynamic("CloudFunction")(CloudFunction.asInstanceOf[js.Any])
    if (Event != null) __obj.updateDynamic("Event")(Event.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (InvocationRole != null) __obj.updateDynamic("InvocationRole")(InvocationRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledCloudFunctionConfiguration]
  }
}

