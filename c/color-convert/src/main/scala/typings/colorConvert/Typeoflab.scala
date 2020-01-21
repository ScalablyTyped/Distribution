package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`3`
import typings.colorConvert.colorConvertStrings.lab
import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.LCH_
import typings.colorConvert.conversionsMod.XYZ_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflab extends js.Object {
  val channels: `3`
  val labels: lab
  def lch(lab: LAB_): LCH_
  def xyz(lab: LAB_): XYZ_
}

object Typeoflab {
  @scala.inline
  def apply(channels: `3`, labels: lab, lch: LAB_ => LCH_, xyz: LAB_ => XYZ_): Typeoflab = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], lch = js.Any.fromFunction1(lch), xyz = js.Any.fromFunction1(xyz))
  
    __obj.asInstanceOf[Typeoflab]
  }
}

