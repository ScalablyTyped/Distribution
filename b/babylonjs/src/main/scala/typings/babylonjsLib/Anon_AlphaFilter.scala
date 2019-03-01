package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphaFilter extends js.Object {
  var alphaFilter: scala.Double
  var buffer: stdLib.Uint8Array
  var bufferHeight: scala.Double
  var bufferWidth: scala.Double
  var colorFilter: babylonjsLib.BABYLONNs.Color3
  var height: scala.Double
  var maxHeight: scala.Double
  var minHeight: scala.Double
  var subdivisions: scala.Double
  var width: scala.Double
}

object Anon_AlphaFilter {
  @scala.inline
  def apply(
    alphaFilter: scala.Double,
    buffer: stdLib.Uint8Array,
    bufferHeight: scala.Double,
    bufferWidth: scala.Double,
    colorFilter: babylonjsLib.BABYLONNs.Color3,
    height: scala.Double,
    maxHeight: scala.Double,
    minHeight: scala.Double,
    subdivisions: scala.Double,
    width: scala.Double
  ): Anon_AlphaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alphaFilter")(alphaFilter)
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("bufferHeight")(bufferHeight)
    __obj.updateDynamic("bufferWidth")(bufferWidth)
    __obj.updateDynamic("colorFilter")(colorFilter)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("maxHeight")(maxHeight)
    __obj.updateDynamic("minHeight")(minHeight)
    __obj.updateDynamic("subdivisions")(subdivisions)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_AlphaFilter]
  }
}

