package typings.blissfuljs

import typings.blissfuljs.Array
import typings.blissfuljs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BlissNSNs {
  type BlissDecoratedArrayElement[T] = Array[T] with BlissCollectionArray[T]
  type BlissDecoratedElement[T] = Element with T
}
