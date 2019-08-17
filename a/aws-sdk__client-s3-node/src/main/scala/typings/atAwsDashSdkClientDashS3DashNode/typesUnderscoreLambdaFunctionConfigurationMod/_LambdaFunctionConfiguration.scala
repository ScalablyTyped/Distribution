package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLambdaFunctionConfigurationMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectCreated:*`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectCreated:CompleteMultipartUpload`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectCreated:Copy`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectCreated:Post`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectCreated:Put`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectRemoved:*`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectRemoved:DeleteMarkerCreated`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ObjectRemoved:Delete`
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.`s3:ReducedRedundancyLostObject`
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreNotificationConfigurationFilterMod._NotificationConfigurationFilter
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _LambdaFunctionConfiguration extends js.Object {
  /**
    * _EventList shape
    */
  var Events: (js.Array[
    `s3:ReducedRedundancyLostObject` | `s3:ObjectCreated:*` | `s3:ObjectCreated:Put` | `s3:ObjectCreated:Post` | `s3:ObjectCreated:Copy` | `s3:ObjectCreated:CompleteMultipartUpload` | `s3:ObjectRemoved:*` | `s3:ObjectRemoved:Delete` | `s3:ObjectRemoved:DeleteMarkerCreated` | String
  ]) | (Iterable[
    `s3:ReducedRedundancyLostObject` | `s3:ObjectCreated:*` | `s3:ObjectCreated:Put` | `s3:ObjectCreated:Post` | `s3:ObjectCreated:Copy` | `s3:ObjectCreated:CompleteMultipartUpload` | `s3:ObjectRemoved:*` | `s3:ObjectRemoved:Delete` | `s3:ObjectRemoved:DeleteMarkerCreated` | String
  ])
  /**
    * <p>Container for object key name filtering rules. For information about key name filtering, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
    */
  var Filter: js.UndefOr[_NotificationConfigurationFilter] = js.undefined
  /**
    * <p>Optional unique identifier for configurations in a notification configuration. If you don't provide one, Amazon S3 will assign an ID.</p>
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * <p>Lambda cloud function ARN that Amazon S3 can invoke when it detects events of the specified type.</p>
    */
  var LambdaFunctionArn: String
}

object _LambdaFunctionConfiguration {
  @scala.inline
  def apply(
    Events: (js.Array[
      `s3:ReducedRedundancyLostObject` | `s3:ObjectCreated:*` | `s3:ObjectCreated:Put` | `s3:ObjectCreated:Post` | `s3:ObjectCreated:Copy` | `s3:ObjectCreated:CompleteMultipartUpload` | `s3:ObjectRemoved:*` | `s3:ObjectRemoved:Delete` | `s3:ObjectRemoved:DeleteMarkerCreated` | String
    ]) | (Iterable[
      `s3:ReducedRedundancyLostObject` | `s3:ObjectCreated:*` | `s3:ObjectCreated:Put` | `s3:ObjectCreated:Post` | `s3:ObjectCreated:Copy` | `s3:ObjectCreated:CompleteMultipartUpload` | `s3:ObjectRemoved:*` | `s3:ObjectRemoved:Delete` | `s3:ObjectRemoved:DeleteMarkerCreated` | String
    ]),
    LambdaFunctionArn: String,
    Filter: _NotificationConfigurationFilter = null,
    Id: String = null
  ): _LambdaFunctionConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], LambdaFunctionArn = LambdaFunctionArn)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[_LambdaFunctionConfiguration]
  }
}

