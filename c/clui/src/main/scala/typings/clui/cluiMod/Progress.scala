package typings.clui.cluiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clui", "Progress")
@js.native
class Progress protected () extends js.Object {
  /**
    * Creates a progress bar
    * @param length The desired length of the progress bar in characters
    */
  def this(length: Double) = this()
  /**
    * Returns the progress bar min/max context to write to stdout
    * @param currentValueOrPercent Current value (or percent) of the progress bar
    * @param maxValue Maximum value of the progress bar
    */
  def update(currentValueOrPercent: Double): String = js.native
  def update(currentValueOrPercent: Double, maxValue: Double): String = js.native
}

