package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetResource extends js.Object {
  /**
    * The ID of the resource.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name of the resource.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The type of the resource.
    */
  var resourceType: js.UndefOr[String] = js.native
}

object TargetResource {
  @scala.inline
  def apply(): TargetResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetResource]
  }
  @scala.inline
  implicit class TargetResourceOps[Self <: TargetResource] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}

