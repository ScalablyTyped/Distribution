package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabels extends js.Object {
  def apply(): Unit = js.native
  /**
    * Get and set axis labels.
    * @param labels If labels is given, specified axis' label will be updated.
    */
  def labels(): Unit = js.native
  def labels(labels: keyinAxisNamestring): Unit = js.native
  /**
    * Get and set axis max value.
    * @param max If an object is given, specified axis' max value will be updated. If a number is given, the max values for y and y2 will be updated.
    * @returns If `max` is *not* given, the current max values for each axis will be returned. Otherwise returns nothing.
    */
  def max(): keyinAxisNamenumber = js.native
  def max(max: Double): Unit = js.native
  def max(max: keyinAxisNamenumberX): Unit = js.native
  /**
    * Get and set axis min value.
    * @param min If an object is given, specified axis' min value will be updated. If a number is given, the min values for y and y2 will be updated.
    * @returns If `min` is *not* given, the current max values for each axis will be returned. Otherwise returns nothing.
    */
  def min(): keyinAxisNamenumber = js.native
  def min(min: Double): Unit = js.native
  def min(min: keyinAxisNamenumberX): Unit = js.native
  /**
    * Get and set axis min and max values.
    * @param range If range is given, specified axis' min and max value will be updated.
    * @returns If `range` is *not* given, returns the current min and max values for each axis.
    */
  def range(): AnonMaxMin = js.native
  def range(range: Anon2): Unit = js.native
}

