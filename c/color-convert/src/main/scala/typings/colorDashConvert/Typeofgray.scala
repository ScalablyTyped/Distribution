package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`1`
import typings.colorDashConvert.colorDashConvertStrings.gray
import typings.colorDashConvert.conversionsMod.CMYK
import typings.colorDashConvert.conversionsMod.GRAY
import typings.colorDashConvert.conversionsMod.HEX
import typings.colorDashConvert.conversionsMod.HSL
import typings.colorDashConvert.conversionsMod.HSV
import typings.colorDashConvert.conversionsMod.HWB
import typings.colorDashConvert.conversionsMod.LAB
import typings.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgray extends js.Object {
  val channels: `1`
  val labels: js.Array[gray]
  def cmyk(gray: GRAY): CMYK
  def hex(gray: GRAY): HEX
  def hsl(gray: GRAY): HSL
  def hsv(gray: GRAY): HSV
  def hwb(gray: GRAY): HWB
  def lab(gray: GRAY): LAB
  def rgb(gray: GRAY): RGB
}

object Typeofgray {
  @scala.inline
  def apply(
    channels: `1`,
    cmyk: GRAY => CMYK,
    hex: GRAY => HEX,
    hsl: GRAY => HSL,
    hsv: GRAY => HSV,
    hwb: GRAY => HWB,
    lab: GRAY => LAB,
    labels: js.Array[gray],
    rgb: GRAY => RGB
  ): Typeofgray = {
    val __obj = js.Dynamic.literal(channels = channels, cmyk = js.Any.fromFunction1(cmyk), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), lab = js.Any.fromFunction1(lab), labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofgray]
  }
}

