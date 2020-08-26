package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePath extends js.Object {
  /**
    * The components of the resource path.
    */
  var Components: js.UndefOr[ResourcePathComponentList] = js.native
}

object ResourcePath {
  @scala.inline
  def apply(): ResourcePath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePath]
  }
  @scala.inline
  implicit class ResourcePathOps[Self <: ResourcePath] (val x: Self) extends AnyVal {
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
    def setComponentsVarargs(value: ResourcePathComponent*): Self = this.set("Components", js.Array(value :_*))
    @scala.inline
    def setComponents(value: ResourcePathComponentList): Self = this.set("Components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("Components", js.undefined)
  }
  
}

