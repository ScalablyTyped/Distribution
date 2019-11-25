package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.lab
import typings.colorDashConvert.conversionsMod.LAB
import typings.colorDashConvert.conversionsMod.LCH
import typings.colorDashConvert.conversionsMod.XYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflab extends js.Object {
  val channels: `3`
  val labels: lab
  def lch(lab: LAB): LCH
  def xyz(lab: LAB): XYZ
}

object Typeoflab {
  @scala.inline
  def apply(channels: `3`, labels: lab, lch: LAB => LCH, xyz: LAB => XYZ): Typeoflab = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], lch = js.Any.fromFunction1(lch), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[Typeoflab]
  }
}

