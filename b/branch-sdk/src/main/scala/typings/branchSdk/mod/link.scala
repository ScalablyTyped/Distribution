package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("branch-sdk", "link")
@js.native
object link extends js.Object {
  
  def apply(
    link_data: DeepLinkData,
    callback: js.Function2[/* err */ BranchError, /* link */ String | Null, Unit]
  ): Unit = js.native
}
