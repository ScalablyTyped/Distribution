package typings
package dataloaderLib.dataloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DataLoaderNs {
  type BatchLoadFn[K, V] = js.Function1[/* keys */ js.Array[K], js.Promise[js.Array[V | stdLib.Error]]]
}
