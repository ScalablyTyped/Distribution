package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupFilter extends js.Object {
  /**
    * The tag name.
    */
  var tagName: js.UndefOr[String] = js.native
  /**
    * The tag value.
    */
  var tagValue: js.UndefOr[String] = js.native
}

object ResourceGroupFilter {
  @scala.inline
  def apply(): ResourceGroupFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupFilter]
  }
  @scala.inline
  implicit class ResourceGroupFilterOps[Self <: ResourceGroupFilter] (val x: Self) extends AnyVal {
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
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    @scala.inline
    def setTagValue(value: String): Self = this.set("tagValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagValue: Self = this.set("tagValue", js.undefined)
  }
  
}

