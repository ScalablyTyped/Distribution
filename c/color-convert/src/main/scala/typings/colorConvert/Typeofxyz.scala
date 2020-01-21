package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`3`
import typings.colorConvert.colorConvertStrings.xyz
import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.RGB_
import typings.colorConvert.conversionsMod.XYZ_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofxyz extends js.Object {
  val channels: `3`
  val labels: xyz
  def lab(xyz: XYZ_): LAB_
  def rgb(xyz: XYZ_): RGB_
}

object Typeofxyz {
  @scala.inline
  def apply(channels: `3`, lab: XYZ_ => LAB_, labels: xyz, rgb: XYZ_ => RGB_): Typeofxyz = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], lab = js.Any.fromFunction1(lab), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofxyz]
  }
}

