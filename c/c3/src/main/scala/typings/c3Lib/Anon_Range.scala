package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Range extends js.Object {
  /**
           * Get and set axis labels.
           * @param labels If labels is given, specified axis' label will be updated.
           */
  def labels(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
           * Get and set axis labels.
           * @param labels If labels is given, specified axis' label will be updated.
           */
  def labels(labels: ScalablyTyped.runtime.StringDictionary[java.lang.String]): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
           * Get and set axis max value.
           * @param max If max is given, specified axis' max value will be updated. If no argument is given, the current max values for each axis will be returned.
           */
  def max(): scala.Double | ScalablyTyped.runtime.StringDictionary[scala.Double] = js.native
  /**
           * Get and set axis max value.
           * @param max If max is given, specified axis' max value will be updated. If no argument is given, the current max values for each axis will be returned.
           */
  def max(max: ScalablyTyped.runtime.StringDictionary[scala.Double]): scala.Double | ScalablyTyped.runtime.StringDictionary[scala.Double] = js.native
  /**
           * Get and set axis max value.
           * @param max If max is given, specified axis' max value will be updated. If no argument is given, the current max values for each axis will be returned.
           */
  def max(max: scala.Double): scala.Double | ScalablyTyped.runtime.StringDictionary[scala.Double] = js.native
  /**
           * Get and set axis min value.
           * @param min If min is given, specified axis' min value will be updated. If no argument is given, the current min values for each axis will be returned.
           */
  def min(): scala.Double | ScalablyTyped.runtime.StringDictionary[scala.Double] = js.native
  /**
           * Get and set axis min value.
           * @param min If min is given, specified axis' min value will be updated. If no argument is given, the current min values for each axis will be returned.
           */
  def min(min: ScalablyTyped.runtime.StringDictionary[scala.Double]): scala.Double | ScalablyTyped.runtime.StringDictionary[scala.Double] = js.native
  /**
           * Get and set axis min value.
           * @param min If min is given, specified axis' min value will be updated. If no argument is given, the current min values for each axis will be returned.
           */
  def min(min: scala.Double): scala.Double | ScalablyTyped.runtime.StringDictionary[scala.Double] = js.native
  /**
           * Get and set axis min and max value.
           * @param range If range is given, specified axis' min and max value will be updated. If no argument is given, the current min and max values for each axis will be returned.
           */
  def range(): Anon_Max = js.native
  /**
           * Get and set axis min and max value.
           * @param range If range is given, specified axis' min and max value will be updated. If no argument is given, the current min and max values for each axis will be returned.
           */
  def range(range: Anon_MaxKey): Anon_Max = js.native
}

