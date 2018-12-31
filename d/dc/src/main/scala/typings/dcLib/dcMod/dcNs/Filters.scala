package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  def RangedFilter(low: js.Any, high: js.Any): Filter
  def RangedTwoDimensionalFilter(arr: js.Array[_]): Filter
  def TwoDimensionalFilter(arr: js.Array[_]): Filter
}

