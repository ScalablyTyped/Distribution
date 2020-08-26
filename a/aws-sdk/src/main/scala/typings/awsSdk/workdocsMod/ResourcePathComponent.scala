package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePathComponent extends js.Object {
  /**
    * The ID of the resource path.
    */
  var Id: js.UndefOr[IdType] = js.native
  /**
    * The name of the resource path.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
}

object ResourcePathComponent {
  @scala.inline
  def apply(): ResourcePathComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePathComponent]
  }
  @scala.inline
  implicit class ResourcePathComponentOps[Self <: ResourcePathComponent] (val x: Self) extends AnyVal {
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
    def setId(value: IdType): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: ResourceNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

