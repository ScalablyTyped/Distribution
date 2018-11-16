package typings
package chromeLib.chromeNs.omniboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SuggestResult extends js.Object {
  /** The text that is put into the URL bar, and that is sent to the extension when the user chooses this entry. */
  var content: java.lang.String
  /** The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim' (for dim helper text). The styles can be nested, eg. dimmed match. You must escape the five predefined entities to display them as text: stackoverflow.com/a/1091953/89484 */
  var description: java.lang.String
}

