package typings.codepage.codepageMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CP$Conv extends js.Object {
  var dec: NumberDictionary[String]
  var enc: StringDictionary[Double]
}

object CP$Conv {
  @scala.inline
  def apply(dec: NumberDictionary[String], enc: StringDictionary[Double]): CP$Conv = {
    val __obj = js.Dynamic.literal(dec = dec, enc = enc)
  
    __obj.asInstanceOf[CP$Conv]
  }
}

