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
    * The ARN of the platform.
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
  def apply(
    ApplicationName: ApplicationName = null,
    EnvironmentName: EnvironmentName = null,
    EventDate: EventDate = null,
    Message: EventMessage = null,
    PlatformArn: PlatformArn = null,
    RequestId: RequestId = null,
    Severity: EventSeverity = null,
    TemplateName: ConfigurationTemplateName = null,
    VersionLabel: VersionLabel = null
  ): EventDescription = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (EventDate != null) __obj.updateDynamic("EventDate")(EventDate.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Severity != null) __obj.updateDynamic("Severity")(Severity.asInstanceOf[js.Any])
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName.asInstanceOf[js.Any])
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDescription]
  }
}

