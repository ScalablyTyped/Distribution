package typings.crossfilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CrossFilterNs {
  type Bisection[T, U] = js.Function4[/* array */ js.Array[T], /* value */ U, /* lo */ Double, /* hi */ Double, Double]
  type HeapSelect[T] = js.Function4[/* array */ js.Array[T], /* lo */ Double, /* hi */ Double, /* k */ Double, js.Array[T]]
  type Selector[T] = js.Function1[/* value */ T, js.Any]
  type Sort[T] = js.Function3[/* array */ js.Array[T], /* lo */ Double, /* hi */ Double, js.Array[T]]
}
