package typings
package cluiLib.cluiMod

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
  def this(length: scala.Double) = this()
  /**
    * Returns the progress bar min/max context to write to stdout
    * @param currentValueOrPercent Current value (or percent) of the progress bar
    * @param maxValue Maximum value of the progress bar
    */
  def update(currentValueOrPercent: scala.Double): java.lang.String = js.native
  def update(currentValueOrPercent: scala.Double, maxValue: scala.Double): java.lang.String = js.native
}

