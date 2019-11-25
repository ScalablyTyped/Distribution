package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`1`
import typings.colorDashConvert.colorDashConvertStrings.ansi16
import typings.colorDashConvert.conversionsMod.ANSI16
import typings.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofansi16 extends js.Object {
  val channels: `1`
  val labels: js.Array[ansi16]
  def rgb(ansi16: ANSI16): RGB
}

object Typeofansi16 {
  @scala.inline
  def apply(channels: `1`, labels: js.Array[ansi16], rgb: ANSI16 => RGB): Typeofansi16 = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofansi16]
  }
}

