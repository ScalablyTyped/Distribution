package typings
package cluiLib.cluiMod

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
  def this(statusText: java.lang.String) = this()
  def this(statusText: java.lang.String, style: js.Array[java.lang.String]) = this()
  /**
    * Update the status message that follows the spinner
    * @param statusMessage Message to be displayed
    */
  def message(statusMessage: java.lang.String): scala.Unit = js.native
  /**
    * Show the spinner on the screen
    */
  def start(): scala.Unit = js.native
  /**
    * Erase the spinner from the screen
    */
  def stop(): scala.Unit = js.native
}

