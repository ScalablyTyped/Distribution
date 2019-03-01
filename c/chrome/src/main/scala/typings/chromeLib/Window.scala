package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Global object
////////////////////
trait Window extends js.Object {
  var chrome: Anon_AccessibilityFeatures
}

object Window {
  @scala.inline
  def apply(chrome: Anon_AccessibilityFeatures): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chrome")(chrome)
    __obj.asInstanceOf[Window]
  }
}

