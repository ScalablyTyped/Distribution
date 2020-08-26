package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDBProxyTargetsResponse extends js.Object {
  /**
    * One or more DBProxyTarget objects that are created when you register targets with a target group.
    */
  var DBProxyTargets: js.UndefOr[TargetList] = js.native
}

object RegisterDBProxyTargetsResponse {
  @scala.inline
  def apply(): RegisterDBProxyTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDBProxyTargetsResponse]
  }
  @scala.inline
  implicit class RegisterDBProxyTargetsResponseOps[Self <: RegisterDBProxyTargetsResponse] (val x: Self) extends AnyVal {
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
    def setDBProxyTargetsVarargs(value: DBProxyTarget*): Self = this.set("DBProxyTargets", js.Array(value :_*))
    @scala.inline
    def setDBProxyTargets(value: TargetList): Self = this.set("DBProxyTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBProxyTargets: Self = this.set("DBProxyTargets", js.undefined)
  }
  
}

