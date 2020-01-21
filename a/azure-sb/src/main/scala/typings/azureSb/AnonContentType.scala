package typings.azureSb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentType extends js.Object {
  var ContentType: String
  var CorrelationId: String
  var Label: String
  var Properties: String
  var ReplyTo: String
  var ReplyToSessionId: String
  var RequiresPreprocessing: String
  var SessionId: String
  var To: String
}

object AnonContentType {
  @scala.inline
  def apply(
    ContentType: String,
    CorrelationId: String,
    Label: String,
    Properties: String,
    ReplyTo: String,
    ReplyToSessionId: String,
    RequiresPreprocessing: String,
    SessionId: String,
    To: String
  ): AnonContentType = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], CorrelationId = CorrelationId.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], ReplyTo = ReplyTo.asInstanceOf[js.Any], ReplyToSessionId = ReplyToSessionId.asInstanceOf[js.Any], RequiresPreprocessing = RequiresPreprocessing.asInstanceOf[js.Any], SessionId = SessionId.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentType]
  }
}

