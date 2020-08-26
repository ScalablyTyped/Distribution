package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTestGridProjectRequest extends js.Object {
  /**
    * Human-readable description of the project.
    */
  var description: js.UndefOr[ResourceDescription] = js.native
  /**
    * Human-readable name of the Selenium testing project.
    */
  var name: ResourceName = js.native
}

object CreateTestGridProjectRequest {
  @scala.inline
  def apply(name: ResourceName): CreateTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTestGridProjectRequest]
  }
  @scala.inline
  implicit class CreateTestGridProjectRequestOps[Self <: CreateTestGridProjectRequest] (val x: Self) extends AnyVal {
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
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: ResourceDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

