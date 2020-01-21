package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatches extends js.Object {
  /** URLs to match and handle */
  var matches: js.Array[String]
  /**
    * The title field is reserved for future use in all relevant UI elements.
    * It should describe the action that the app performs when launched with this type of URL handler.
    */
  var title: js.UndefOr[String] = js.undefined
}

object AnonMatches {
  @scala.inline
  def apply(matches: js.Array[String], title: String = null): AnonMatches = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatches]
  }
}

