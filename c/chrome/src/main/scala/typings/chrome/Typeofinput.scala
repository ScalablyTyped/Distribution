package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofinput extends js.Object {
  ////////////////////
  // Input - IME
  ////////////////////
  /**
    * Use the chrome.input.ime API to implement a custom IME for Chrome OS. This allows your extension to handle keystrokes, set the composition, and manage the candidate window.
    * Permissions:  "input"
    * @since Chrome 21.
    */
  val ime: Typeofime
}

object Typeofinput {
  @scala.inline
  def apply(ime: Typeofime): Typeofinput = {
    val __obj = js.Dynamic.literal(ime = ime)
  
    __obj.asInstanceOf[Typeofinput]
  }
}

