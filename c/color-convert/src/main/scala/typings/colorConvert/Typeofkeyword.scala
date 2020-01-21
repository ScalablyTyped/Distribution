package typings.colorConvert

import typings.colorConvert.colorConvertNumbers.`1`
import typings.colorConvert.colorConvertStrings.keyword
import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.RGB_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofkeyword extends js.Object {
  val channels: `1`
  val labels: js.Array[keyword]
  def rgb(keyword: KEYWORD_): RGB_
}

object Typeofkeyword {
  @scala.inline
  def apply(channels: `1`, labels: js.Array[keyword], rgb: KEYWORD_ => RGB_): Typeofkeyword = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofkeyword]
  }
}

