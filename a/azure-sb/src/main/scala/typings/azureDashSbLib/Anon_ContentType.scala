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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContentType")(ContentType)
    __obj.updateDynamic("CorrelationId")(CorrelationId)
    __obj.updateDynamic("Label")(Label)
    __obj.updateDynamic("Properties")(Properties)
    __obj.updateDynamic("ReplyTo")(ReplyTo)
    __obj.updateDynamic("ReplyToSessionId")(ReplyToSessionId)
    __obj.updateDynamic("RequiresPreprocessing")(RequiresPreprocessing)
    __obj.updateDynamic("SessionId")(SessionId)
    __obj.updateDynamic("To")(To)
    __obj.asInstanceOf[Anon_ContentType]
  }
}

