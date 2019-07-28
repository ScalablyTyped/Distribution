package typings.checkDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object checkDashTypesMod {
  type MaybeFunction = js.Function1[/* val */ js.Any, Boolean | js.Any]
  type NegationFunction = js.Function1[/* val */ js.Any, Boolean]
}
