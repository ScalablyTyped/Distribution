package typings
package backoffLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object backoffMod {
  type FunctionCallAny = FunctionCall[js.Array[_]] with FunctionCallArgsAny
  type TypedFunctionCall[T, E, R1, R2, R3] = FunctionCall[T] with (FunctionCallArgs[E, R1, R2, R3])
}
