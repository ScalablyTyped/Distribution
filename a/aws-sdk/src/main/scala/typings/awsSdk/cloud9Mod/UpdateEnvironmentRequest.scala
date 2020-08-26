package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEnvironmentRequest extends js.Object {
  /**
    * Any new or replacement description for the environment.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.native
  /**
    * The ID of the environment to change settings.
    */
  var environmentId: EnvironmentId = js.native
  /**
    * A replacement name for the environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.native
}

object UpdateEnvironmentRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId): UpdateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentRequest]
  }
  @scala.inline
  implicit class UpdateEnvironmentRequestOps[Self <: UpdateEnvironmentRequest] (val x: Self) extends AnyVal {
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
    def setEnvironmentId(value: EnvironmentId): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: EnvironmentDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: EnvironmentName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

