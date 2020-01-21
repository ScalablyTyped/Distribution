package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`1`
import typings.colorConvert.colorConvertStrings.ansi16
import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofansi16 extends js.Object {
  val channels: `1`
  val labels: js.Array[ansi16]
  def rgb(ansi16: ANSI16_): RGB_
}

object Typeofansi16 {
  @scala.inline
  def apply(channels: `1`, labels: js.Array[ansi16], rgb: ANSI16_ => RGB_): Typeofansi16 = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofansi16]
  }
}

