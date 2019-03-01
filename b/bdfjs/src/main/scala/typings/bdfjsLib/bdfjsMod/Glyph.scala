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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bitmap")(bitmap)
    __obj.updateDynamic("boundingBox")(boundingBox)
    __obj.updateDynamic("bytes")(bytes)
    __obj.updateDynamic("char")(char)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("deviceWidthX")(deviceWidthX)
    __obj.updateDynamic("deviceWidthY")(deviceWidthY)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("scalableWidthX")(scalableWidthX)
    __obj.updateDynamic("scalableWidthY")(scalableWidthY)
    __obj.asInstanceOf[Glyph]
  }
}

