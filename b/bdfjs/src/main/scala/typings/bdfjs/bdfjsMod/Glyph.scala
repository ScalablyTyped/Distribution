package typings.bdfjs.bdfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Glyph extends js.Object {
  var bitmap: js.Array[js.Array[Double]]
  var boundingBox: BoundingBox
  var bytes: js.Array[Double]
  var char: String
  var code: Double
  var deviceWidthX: Double
  var deviceWidthY: Double
  var name: String
  var scalableWidthX: Double
  var scalableWidthY: Double
}

object Glyph {
  @scala.inline
  def apply(
    bitmap: js.Array[js.Array[Double]],
    boundingBox: BoundingBox,
    bytes: js.Array[Double],
    char: String,
    code: Double,
    deviceWidthX: Double,
    deviceWidthY: Double,
    name: String,
    scalableWidthX: Double,
    scalableWidthY: Double
  ): Glyph = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], boundingBox = boundingBox.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], deviceWidthX = deviceWidthX.asInstanceOf[js.Any], deviceWidthY = deviceWidthY.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalableWidthX = scalableWidthX.asInstanceOf[js.Any], scalableWidthY = scalableWidthY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Glyph]
  }
}

