package typings.awsSdkClientS3Browser.typesQueueConfigurationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonAsterisk
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonCopy
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonPost
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonPut
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonAsterisk
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonDelete
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonReducedRedundancyLostObject
import typings.awsSdkClientS3Browser.typesNotificationConfigurationFilterMod.UnmarshalledNotificationConfigurationFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledQueueConfiguration extends QueueConfiguration {
  /**
    * _EventList shape
    */
  @JSName("Events")
  var Events_UnmarshalledQueueConfiguration: js.Array[
    s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
  ] = js.native
  /**
    * <p>Container for object key name filtering rules. For information about key name filtering, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledQueueConfiguration: js.UndefOr[UnmarshalledNotificationConfigurationFilter] = js.native
}

object UnmarshalledQueueConfiguration {
  @scala.inline
  def apply(
    Events: js.Array[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ],
    QueueArn: String
  ): UnmarshalledQueueConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], QueueArn = QueueArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledQueueConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledQueueConfigurationOps[Self <: UnmarshalledQueueConfiguration] (val x: Self) extends AnyVal {
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
      value: js.Array[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ]
    ): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: UnmarshalledNotificationConfigurationFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
  }
  
}

