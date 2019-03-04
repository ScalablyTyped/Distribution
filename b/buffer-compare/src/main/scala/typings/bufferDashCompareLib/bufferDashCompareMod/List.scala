package typings
package bufferDashCompareLib.bufferDashCompareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[js.Any] {
  var length: scala.Double
}

object List {
  @scala.inline
  def apply(
    length: scala.Double,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[js.Any] = null
  ): List = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[List]
  }
}

