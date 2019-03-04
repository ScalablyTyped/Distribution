package typings
package azureDashSbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
  var ContentType: java.lang.String
  var CorrelationId: java.lang.String
  var Label: java.lang.String
  var Properties: java.lang.String
  var ReplyTo: java.lang.String
  var ReplyToSessionId: java.lang.String
  var RequiresPreprocessing: java.lang.String
  var SessionId: java.lang.String
  var To: java.lang.String
}

object Anon_ContentType {
  @scala.inline
  def apply(
    ContentType: java.lang.String,
    CorrelationId: java.lang.String,
    Label: java.lang.String,
    Properties: java.lang.String,
    ReplyTo: java.lang.String,
    ReplyToSessionId: java.lang.String,
    RequiresPreprocessing: java.lang.String,
    SessionId: java.lang.String,
    To: java.lang.String
  ): Anon_ContentType = {
    val __obj = js.Dynamic.literal(ContentType = ContentType, CorrelationId = CorrelationId, Label = Label, Properties = Properties, ReplyTo = ReplyTo, ReplyToSessionId = ReplyToSessionId, RequiresPreprocessing = RequiresPreprocessing, SessionId = SessionId, To = To)
  
    __obj.asInstanceOf[Anon_ContentType]
  }
}

