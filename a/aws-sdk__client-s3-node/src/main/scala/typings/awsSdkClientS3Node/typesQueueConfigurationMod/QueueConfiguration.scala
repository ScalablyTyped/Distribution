package typings.awsSdkClientS3Node.typesQueueConfigurationMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonAsterisk
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonCopy
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonPost
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonPut
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonAsterisk
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonDelete
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonReducedRedundancyLostObject
import typings.awsSdkClientS3Node.typesNotificationConfigurationFilterMod.NotificationConfigurationFilter
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueConfiguration extends js.Object {
  /**
    * _EventList shape
    */
  var Events: (js.Array[
    s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
  ]) | (Iterable[
    s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
  ]) = js.native
  /**
    * <p>Container for object key name filtering rules. For information about key name filtering, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
    */
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.native
  /**
    * <p>Optional unique identifier for configurations in a notification configuration. If you don't provide one, Amazon S3 will assign an ID.</p>
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * <p>Amazon SQS queue ARN to which Amazon S3 will publish a message when it detects events of specified type.</p>
    */
  var QueueArn: String = js.native
}

object QueueConfiguration {
  @scala.inline
  def apply(
    Events: (js.Array[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ]) | (Iterable[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ]),
    QueueArn: String
  ): QueueConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], QueueArn = QueueArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueConfiguration]
  }
  @scala.inline
  implicit class QueueConfigurationOps[Self <: QueueConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventsVarargs(
      value: (s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String)*
    ): Self = this.set("Events", js.Array(value :_*))
    @scala.inline
    def setEvents(
      value: (js.Array[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ]) | (Iterable[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ])
    ): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueArn(value: String): Self = this.set("QueueArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: NotificationConfigurationFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

