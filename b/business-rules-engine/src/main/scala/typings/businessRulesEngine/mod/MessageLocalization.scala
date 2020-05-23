package typings.businessRulesEngine.mod

import typings.businessRulesEngine.anon.Contains
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine", "MessageLocalization")
@js.native
class MessageLocalization () extends js.Object

/* static members */
@JSImport("business-rules-engine", "MessageLocalization")
@js.native
object MessageLocalization extends js.Object {
  var ValidationMessages: Contains = js.native
  var customMsg: String = js.native
  var defaultMessages: Contains = js.native
  def GetValidationMessage(validator: js.Any): String = js.native
}

