package typings
package chromeLib.chromeNs.omniboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggestion extends js.Object {
  /** The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim' (for dim helper text). The styles can be nested, eg. dimmed match. */
  var description: java.lang.String
}

object Suggestion {
  @scala.inline
  def apply(description: java.lang.String): Suggestion = {
    val __obj = js.Dynamic.literal(description = description)
  
    __obj.asInstanceOf[Suggestion]
  }
}

