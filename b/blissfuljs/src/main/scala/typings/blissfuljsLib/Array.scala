package typings
package blissfuljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  var `_`: blissfuljsLib.BlissNSNs.BlissBindedArray[T] with blissfuljsLib.BlissNSNs.BlissCollectionArray[T]
}

object Array {
  @scala.inline
  def apply[T](
    `_`: blissfuljsLib.BlissNSNs.BlissBindedArray[T] with blissfuljsLib.BlissNSNs.BlissCollectionArray[T]
  ): Array[T] = {
    val __obj = js.Dynamic.literal(`_` = `_`)
  
    __obj.asInstanceOf[Array[T]]
  }
}

