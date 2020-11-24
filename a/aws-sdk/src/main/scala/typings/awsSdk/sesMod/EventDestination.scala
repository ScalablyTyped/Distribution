package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDestination extends js.Object {
  
  /**
    * An object that contains the names, default values, and sources of the dimensions associated with an Amazon CloudWatch event destination.
    */
  var CloudWatchDestination: js.UndefOr[typings.awsSdk.sesMod.CloudWatchDestination] = js.native
  
  /**
    * Sets whether Amazon SES publishes events to this destination when you send an email with the associated configuration set. Set to true to enable publishing to this destination; set to false to prevent publishing to this destination. The default value is false.
    */
  var Enabled: js.UndefOr[typings.awsSdk.sesMod.Enabled] = js.native
  
  /**
    * An object that contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose event destination.
    */
  var KinesisFirehoseDestination: js.UndefOr[typings.awsSdk.sesMod.KinesisFirehoseDestination] = js.native
  
  /**
    * The type of email sending events to publish to the event destination.
    */
  var MatchingEventTypes: EventTypes = js.native
  
  /**
    * The name of the event destination. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 64 characters.  
    */
  var Name: EventDestinationName = js.native
  
  /**
    * An object that contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event destination.
    */
  var SNSDestination: js.UndefOr[typings.awsSdk.sesMod.SNSDestination] = js.native
}
object EventDestination {
  
  @scala.inline
  def apply(MatchingEventTypes: EventTypes, Name: EventDestinationName): EventDestination = {
    val __obj = js.Dynamic.literal(MatchingEventTypes = MatchingEventTypes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestination]
  }
  
  @scala.inline
  implicit class EventDestinationOps[Self <: EventDestination] (val x: Self) extends AnyVal {
    
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
    def setMatchingEventTypesVarargs(value: EventType*): Self = this.set("MatchingEventTypes", js.Array(value :_*))
    
    @scala.inline
    def setMatchingEventTypes(value: EventTypes): Self = this.set("MatchingEventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EventDestinationName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchDestination(value: CloudWatchDestination): Self = this.set("CloudWatchDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchDestination: Self = this.set("CloudWatchDestination", js.undefined)
    
    @scala.inline
    def setEnabled(value: Enabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = this.set("KinesisFirehoseDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehoseDestination: Self = this.set("KinesisFirehoseDestination", js.undefined)
    
    @scala.inline
    def setSNSDestination(value: SNSDestination): Self = this.set("SNSDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSNSDestination: Self = this.set("SNSDestination", js.undefined)
  }
}
