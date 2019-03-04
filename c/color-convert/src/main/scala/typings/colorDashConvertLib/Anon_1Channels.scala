package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1Channels extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`
  val labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.keyword]
  def rgb(keyword: colorDashConvertLib.conversionsMod.KEYWORD): colorDashConvertLib.conversionsMod.RGB
}

object Anon_1Channels {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`1`,
    labels: js.Array[colorDashConvertLib.colorDashConvertLibStrings.keyword],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.KEYWORD, colorDashConvertLib.conversionsMod.RGB]
  ): Anon_1Channels = {
    val __obj = js.Dynamic.literal(channels = channels, labels = labels, rgb = rgb)
  
    __obj.asInstanceOf[Anon_1Channels]
  }
}

