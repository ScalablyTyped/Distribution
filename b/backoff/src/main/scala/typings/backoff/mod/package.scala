package typings.backoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FunctionCallAny = typings.backoff.mod.FunctionCall[js.Array[_]] with typings.backoff.mod.FunctionCallArgsAny
  
  type TypedFunctionCall[T, E, R1, R2, R3] = typings.backoff.mod.FunctionCall[T] with (typings.backoff.mod.FunctionCallArgs[E, R1, R2, R3])
}
