package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3Apple extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: js.Tuple3[
    colorDashConvertLib.colorDashConvertLibStrings.r16, 
    colorDashConvertLib.colorDashConvertLibStrings.g16, 
    colorDashConvertLib.colorDashConvertLibStrings.b16
  ]
  def rgb(apple: colorDashConvertLib.conversionsMod.APPLE): colorDashConvertLib.conversionsMod.RGB
}

object Anon_3Apple {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    labels: js.Tuple3[
      colorDashConvertLib.colorDashConvertLibStrings.r16, 
      colorDashConvertLib.colorDashConvertLibStrings.g16, 
      colorDashConvertLib.colorDashConvertLibStrings.b16
    ],
    rgb: colorDashConvertLib.conversionsMod.APPLE => colorDashConvertLib.conversionsMod.RGB
  ): Anon_3Apple = {
    val __obj = js.Dynamic.literal(channels = channels, labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Anon_3Apple]
  }
}

