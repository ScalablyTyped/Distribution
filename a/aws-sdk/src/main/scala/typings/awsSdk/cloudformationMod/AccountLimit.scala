package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountLimit extends js.Object {
  /**
    * The name of the account limit. Values: ConcurrentResourcesLimit | StackLimit | StackOutputsLimit 
    */
  var Name: js.UndefOr[LimitName] = js.native
  /**
    * The value that is associated with the account limit name.
    */
  var Value: js.UndefOr[LimitValue] = js.native
}

object AccountLimit {
  @scala.inline
  def apply(): AccountLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLimit]
  }
  @scala.inline
  implicit class AccountLimitOps[Self <: AccountLimit] (val x: Self) extends AnyVal {
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
    def setName(value: LimitName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setValue(value: LimitValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

