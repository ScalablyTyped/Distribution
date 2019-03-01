package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Matches extends js.Object {
  /** URLs to match and handle */
  var matches: js.Array[java.lang.String]
  /**
    * The title field is reserved for future use in all relevant UI elements.
    * It should describe the action that the app performs when launched with this type of URL handler.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Matches {
  @scala.inline
  def apply(matches: js.Array[java.lang.String], title: java.lang.String = null): Anon_Matches = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("matches")(matches)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Matches]
  }
}

