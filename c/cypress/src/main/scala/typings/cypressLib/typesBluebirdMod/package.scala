package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesBluebirdMod {
  type ResolvableProps[T] = js.Object with cypressLib.cypressLibStrings.ResolvableProps with js.Any
  /** @deprecated Use PromiseLike<T> directly. */
  type Thenable[T] = js.Thenable[T]
}
