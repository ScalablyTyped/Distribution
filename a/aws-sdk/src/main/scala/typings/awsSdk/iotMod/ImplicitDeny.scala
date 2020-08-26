package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImplicitDeny extends js.Object {
  /**
    * Policies that don't contain a matching allow or deny statement for the specified action on the specified resource. 
    */
  var policies: js.UndefOr[Policies] = js.native
}

object ImplicitDeny {
  @scala.inline
  def apply(): ImplicitDeny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImplicitDeny]
  }
  @scala.inline
  implicit class ImplicitDenyOps[Self <: ImplicitDeny] (val x: Self) extends AnyVal {
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
    def setPoliciesVarargs(value: Policy*): Self = this.set("policies", js.Array(value :_*))
    @scala.inline
    def setPolicies(value: Policies): Self = this.set("policies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
  }
  
}

