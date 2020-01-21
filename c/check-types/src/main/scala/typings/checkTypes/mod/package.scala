package typings.checkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MaybeFunction = js.Function1[/* val */ js.Any, scala.Boolean | js.Any]
  type NegationFunction = js.Function1[/* val */ js.Any, scala.Boolean]
}
