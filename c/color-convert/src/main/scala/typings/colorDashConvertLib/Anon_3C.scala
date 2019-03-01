package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3C extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: js.Tuple3[
    colorDashConvertLib.colorDashConvertLibStrings.h, 
    colorDashConvertLib.colorDashConvertLibStrings.c, 
    colorDashConvertLib.colorDashConvertLibStrings.g
  ]
  def hsl(hcg: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HSL
  def hsv(hcg: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HSV
  def hwb(hcg: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.HWB
  def rgb(hcg: colorDashConvertLib.conversionsMod.HCG): colorDashConvertLib.conversionsMod.RGB
}

object Anon_3C {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    hsl: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.HSL],
    hsv: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.HSV],
    hwb: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.HWB],
    labels: js.Tuple3[
      colorDashConvertLib.colorDashConvertLibStrings.h, 
      colorDashConvertLib.colorDashConvertLibStrings.c, 
      colorDashConvertLib.colorDashConvertLibStrings.g
    ],
    rgb: js.Function1[colorDashConvertLib.conversionsMod.HCG, colorDashConvertLib.conversionsMod.RGB]
  ): Anon_3C = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("hsl")(hsl)
    __obj.updateDynamic("hsv")(hsv)
    __obj.updateDynamic("hwb")(hwb)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("rgb")(rgb)
    __obj.asInstanceOf[Anon_3C]
  }
}

