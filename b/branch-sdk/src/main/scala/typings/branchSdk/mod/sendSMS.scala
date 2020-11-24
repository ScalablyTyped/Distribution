package typings.branchSdk.mod

import typings.branchSdk.anon.Makenewlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("branch-sdk", "sendSMS")
@js.native
object sendSMS extends js.Object {
  
  def apply(phone: String, link_data: DeepLinkData): Unit = js.native
  def apply(
    phone: String,
    link_data: DeepLinkData,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  def apply(phone: String, link_data: DeepLinkData, options: Makenewlink): Unit = js.native
  def apply(
    phone: String,
    link_data: DeepLinkData,
    options: Makenewlink,
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
}
