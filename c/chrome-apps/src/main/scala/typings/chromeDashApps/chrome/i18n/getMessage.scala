package typings.chromeDashApps.chrome.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.i18n.getMessage")
@js.native
object getMessage extends js.Object {
  /**
    * Gets the localized string for the specified message.
    * If the message is missing, this method returns an empty string ('').
    * If the format of the getMessage() call is wrong — for example,
    * messageName is not a string or the substitutions array has
    * more than 9 elements — this method returns undefined.
    *
    * @param messageName The name of the message, as specified in the messages.json file.
    * @param substitutions Up to 9 substitution strings, if the message requires any.
    */
  def apply(messageName: String): js.UndefOr[String] = js.native
  def apply(messageName: String, substitutions: StringSubstitutions): js.UndefOr[String] = js.native
}

