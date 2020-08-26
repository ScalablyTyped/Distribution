package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthInfo extends js.Object {
  /**
    * The type of action for which the principal is being authorized.
    */
  var actionType: js.UndefOr[ActionType] = js.native
  /**
    * The resources for which the principal is being authorized to perform the specified action.
    */
  var resources: Resources = js.native
}

object AuthInfo {
  @scala.inline
  def apply(resources: Resources): AuthInfo = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthInfo]
  }
  @scala.inline
  implicit class AuthInfoOps[Self <: AuthInfo] (val x: Self) extends AnyVal {
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
    def setResourcesVarargs(value: Resource*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: Resources): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionType(value: ActionType): Self = this.set("actionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
  }
  
}

