package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesBluebirdMod {
  type ResolvableProps[T] = js.Object with typings.cypress.cypressStrings.ResolvableProps with js.Any
  /** @deprecated Use PromiseLike<T> directly. */
  type Thenable[T] = js.Thenable[T]
}
