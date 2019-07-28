package typings.bufferDashCompare.bufferDashCompareMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List
  extends /* index */ NumberDictionary[js.Any] {
  var length: Double
}

object List {
  @scala.inline
  def apply(length: Double, NumberDictionary: /* index */ NumberDictionary[js.Any] = null): List = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[List]
  }
}

