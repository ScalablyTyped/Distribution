package typings.babylonjs.anon

import typings.babylonjs.mathColorMod.Color3
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlphaFilter extends js.Object {
  var alphaFilter: Double
  var buffer: Uint8Array
  var bufferHeight: Double
  var bufferWidth: Double
  var colorFilter: Color3
  var height: Double
  var maxHeight: Double
  var minHeight: Double
  var subdivisions: Double
  var width: Double
}

object AlphaFilter {
  @scala.inline
  def apply(
    alphaFilter: Double,
    buffer: Uint8Array,
    bufferHeight: Double,
    bufferWidth: Double,
    colorFilter: Color3,
    height: Double,
    maxHeight: Double,
    minHeight: Double,
    subdivisions: Double,
    width: Double
  ): AlphaFilter = {
    val __obj = js.Dynamic.literal(alphaFilter = alphaFilter.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], bufferHeight = bufferHeight.asInstanceOf[js.Any], bufferWidth = bufferWidth.asInstanceOf[js.Any], colorFilter = colorFilter.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], subdivisions = subdivisions.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaFilter]
  }
}

