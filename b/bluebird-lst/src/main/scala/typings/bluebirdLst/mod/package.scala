package typings.bluebirdLst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ResolvableProps[T] = js.Object with typings.bluebirdLst.bluebirdLstStrings.ResolvableProps with js.Any
  /** @deprecated Use PromiseLike<T> directly. */
  type Thenable[T] = js.Thenable[T]
}
