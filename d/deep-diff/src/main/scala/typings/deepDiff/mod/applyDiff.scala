package typings.deepDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("deep-diff", "applyDiff")
@js.native
object applyDiff extends js.Object {
  
  def apply[LHS, RHS](target: LHS, source: RHS): Unit = js.native
  def apply[LHS, RHS](target: LHS, source: RHS, filter: Filter[LHS, RHS]): Unit = js.native
}
