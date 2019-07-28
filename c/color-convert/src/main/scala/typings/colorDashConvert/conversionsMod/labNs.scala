package typings.colorDashConvert.conversionsMod

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.lab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-convert/conversions", "lab")
@js.native
object labNs extends js.Object {
  val channels: `3` = js.native
  val labels: lab = js.native
  def lch(lab: LAB): LCH = js.native
  def xyz(lab: LAB): XYZ = js.native
}

