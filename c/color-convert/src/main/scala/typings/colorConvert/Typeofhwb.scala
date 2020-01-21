package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`3`
import typings.colorConvert.colorConvertStrings.hwb
import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhwb extends js.Object {
  val channels: `3`
  val labels: hwb
  def hcg(hwb: HWB_): HCG_
  def rgb(hwb: HWB_): RGB_
}

object Typeofhwb {
  @scala.inline
  def apply(channels: `3`, hcg: HWB_ => HCG_, labels: hwb, rgb: HWB_ => RGB_): Typeofhwb = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], hcg = js.Any.fromFunction1(hcg), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhwb]
  }
}

