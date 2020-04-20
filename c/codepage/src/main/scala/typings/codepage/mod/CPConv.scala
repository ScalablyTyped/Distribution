package typings.codepage.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPConv extends js.Object {
  var dec: NumberDictionary[String]
  var enc: StringDictionary[Double]
}

object CPConv {
  @scala.inline
  def apply(dec: NumberDictionary[String], enc: StringDictionary[Double]): CPConv = {
    val __obj = js.Dynamic.literal(dec = dec.asInstanceOf[js.Any], enc = enc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPConv]
  }
}

