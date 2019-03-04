package typings
package bdfjsLib.bdfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Glyph extends js.Object {
  var bitmap: js.Array[js.Array[scala.Double]]
  var boundingBox: BoundingBox
  var bytes: js.Array[scala.Double]
  var char: java.lang.String
  var code: scala.Double
  var deviceWidthX: scala.Double
  var deviceWidthY: scala.Double
  var name: java.lang.String
  var scalableWidthX: scala.Double
  var scalableWidthY: scala.Double
}

object Glyph {
  @scala.inline
  def apply(
    bitmap: js.Array[js.Array[scala.Double]],
    boundingBox: BoundingBox,
    bytes: js.Array[scala.Double],
    char: java.lang.String,
    code: scala.Double,
    deviceWidthX: scala.Double,
    deviceWidthY: scala.Double,
    name: java.lang.String,
    scalableWidthX: scala.Double,
    scalableWidthY: scala.Double
  ): Glyph = {
    val __obj = js.Dynamic.literal(bitmap = bitmap, boundingBox = boundingBox, bytes = bytes, char = char, code = code, deviceWidthX = deviceWidthX, deviceWidthY = deviceWidthY, name = name, scalableWidthX = scalableWidthX, scalableWidthY = scalableWidthY)
  
    __obj.asInstanceOf[Glyph]
  }
}

