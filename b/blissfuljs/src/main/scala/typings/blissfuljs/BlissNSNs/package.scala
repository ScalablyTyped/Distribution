package typings.blissfuljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BlissNSNs {
  import typings.blissfuljs.Array
  import typings.blissfuljs.Element

  type BlissDecoratedArrayElement[T] = Array[T] with BlissCollectionArray[T]
  type BlissDecoratedElement[T] = Element with T
}
