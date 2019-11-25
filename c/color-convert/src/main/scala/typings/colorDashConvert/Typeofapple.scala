package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.b16
import typings.colorDashConvert.colorDashConvertStrings.g16
import typings.colorDashConvert.colorDashConvertStrings.r16
import typings.colorDashConvert.conversionsMod.APPLE
import typings.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofapple extends js.Object {
  val channels: `3`
  val labels: js.Tuple3[r16, g16, b16]
  def rgb(apple: APPLE): RGB
}

object Typeofapple {
  @scala.inline
  def apply(channels: `3`, labels: js.Tuple3[r16, g16, b16], rgb: APPLE => RGB): Typeofapple = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofapple]
  }
}

