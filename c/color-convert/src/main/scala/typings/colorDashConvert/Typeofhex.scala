package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`1`
import typings.colorDashConvert.colorDashConvertStrings.hex
import typings.colorDashConvert.conversionsMod.HEX
import typings.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhex extends js.Object {
  val channels: `1`
  val labels: js.Array[hex]
  def rgb(hex: HEX): RGB
}

object Typeofhex {
  @scala.inline
  def apply(channels: `1`, labels: js.Array[hex], rgb: HEX => RGB): Typeofhex = {
    val __obj = js.Dynamic.literal(channels = channels, labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhex]
  }
}

