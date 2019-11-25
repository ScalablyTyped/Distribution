package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`1`
import typings.colorDashConvert.colorDashConvertStrings.ansi256
import typings.colorDashConvert.conversionsMod.ANSI256
import typings.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofansi256 extends js.Object {
  val channels: `1`
  val labels: js.Array[ansi256]
  def rgb(ansi256: ANSI256): RGB
}

object Typeofansi256 {
  @scala.inline
  def apply(channels: `1`, labels: js.Array[ansi256], rgb: ANSI256 => RGB): Typeofansi256 = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofansi256]
  }
}

