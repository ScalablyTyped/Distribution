package typings.c3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_KeyLabels extends js.Object {
  /**
    * Get and set axis labels.
    * @param labels If labels is given, specified axis' label will be updated.
    */
  def labels(): StringDictionary[String] = js.native
  def labels(labels: StringDictionary[String]): StringDictionary[String] = js.native
  /**
    * Get and set axis max value.
    * @param max If max is given, specified axis' max value will be updated. If no argument is given, the current max values for each axis will be returned.
    */
  def max(): Double | StringDictionary[Double] = js.native
  def max(max: StringDictionary[Double]): Double | StringDictionary[Double] = js.native
  def max(max: Double): Double | StringDictionary[Double] = js.native
  /**
    * Get and set axis min value.
    * @param min If min is given, specified axis' min value will be updated. If no argument is given, the current min values for each axis will be returned.
    */
  def min(): Double | StringDictionary[Double] = js.native
  def min(min: StringDictionary[Double]): Double | StringDictionary[Double] = js.native
  def min(min: Double): Double | StringDictionary[Double] = js.native
  /**
    * Get and set axis min and max value.
    * @param range If range is given, specified axis' min and max value will be updated. If no argument is given, the current min and max values for each axis will be returned.
    */
  def range(): Anon_KeyMax = js.native
  def range(range: Anon_Key): Anon_KeyMax = js.native
}

