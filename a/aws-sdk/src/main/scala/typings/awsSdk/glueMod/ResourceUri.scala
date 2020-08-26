package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceUri extends js.Object {
  /**
    * The type of the resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.glueMod.ResourceType] = js.native
  /**
    * The URI for accessing the resource.
    */
  var Uri: js.UndefOr[URI] = js.native
}

object ResourceUri {
  @scala.inline
  def apply(): ResourceUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUri]
  }
  @scala.inline
  implicit class ResourceUriOps[Self <: ResourceUri] (val x: Self) extends AnyVal {
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
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setUri(value: URI): Self = this.set("Uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("Uri", js.undefined)
  }
  
}

