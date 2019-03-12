package typings
package d3DashSelectionLib.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayLike[T]
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[T] {
  var length: scala.Double
  def item(index: scala.Double): T | scala.Null
}

object ArrayLike {
  @scala.inline
  def apply[T](
    item: scala.Double => T | scala.Null,
    length: scala.Double,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[T] = null
  ): ArrayLike[T] = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ArrayLike[T]]
  }
}

