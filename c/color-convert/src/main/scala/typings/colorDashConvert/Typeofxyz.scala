package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.xyz
import typings.colorDashConvert.conversionsMod.LAB
import typings.colorDashConvert.conversionsMod.RGB
import typings.colorDashConvert.conversionsMod.XYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofxyz extends js.Object {
  val channels: `3`
  val labels: xyz
  def lab(xyz: XYZ): LAB
  def rgb(xyz: XYZ): RGB
}

object Typeofxyz {
  @scala.inline
  def apply(channels: `3`, lab: XYZ => LAB, labels: xyz, rgb: XYZ => RGB): Typeofxyz = {
    val __obj = js.Dynamic.literal(channels = channels, lab = js.Any.fromFunction1(lab), labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofxyz]
  }
}

