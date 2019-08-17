package typings.dataloader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataloaderMod {
  import typings.std.Error

  type BatchLoadFn[K, V] = js.Function1[/* keys */ js.Array[K], js.Promise[js.Array[V | Error]]]
}
