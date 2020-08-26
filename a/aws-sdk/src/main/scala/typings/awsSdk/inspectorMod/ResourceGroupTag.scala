package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupTag extends js.Object {
  /**
    * A tag key.
    */
  var key: TagKey = js.native
  /**
    * The value assigned to a tag key.
    */
  var value: js.UndefOr[TagValue] = js.native
}

object ResourceGroupTag {
  @scala.inline
  def apply(key: TagKey): ResourceGroupTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceGroupTag]
  }
  @scala.inline
  implicit class ResourceGroupTagOps[Self <: ResourceGroupTag] (val x: Self) extends AnyVal {
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
    def setKey(value: TagKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: TagValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

