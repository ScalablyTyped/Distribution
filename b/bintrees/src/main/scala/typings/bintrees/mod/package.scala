package typings.bintrees

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function1[/* item */ T, scala.Unit]
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
}
