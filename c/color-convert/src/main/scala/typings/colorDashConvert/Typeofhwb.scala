package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.hwb
import typings.colorDashConvert.conversionsMod.HCG
import typings.colorDashConvert.conversionsMod.HWB
import typings.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhwb extends js.Object {
  val channels: `3`
  val labels: hwb
  def hcg(hwb: HWB): HCG
  def rgb(hwb: HWB): RGB
}

object Typeofhwb {
  @scala.inline
  def apply(channels: `3`, hcg: HWB => HCG, labels: hwb, rgb: HWB => RGB): Typeofhwb = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], hcg = js.Any.fromFunction1(hcg), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhwb]
  }
}

