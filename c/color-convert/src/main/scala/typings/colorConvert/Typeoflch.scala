package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`3`
import typings.colorConvert.colorConvertStrings.lch
import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.LCH_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflch extends js.Object {
  val channels: `3`
  val labels: lch
  def lab(lch: LCH_): LAB_
}

object Typeoflch {
  @scala.inline
  def apply(channels: `3`, lab: LCH_ => LAB_, labels: lch): Typeoflch = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], lab = js.Any.fromFunction1(lab), labels = labels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeoflch]
  }
}

