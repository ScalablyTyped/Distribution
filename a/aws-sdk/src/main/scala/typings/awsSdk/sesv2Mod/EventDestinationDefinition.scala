package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDestinationDefinition extends js.Object {
  
  /**
    * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
    */
  var CloudWatchDestination: js.UndefOr[typings.awsSdk.sesv2Mod.CloudWatchDestination] = js.native
  
  /**
    * If true, the event destination is enabled. When the event destination is enabled, the specified event types are sent to the destinations in this EventDestinationDefinition. If false, the event destination is disabled. When the event destination is disabled, events aren't sent to the specified destinations.
    */
  var Enabled: js.UndefOr[typings.awsSdk.sesv2Mod.Enabled] = js.native
  
  /**
    * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
    */
  var KinesisFirehoseDestination: js.UndefOr[typings.awsSdk.sesv2Mod.KinesisFirehoseDestination] = js.native
  
  /**
    * An array that specifies which events the Amazon SES API v2 should send to the destinations in this EventDestinationDefinition.
    */
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.native
  
  /**
    * An object that defines an Amazon Pinpoint project destination for email events. You can send email event data to a Amazon Pinpoint project to view metrics using the Transactional Messaging dashboards that are built in to Amazon Pinpoint. For more information, see Transactional Messaging Charts in the Amazon Pinpoint User Guide.
    */
  var PinpointDestination: js.UndefOr[typings.awsSdk.sesv2Mod.PinpointDestination] = js.native
  
  /**
    * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.
    */
  var SnsDestination: js.UndefOr[typings.awsSdk.sesv2Mod.SnsDestination] = js.native
}
object EventDestinationDefinition {
  
  @scala.inline
  def apply(): EventDestinationDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDestinationDefinition]
  }
  
  @scala.inline
  implicit class EventDestinationDefinitionOps[Self <: EventDestinationDefinition] (val x: Self) extends AnyVal {
    
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
    def setMatchingEventTypesVarargs(value: EventType*): Self = this.set("MatchingEventTypes", js.Array(value :_*))
    
    @scala.inline
    def setMatchingEventTypes(value: EventTypes): Self = this.set("MatchingEventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchingEventTypes: Self = this.set("MatchingEventTypes", js.undefined)
    
    @scala.inline
    def setPinpointDestination(value: PinpointDestination): Self = this.set("PinpointDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinpointDestination: Self = this.set("PinpointDestination", js.undefined)
    
    @scala.inline
    def setSnsDestination(value: SnsDestination): Self = this.set("SnsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsDestination: Self = this.set("SnsDestination", js.undefined)
  }
}
