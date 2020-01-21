package typings.broccoliPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type MapSeriesIterator[T] = js.Function3[/* item */ T, /* index */ scala.Double, /* array */ js.Array[T], js.Promise[T] | T]
}
