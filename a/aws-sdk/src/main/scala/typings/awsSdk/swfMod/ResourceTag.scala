package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTag extends js.Object {
  /**
    * The key of a tag.
    */
  var key: ResourceTagKey = js.native
  /**
    * The value of a tag.
    */
  var value: js.UndefOr[ResourceTagValue] = js.native
}

object ResourceTag {
  @scala.inline
  def apply(key: ResourceTagKey): ResourceTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTag]
  }
  @scala.inline
  implicit class ResourceTagOps[Self <: ResourceTag] (val x: Self) extends AnyVal {
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
    def setKey(value: ResourceTagKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ResourceTagValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

