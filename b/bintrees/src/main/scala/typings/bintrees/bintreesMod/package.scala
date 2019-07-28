package typings.bintrees

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bintreesMod {
  type Callback[T] = js.Function1[/* item */ T, Unit]
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Double]
}
