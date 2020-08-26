package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDefinitionVersion extends js.Object {
  /**
    * A list of resources.
    */
  var Resources: js.UndefOr[listOfResource] = js.native
}

object ResourceDefinitionVersion {
  @scala.inline
  def apply(): ResourceDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDefinitionVersion]
  }
  @scala.inline
  implicit class ResourceDefinitionVersionOps[Self <: ResourceDefinitionVersion] (val x: Self) extends AnyVal {
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
    def setResourcesVarargs(value: Resource*): Self = this.set("Resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: listOfResource): Self = this.set("Resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
  }
  
}

