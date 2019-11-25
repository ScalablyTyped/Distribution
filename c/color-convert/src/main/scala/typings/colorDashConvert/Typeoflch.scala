package typings.colorDashConvert

import typings.colorDashConvert.colorDashConvertNumbers.`3`
import typings.colorDashConvert.colorDashConvertStrings.lch
import typings.colorDashConvert.conversionsMod.LAB
import typings.colorDashConvert.conversionsMod.LCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflch extends js.Object {
  val channels: `3`
  val labels: lch
  def lab(lch: LCH): LAB
}

object Typeoflch {
  @scala.inline
  def apply(channels: `3`, lab: LCH => LAB, labels: lch): Typeoflch = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], lab = js.Any.fromFunction1(lab), labels = labels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeoflch]
  }
}

