package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupPatchable extends js.Object {
  /**
    * The ID of the resource that manages this resource group.
    */
  var managedBy: js.UndefOr[String] = js.native
  /**
    * The name of the resource group.
    */
  var name: js.UndefOr[String] = js.native
  var properties: js.UndefOr[ResourceGroupProperties] = js.native
  /**
    * The tags attached to the resource group.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
}

object ResourceGroupPatchable {
  @scala.inline
  def apply(): ResourceGroupPatchable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupPatchable]
  }
  @scala.inline
  implicit class ResourceGroupPatchableOps[Self <: ResourceGroupPatchable] (val x: Self) extends AnyVal {
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
    def setManagedBy(value: String): Self = this.set("managedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedBy: Self = this.set("managedBy", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProperties(value: ResourceGroupProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

