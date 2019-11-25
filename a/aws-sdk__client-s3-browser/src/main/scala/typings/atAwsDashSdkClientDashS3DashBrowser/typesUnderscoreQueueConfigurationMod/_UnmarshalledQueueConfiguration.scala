package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreQueueConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectCreated:*`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectCreated:CompleteMultipartUpload`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectCreated:Copy`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectCreated:Post`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectCreated:Put`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectRemoved:*`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectRemoved:DeleteMarkerCreated`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ObjectRemoved:Delete`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`s3:ReducedRedundancyLostObject`
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreNotificationConfigurationFilterMod._UnmarshalledNotificationConfigurationFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledQueueConfiguration extends _QueueConfiguration {
  /**
    * _EventList shape
    */
  @JSName("Events")
  var Events__UnmarshalledQueueConfiguration: js.Array[
    `s3:ReducedRedundancyLostObject` | `s3:ObjectCreated:*` | `s3:ObjectCreated:Put` | `s3:ObjectCreated:Post` | `s3:ObjectCreated:Copy` | `s3:ObjectCreated:CompleteMultipartUpload` | `s3:ObjectRemoved:*` | `s3:ObjectRemoved:Delete` | `s3:ObjectRemoved:DeleteMarkerCreated` | String
  ]
  /**
    * <p>Container for object key name filtering rules. For information about key name filtering, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
    */
  @JSName("Filter")
  var Filter__UnmarshalledQueueConfiguration: js.UndefOr[_UnmarshalledNotificationConfigurationFilter] = js.undefined
}

object _UnmarshalledQueueConfiguration {
  @scala.inline
  def apply(
    Events: js.Array[
      `s3:ReducedRedundancyLostObject` | `s3:ObjectCreated:*` | `s3:ObjectCreated:Put` | `s3:ObjectCreated:Post` | `s3:ObjectCreated:Copy` | `s3:ObjectCreated:CompleteMultipartUpload` | `s3:ObjectRemoved:*` | `s3:ObjectRemoved:Delete` | `s3:ObjectRemoved:DeleteMarkerCreated` | String
    ],
    QueueArn: String,
    Filter: _UnmarshalledNotificationConfigurationFilter = null,
    Id: String = null
  ): _UnmarshalledQueueConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], QueueArn = QueueArn.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledQueueConfiguration]
  }
}

