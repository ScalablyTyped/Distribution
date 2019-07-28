package typings.bluebirdDashGlobal.bluebirdDashGlobalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Global {
  type IterateFunction[T, R] = js.Function3[/* item */ T, /* index */ Double, /* arrayLength */ Double, R | js.Thenable[R]]
}
