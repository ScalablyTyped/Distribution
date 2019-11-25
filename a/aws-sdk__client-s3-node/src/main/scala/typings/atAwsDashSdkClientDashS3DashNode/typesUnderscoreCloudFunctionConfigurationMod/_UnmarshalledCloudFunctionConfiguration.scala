package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCloudFunctionConfigurationMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectCreated:*`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectCreated:CompleteMultipartUpload`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectCreated:Copy`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectCreated:Post`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectCreated:Put`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectRemoved:*`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectRemoved:DeleteMarkerCreated`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectRemoved:Delete`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ReducedRedundancyLostObject`
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
      `s3:ReducedRedundancyLostObject` | `s3:ObjectCreated:*` | `s3:ObjectCreated:Put` | `s3:ObjectCreated:Post` | `s3:ObjectCreated:Copy` | `s3:ObjectCreated:CompleteMultipartUpload` | `s3:ObjectRemoved:*` | `s3:ObjectRemoved:Delete` | `s3:ObjectRemoved:DeleteMarkerCreated` | String
    ]
  ] = js.undefined
}

object _UnmarshalledCloudFunctionConfiguration {
  @scala.inline
  def apply(
    CloudFunction: String = null,
    Event: `s3:ReducedRedundancyLostObject` | `s3:ObjectCreated:*` | `s3:ObjectCreated:Put` | `s3:ObjectCreated:Post` | `s3:ObjectCreated:Copy` | `s3:ObjectCreated:CompleteMultipartUpload` | `s3:ObjectRemoved:*` | `s3:ObjectRemoved:Delete` | `s3:ObjectRemoved:DeleteMarkerCreated` | String = null,
    Events: js.Array[
      `s3:ReducedRedundancyLostObject` | `s3:ObjectCreated:*` | `s3:ObjectCreated:Put` | `s3:ObjectCreated:Post` | `s3:ObjectCreated:Copy` | `s3:ObjectCreated:CompleteMultipartUpload` | `s3:ObjectRemoved:*` | `s3:ObjectRemoved:Delete` | `s3:ObjectRemoved:DeleteMarkerCreated` | String
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

