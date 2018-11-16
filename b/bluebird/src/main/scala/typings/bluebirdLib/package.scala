package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bluebirdLib {
  type CatchFilter[E] = (ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, E]) | (js.Function1[/* error */ E, scala.Boolean]) | (js.Object with E)
  type IterableItem[R] = js.Any
  type IterableOrNever[R] = stdLib.Extract[R, stdLib.Iterable[js.Any]]
  type IterateFunction[T, R] = js.Function3[/* item */ T, /* index */ scala.Double, /* arrayLength */ scala.Double, Resolvable[R]]
  type Resolvable[R] = R | stdLib.PromiseLike[R]
}
