package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountResponse extends js.Object {
  
  /**
    * A structure that contains information about the requested account.
    */
  var Account: js.UndefOr[typings.awsSdk.organizationsMod.Account] = js.native
}
object DescribeAccountResponse {
  
  @scala.inline
  def apply(): DescribeAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountResponse]
  }
  
  @scala.inline
  implicit class DescribeAccountResponseOps[Self <: DescribeAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount(value: Account): Self = this.set("Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
  }
}
