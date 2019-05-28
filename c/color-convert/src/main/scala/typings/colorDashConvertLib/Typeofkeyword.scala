package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofkeyword extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`
  val labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.keyword]
  def rgb(keyword: colorDashConvertLib.conversionsMod.KEYWORD): colorDashConvertLib.conversionsMod.RGB
}

object Typeofkeyword {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`,
    labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.keyword],
    rgb: colorDashConvertLib.conversionsMod.KEYWORD => colorDashConvertLib.conversionsMod.RGB
  ): Typeofkeyword = {
    val __obj = js.Dynamic.literal(channels = channels, labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofkeyword]
  }
}

