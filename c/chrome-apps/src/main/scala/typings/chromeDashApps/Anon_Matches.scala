package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Matches extends js.Object {
  /** URLs to match and handle */
  var matches: js.Array[String]
  /**
    * The title field is reserved for future use in all relevant UI elements.
    * It should describe the action that the app performs when launched with this type of URL handler.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Matches {
  @scala.inline
  def apply(matches: js.Array[String], title: String = null): Anon_Matches = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Matches]
  }
}

