package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ime extends js.Object {
  ////////////////////
  // Input - IME
  ////////////////////
  /**
    * Use the chrome.input.ime API to implement a custom IME for Chrome OS. This allows your extension to handle keystrokes, set the composition, and manage the candidate window.
    * Permissions:  "input"
    * @since Chrome 21.
    */
  val imeNs: Anon_CallbackClearComposition
}

object Anon_Ime {
  @scala.inline
  def apply(imeNs: Anon_CallbackClearComposition): Anon_Ime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("imeNs")(imeNs)
    __obj.asInstanceOf[Anon_Ime]
  }
}

