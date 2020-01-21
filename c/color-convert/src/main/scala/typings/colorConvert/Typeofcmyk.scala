package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`4`
import typings.colorConvert.colorConvertStrings.cmyk
import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcmyk extends js.Object {
  val channels: `4`
  val labels: cmyk
  def rgb(cmyk: CMYK_): RGB_
}

object Typeofcmyk {
  @scala.inline
  def apply(channels: `4`, labels: cmyk, rgb: CMYK_ => RGB_): Typeofcmyk = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofcmyk]
  }
}

