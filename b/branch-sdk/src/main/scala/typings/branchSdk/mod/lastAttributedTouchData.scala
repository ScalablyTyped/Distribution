package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("branch-sdk", "lastAttributedTouchData")
@js.native
object lastAttributedTouchData extends js.Object {
  
  def apply(attribution_window: Double): Unit = js.native
  def apply(attribution_window: Double, callback: js.Function2[/* err */ BranchError, /* data */ js.Any, Unit]): Unit = js.native
}
