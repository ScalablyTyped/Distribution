package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`4`
import typings.colorDashConvert.colorDashConvertStrings.cmyk
import typings.colorDashConvert.conversionsMod.CMYK
import typings.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcmyk extends js.Object {
  val channels: `4`
  val labels: cmyk
  def rgb(cmyk: CMYK): RGB
}

object Typeofcmyk {
  @scala.inline
  def apply(channels: `4`, labels: cmyk, rgb: CMYK => RGB): Typeofcmyk = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofcmyk]
  }
}

