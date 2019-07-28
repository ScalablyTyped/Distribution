package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.c
import typings.colorDashConvert.colorDashConvertStrings.g
import typings.colorDashConvert.colorDashConvertStrings.h
import typings.colorDashConvert.conversionsMod.HCG
import typings.colorDashConvert.conversionsMod.HSL
import typings.colorDashConvert.conversionsMod.HSV
import typings.colorDashConvert.conversionsMod.HWB
import typings.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhcg extends js.Object {
  val channels: `3`
  val labels: js.Tuple3[h, c, g]
  def hsl(hcg: HCG): HSL
  def hsv(hcg: HCG): HSV
  def hwb(hcg: HCG): HWB
  def rgb(hcg: HCG): RGB
}

object Typeofhcg {
  @scala.inline
  def apply(
    channels: `3`,
    hsl: HCG => HSL,
    hsv: HCG => HSV,
    hwb: HCG => HWB,
    labels: js.Tuple3[h, c, g],
    rgb: HCG => RGB
  ): Typeofhcg = {
    val __obj = js.Dynamic.literal(channels = channels, hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhcg]
  }
}

