package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcTenancyResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, returns an error.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.native
}

object ModifyVpcTenancyResult {
  @scala.inline
  def apply(): ModifyVpcTenancyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpcTenancyResult]
  }
  @scala.inline
  implicit class ModifyVpcTenancyResultOps[Self <: ModifyVpcTenancyResult] (val x: Self) extends AnyVal {
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
    def setReturnValue(value: Boolean): Self = this.set("ReturnValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnValue: Self = this.set("ReturnValue", js.undefined)
  }
  
}

