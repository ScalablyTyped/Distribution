package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`3`
import typings.colorConvert.colorConvertStrings.b16
import typings.colorConvert.colorConvertStrings.g16
import typings.colorConvert.colorConvertStrings.r16
import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofapple extends js.Object {
  val channels: `3`
  val labels: js.Tuple3[r16, g16, b16]
  def rgb(apple: APPLE_): RGB_
}

object Typeofapple {
  @scala.inline
  def apply(channels: `3`, labels: js.Tuple3[r16, g16, b16], rgb: APPLE_ => RGB_): Typeofapple = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofapple]
  }
}

