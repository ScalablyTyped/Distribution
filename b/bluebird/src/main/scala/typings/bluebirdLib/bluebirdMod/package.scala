package typings
package bluebirdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bluebirdMod {
  type ResolvableProps[T] = js.Object with bluebirdLib.bluebirdLibStrings.ResolvableProps with T
  /** @deprecated Use PromiseLike<T> directly. */
  type Thenable[T] = js.Thenable[T]
}
