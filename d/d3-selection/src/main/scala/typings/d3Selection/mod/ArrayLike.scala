package typings.d3Selection.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayLike[T] extends /* index */ NumberDictionary[T] {
  var length: Double
  def item(index: Double): T | Null
}

object ArrayLike {
  @scala.inline
  def apply[T](item: Double => T | Null, length: Double, NumberDictionary: /* index */ NumberDictionary[T] = null): ArrayLike[T] = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ArrayLike[T]]
  }
}

