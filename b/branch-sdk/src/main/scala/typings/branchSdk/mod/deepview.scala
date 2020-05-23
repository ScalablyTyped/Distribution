package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("branch-sdk", "deepview")
@js.native
object deepview extends js.Object {
  def apply(deepview_data: DeepLinkData): Unit = js.native
  def apply(deepview_data: DeepLinkData, options: DeepViewOptions): Unit = js.native
  def apply(
    deepview_data: DeepLinkData,
    options: DeepViewOptions,
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
}

