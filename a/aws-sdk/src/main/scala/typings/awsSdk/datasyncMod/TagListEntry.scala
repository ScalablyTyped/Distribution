package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagListEntry extends js.Object {
  /**
    * The key for an AWS resource tag.
    */
  var Key: TagKey = js.native
  /**
    * The value for an AWS resource tag.
    */
  var Value: js.UndefOr[TagValue] = js.native
}

object TagListEntry {
  @scala.inline
  def apply(Key: TagKey): TagListEntry = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagListEntry]
  }
  @scala.inline
  implicit class TagListEntryOps[Self <: TagListEntry] (val x: Self) extends AnyVal {
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
    def setKey(value: TagKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: TagValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

