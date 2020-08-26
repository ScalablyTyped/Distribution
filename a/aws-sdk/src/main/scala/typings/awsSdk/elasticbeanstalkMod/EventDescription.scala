package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDescription extends js.Object {
  /**
    * The application associated with the event.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The name of the environment associated with this event.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The date when the event occurred.
    */
  var EventDate: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EventDate] = js.native
  /**
    * The event message.
    */
  var Message: js.UndefOr[EventMessage] = js.native
  /**
    * The ARN of the platform version.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The web service request ID for the activity of this event.
    */
  var RequestId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.RequestId] = js.native
  /**
    * The severity level of this event.
    */
  var Severity: js.UndefOr[EventSeverity] = js.native
  /**
    * The name of the configuration associated with this event.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
  /**
    * The release label for the application version associated with this event.
    */
  var VersionLabel: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}

object EventDescription {
  @scala.inline
  def apply(): EventDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDescription]
  }
  @scala.inline
  implicit class EventDescriptionOps[Self <: EventDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("ApplicationName", js.undefined)
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    @scala.inline
    def setEventDate(value: EventDate): Self = this.set("EventDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventDate: Self = this.set("EventDate", js.undefined)
    @scala.inline
    def setMessage(value: EventMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setPlatformArn(value: PlatformArn): Self = this.set("PlatformArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformArn: Self = this.set("PlatformArn", js.undefined)
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setSeverity(value: EventSeverity): Self = this.set("Severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("Severity", js.undefined)
    @scala.inline
    def setTemplateName(value: ConfigurationTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
    @scala.inline
    def setVersionLabel(value: VersionLabel): Self = this.set("VersionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionLabel: Self = this.set("VersionLabel", js.undefined)
  }
  
}

