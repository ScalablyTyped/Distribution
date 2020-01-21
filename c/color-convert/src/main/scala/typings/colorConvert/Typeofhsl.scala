package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`3`
import typings.colorConvert.colorConvertStrings.hsl
import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhsl extends js.Object {
  val channels: `3`
  val labels: hsl
  def hcg(hsl: HSL_): HCG_
  def hsv(hsl: HSL_): HSV_
  def rgb(hsl: HSL_): RGB_
}

object Typeofhsl {
  @scala.inline
  def apply(channels: `3`, hcg: HSL_ => HCG_, hsv: HSL_ => HSV_, labels: hsl, rgb: HSL_ => RGB_): Typeofhsl = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], hcg = js.Any.fromFunction1(hcg), hsv = js.Any.fromFunction1(hsv), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhsl]
  }
}

