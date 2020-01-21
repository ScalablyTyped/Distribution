package typings.clui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clui", "Spinner")
@js.native
class Spinner protected () extends js.Object {
  /**
    * Creates a new spinner
    * @param statusText The default text to display while the spinner is spinning
    * @param style Array of graphical characters used to draw the spinner
    */
  def this(statusText: String) = this()
  def this(statusText: String, style: js.Array[String]) = this()
  /**
    * Update the status message that follows the spinner
    * @param statusMessage Message to be displayed
    */
  def message(statusMessage: String): Unit = js.native
  /**
    * Show the spinner on the screen
    */
  def start(): Unit = js.native
  /**
    * Erase the spinner from the screen
    */
  def stop(): Unit = js.native
}

