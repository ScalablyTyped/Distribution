package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`1`
import typings.colorConvert.colorConvertStrings.ansi256
import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofansi256 extends js.Object {
  val channels: `1`
  val labels: js.Array[ansi256]
  def rgb(ansi256: ANSI256_): RGB_
}

object Typeofansi256 {
  @scala.inline
  def apply(channels: `1`, labels: js.Array[ansi256], rgb: ANSI256_ => RGB_): Typeofansi256 = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofansi256]
  }
}

