package typings.azureDashSb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
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

object Anon_ContentType {
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
  ): Anon_ContentType = {
    val __obj = js.Dynamic.literal(ContentType = ContentType, CorrelationId = CorrelationId, Label = Label, Properties = Properties, ReplyTo = ReplyTo, ReplyToSessionId = ReplyToSessionId, RequiresPreprocessing = RequiresPreprocessing, SessionId = SessionId, To = To)
  
    __obj.asInstanceOf[Anon_ContentType]
  }
}

