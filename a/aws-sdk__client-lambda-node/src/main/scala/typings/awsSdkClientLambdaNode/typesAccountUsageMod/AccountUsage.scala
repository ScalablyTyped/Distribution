package typings.awsSdkClientLambdaNode.typesAccountUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountUsage extends js.Object {
  
  /**
    * <p>The number of your account's existing functions per region.</p>
    */
  var FunctionCount: js.UndefOr[Double] = js.native
  
  /**
    * <p>Total size, in bytes, of the account's deployment packages per region.</p>
    */
  var TotalCodeSize: js.UndefOr[Double] = js.native
}
object AccountUsage {
  
  @scala.inline
  def apply(): AccountUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUsage]
  }
  
  @scala.inline
  implicit class AccountUsageOps[Self <: AccountUsage] (val x: Self) extends AnyVal {
    
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
    def setFunctionCount(value: Double): Self = this.set("FunctionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionCount: Self = this.set("FunctionCount", js.undefined)
    
    @scala.inline
    def setTotalCodeSize(value: Double): Self = this.set("TotalCodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCodeSize: Self = this.set("TotalCodeSize", js.undefined)
  }
}
