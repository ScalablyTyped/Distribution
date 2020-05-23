package typings.browserfs.utilMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arrayish[T] extends /* idx */ NumberDictionary[T] {
  var length: Double
}

object Arrayish {
  @scala.inline
  def apply[T](length: Double, NumberDictionary: /* n */ NumberDictionary[T] = null): Arrayish[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Arrayish[T]]
  }
}

