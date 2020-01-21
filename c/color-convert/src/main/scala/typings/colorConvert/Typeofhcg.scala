package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`3`
import typings.colorConvert.colorConvertStrings.c
import typings.colorConvert.colorConvertStrings.g
import typings.colorConvert.colorConvertStrings.h
import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhcg extends js.Object {
  val channels: `3`
  val labels: js.Tuple3[h, c, g]
  def hsl(hcg: HCG_): HSL_
  def hsv(hcg: HCG_): HSV_
  def hwb(hcg: HCG_): HWB_
  def rgb(hcg: HCG_): RGB_
}

object Typeofhcg {
  @scala.inline
  def apply(
    channels: `3`,
    hsl: HCG_ => HSL_,
    hsv: HCG_ => HSV_,
    hwb: HCG_ => HWB_,
    labels: js.Tuple3[h, c, g],
    rgb: HCG_ => RGB_
  ): Typeofhcg = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhcg]
  }
}

