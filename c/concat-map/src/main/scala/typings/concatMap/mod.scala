package typings.concatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("concat-map", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T, R](xs: js.Array[T], fn: js.Function1[/* x */ T, R | js.Array[R]]): js.Array[R] = js.native
}
