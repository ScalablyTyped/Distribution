package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`1`
import typings.colorConvert.colorConvertStrings.gray
import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgray extends js.Object {
  val channels: `1`
  val labels: js.Array[gray]
  def cmyk(gray: GRAY_): CMYK_
  def hex(gray: GRAY_): HEX_
  def hsl(gray: GRAY_): HSL_
  def hsv(gray: GRAY_): HSV_
  def hwb(gray: GRAY_): HWB_
  def lab(gray: GRAY_): LAB_
  def rgb(gray: GRAY_): RGB_
}

object Typeofgray {
  @scala.inline
  def apply(
    channels: `1`,
    cmyk: GRAY_ => CMYK_,
    hex: GRAY_ => HEX_,
    hsl: GRAY_ => HSL_,
    hsv: GRAY_ => HSV_,
    hwb: GRAY_ => HWB_,
    lab: GRAY_ => LAB_,
    labels: js.Array[gray],
    rgb: GRAY_ => RGB_
  ): Typeofgray = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], cmyk = js.Any.fromFunction1(cmyk), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), lab = js.Any.fromFunction1(lab), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofgray]
  }
}

