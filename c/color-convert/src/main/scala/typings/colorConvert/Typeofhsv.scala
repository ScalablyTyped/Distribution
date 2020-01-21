package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`3`
import typings.colorConvert.colorConvertStrings.hsv
import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhsv extends js.Object {
  val channels: `3`
  val labels: hsv
  def ansi16(hsv: HSV_): ANSI16_
  def hcg(hsv: HSV_): HCG_
  def hsl(hsv: HSV_): HSL_
  def rgb(hsv: HSV_): RGB_
}

object Typeofhsv {
  @scala.inline
  def apply(
    ansi16: HSV_ => ANSI16_,
    channels: `3`,
    hcg: HSV_ => HCG_,
    hsl: HSV_ => HSL_,
    labels: hsv,
    rgb: HSV_ => RGB_
  ): Typeofhsv = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), channels = channels.asInstanceOf[js.Any], hcg = js.Any.fromFunction1(hcg), hsl = js.Any.fromFunction1(hsl), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhsv]
  }
}

