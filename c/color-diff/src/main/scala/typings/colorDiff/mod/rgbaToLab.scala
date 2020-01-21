package typings.colorDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-diff", "rgba_to_lab")
@js.native
object rgbaToLab extends js.Object {
  def apply(c: RGBColor): LabColor = js.native
  def apply(c: RGBColor, bc: RGBColor): LabColor = js.native
}

