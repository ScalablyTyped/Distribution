package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcesMoveInfo extends js.Object {
  /**
    * The IDs of the resources.
    */
  var resources: js.UndefOr[js.Array[String]] = js.native
  /**
    * The target resource group.
    */
  var targetResourceGroup: js.UndefOr[String] = js.native
}

object ResourcesMoveInfo {
  @scala.inline
  def apply(): ResourcesMoveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesMoveInfo]
  }
  @scala.inline
  implicit class ResourcesMoveInfoOps[Self <: ResourcesMoveInfo] (val x: Self) extends AnyVal {
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
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setTargetResourceGroup(value: String): Self = this.set("targetResourceGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetResourceGroup: Self = this.set("targetResourceGroup", js.undefined)
  }
  
}

