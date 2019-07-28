package typings.blissfuljs

import typings.blissfuljs.BlissNSNs.BlissBindedArray
import typings.blissfuljs.BlissNSNs.BlissCollectionArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  var `_`: BlissBindedArray[T] with BlissCollectionArray[T]
}

object Array {
  @scala.inline
  def apply[T](`_`: BlissBindedArray[T] with BlissCollectionArray[T]): Array[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(`_`)
    __obj.asInstanceOf[Array[T]]
  }
}

