package typings.dataloader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BatchLoadFn[K, V] = js.Function1[/* keys */ js.Array[K], js.Thenable[typings.std.ArrayLike[V | typings.std.Error]]]
}
