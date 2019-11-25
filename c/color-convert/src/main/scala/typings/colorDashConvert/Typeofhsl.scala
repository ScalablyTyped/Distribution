package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.hsl
import typings.colorDashConvert.conversionsMod.HCG
import typings.colorDashConvert.conversionsMod.HSL
import typings.colorDashConvert.conversionsMod.HSV
import typings.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhsl extends js.Object {
  val channels: `3`
  val labels: hsl
  def hcg(hsl: HSL): HCG
  def hsv(hsl: HSL): HSV
  def rgb(hsl: HSL): RGB
}

object Typeofhsl {
  @scala.inline
  def apply(channels: `3`, hcg: HSL => HCG, hsv: HSL => HSV, labels: hsl, rgb: HSL => RGB): Typeofhsl = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], hcg = js.Any.fromFunction1(hcg), hsv = js.Any.fromFunction1(hsv), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhsl]
  }
}

