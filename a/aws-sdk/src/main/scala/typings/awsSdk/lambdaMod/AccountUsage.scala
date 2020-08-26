package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUsage extends js.Object {
  /**
    * The number of Lambda functions.
    */
  var FunctionCount: js.UndefOr[Long] = js.native
  /**
    * The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
    */
  var TotalCodeSize: js.UndefOr[Long] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFunctionCount(value: Long): Self = this.set("FunctionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionCount: Self = this.set("FunctionCount", js.undefined)
    @scala.inline
    def setTotalCodeSize(value: Long): Self = this.set("TotalCodeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCodeSize: Self = this.set("TotalCodeSize", js.undefined)
  }
  
}

