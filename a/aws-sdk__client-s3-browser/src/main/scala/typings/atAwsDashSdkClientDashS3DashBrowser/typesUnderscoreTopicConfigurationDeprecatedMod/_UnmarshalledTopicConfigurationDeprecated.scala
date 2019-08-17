package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTopicConfigurationDeprecatedMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectCreated:*`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectCreated:CompleteMultipartUpload`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectCreated:Copy`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectCreated:Post`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectCreated:Put`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectRemoved:*`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectRemoved:DeleteMarkerCreated`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectRemoved:Delete`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ReducedRedundancyLostObject`
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
      `s3:ReducedRedundancyLostObject` | `s3:ObjectCreated:*` | `s3:ObjectCreated:Put` | `s3:ObjectCreated:Post` | `s3:ObjectCreated:Copy` | `s3:ObjectCreated:CompleteMultipartUpload` | `s3:ObjectRemoved:*` | `s3:ObjectRemoved:Delete` | `s3:ObjectRemoved:DeleteMarkerCreated` | String
    ]
  ] = js.undefined
}

object _UnmarshalledTopicConfigurationDeprecated {
  @scala.inline
  def apply(
    Event: `s3:ReducedRedundancyLostObject` | `s3:ObjectCreated:*` | `s3:ObjectCreated:Put` | `s3:ObjectCreated:Post` | `s3:ObjectCreated:Copy` | `s3:ObjectCreated:CompleteMultipartUpload` | `s3:ObjectRemoved:*` | `s3:ObjectRemoved:Delete` | `s3:ObjectRemoved:DeleteMarkerCreated` | String = null,
    Events: js.Array[
      `s3:ReducedRedundancyLostObject` | `s3:ObjectCreated:*` | `s3:ObjectCreated:Put` | `s3:ObjectCreated:Post` | `s3:ObjectCreated:Copy` | `s3:ObjectCreated:CompleteMultipartUpload` | `s3:ObjectRemoved:*` | `s3:ObjectRemoved:Delete` | `s3:ObjectRemoved:DeleteMarkerCreated` | String
    ] = null,
    Id: String = null,
    Topic: String = null
  ): _UnmarshalledTopicConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    if (Event != null) __obj.updateDynamic("Event")(Event.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Topic != null) __obj.updateDynamic("Topic")(Topic)
    __obj.asInstanceOf[_UnmarshalledTopicConfigurationDeprecated]
  }
}

