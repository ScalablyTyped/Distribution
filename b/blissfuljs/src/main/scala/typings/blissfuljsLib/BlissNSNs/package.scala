package typings
package blissfuljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BlissNSNs {
  type BlissDecoratedArrayElement[T] = blissfuljsLib.Array[T] with BlissCollectionArray[T]
  type BlissDecoratedElement[T] = blissfuljsLib.Element with T
}
