package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`1`
import typings.colorConvert.colorConvertStrings.hex
import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhex extends js.Object {
  val channels: `1`
  val labels: js.Array[hex]
  def rgb(hex: HEX_): RGB_
}

object Typeofhex {
  @scala.inline
  def apply(channels: `1`, labels: js.Array[hex], rgb: HEX_ => RGB_): Typeofhex = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhex]
  }
}

