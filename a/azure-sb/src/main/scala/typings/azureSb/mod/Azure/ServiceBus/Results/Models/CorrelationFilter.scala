package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  ContentType  :string,   CorrelationId  :string,   Label  :string,   Properties  :string,   ReplyTo  :string,   ReplyToSessionId  :string,   RequiresPreprocessing  :string,   SessionId  :string,   To  :string}> */
trait CorrelationFilter extends js.Object {
  var ContentType: js.UndefOr[String] = js.undefined
  var CorrelationId: js.UndefOr[String] = js.undefined
  var Label: js.UndefOr[String] = js.undefined
  var Properties: js.UndefOr[String] = js.undefined
  var ReplyTo: js.UndefOr[String] = js.undefined
  var ReplyToSessionId: js.UndefOr[String] = js.undefined
  var RequiresPreprocessing: js.UndefOr[String] = js.undefined
  var SessionId: js.UndefOr[String] = js.undefined
  var To: js.UndefOr[String] = js.undefined
}

object CorrelationFilter {
  @scala.inline
  def apply(
    ContentType: String = null,
    CorrelationId: String = null,
    Label: String = null,
    Properties: String = null,
    ReplyTo: String = null,
    ReplyToSessionId: String = null,
    RequiresPreprocessing: String = null,
    SessionId: String = null,
    To: String = null
  ): CorrelationFilter = {
    val __obj = js.Dynamic.literal()
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (CorrelationId != null) __obj.updateDynamic("CorrelationId")(CorrelationId.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (Properties != null) __obj.updateDynamic("Properties")(Properties.asInstanceOf[js.Any])
    if (ReplyTo != null) __obj.updateDynamic("ReplyTo")(ReplyTo.asInstanceOf[js.Any])
    if (ReplyToSessionId != null) __obj.updateDynamic("ReplyToSessionId")(ReplyToSessionId.asInstanceOf[js.Any])
    if (RequiresPreprocessing != null) __obj.updateDynamic("RequiresPreprocessing")(RequiresPreprocessing.asInstanceOf[js.Any])
    if (SessionId != null) __obj.updateDynamic("SessionId")(SessionId.asInstanceOf[js.Any])
    if (To != null) __obj.updateDynamic("To")(To.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationFilter]
  }
}

