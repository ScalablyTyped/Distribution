package typings.bluebird

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bluebirdMod {
  import org.scalablytyped.runtime.Instantiable1

  type CatchFilter[E] = (js.Function1[/* error */ E, Boolean]) | (js.Object with E)
  type Constructor[E] = Instantiable1[/* args (repeated) */ js.Any, E]
  type IterateFunction[T, R] = js.Function3[/* item */ T, /* index */ Double, /* arrayLength */ Double, Resolvable[R]]
  type Resolvable[R] = R | js.Thenable[R]
  type ResolvableProps[T] = js.Object with typings.bluebird.bluebirdStrings.ResolvableProps with T
  /** @deprecated Use PromiseLike<T> directly. */
  type Thenable[T] = js.Thenable[T]
}
