package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyEnvironmentManagedActionRequest extends js.Object {
  /**
    * The action ID of the scheduled managed action to execute.
    */
  var ActionId: String = js.native
  /**
    * The environment ID of the target environment.
    */
  var EnvironmentId: js.UndefOr[String] = js.native
  /**
    * The name of the target environment.
    */
  var EnvironmentName: js.UndefOr[String] = js.native
}

object ApplyEnvironmentManagedActionRequest {
  @scala.inline
  def apply(ActionId: String): ApplyEnvironmentManagedActionRequest = {
    val __obj = js.Dynamic.literal(ActionId = ActionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyEnvironmentManagedActionRequest]
  }
  @scala.inline
  implicit class ApplyEnvironmentManagedActionRequestOps[Self <: ApplyEnvironmentManagedActionRequest] (val x: Self) extends AnyVal {
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
    def setActionId(value: String): Self = this.set("ActionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentId(value: String): Self = this.set("EnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentId: Self = this.set("EnvironmentId", js.undefined)
    @scala.inline
    def setEnvironmentName(value: String): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
  }
  
}

