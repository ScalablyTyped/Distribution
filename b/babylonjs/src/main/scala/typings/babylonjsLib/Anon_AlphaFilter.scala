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
    val __obj = js.Dynamic.literal(alphaFilter = alphaFilter, buffer = buffer, bufferHeight = bufferHeight, bufferWidth = bufferWidth, colorFilter = colorFilter, height = height, maxHeight = maxHeight, minHeight = minHeight, subdivisions = subdivisions, width = width)
  
    __obj.asInstanceOf[Anon_AlphaFilter]
  }
}

