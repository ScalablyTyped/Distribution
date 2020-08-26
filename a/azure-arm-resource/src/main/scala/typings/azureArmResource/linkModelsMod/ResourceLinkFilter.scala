package typings.azureArmResource.linkModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceLinkFilter extends js.Object {
  /**
    * The ID of the target resource.
    */
  var targetId: String = js.native
}

object ResourceLinkFilter {
  @scala.inline
  def apply(targetId: String): ResourceLinkFilter = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLinkFilter]
  }
  @scala.inline
  implicit class ResourceLinkFilterOps[Self <: ResourceLinkFilter] (val x: Self) extends AnyVal {
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
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
  }
  
}

