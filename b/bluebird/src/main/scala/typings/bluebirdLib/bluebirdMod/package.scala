package typings
package bluebirdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bluebirdMod {
  type CatchFilter[E] = (js.Function1[/* error */ E, scala.Boolean]) | (js.Object with E)
  type Constructor[E] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, E]
  type IterateFunction[T, R] = js.Function3[/* item */ T, /* index */ scala.Double, /* arrayLength */ scala.Double, Resolvable[R]]
  type Resolvable[R] = R | js.Thenable[R]
  type ResolvableProps[T] = js.Object with bluebirdLib.bluebirdLibStrings.ResolvableProps with T
  /** @deprecated Use PromiseLike<T> directly. */
  type Thenable[T] = js.Thenable[T]
}
