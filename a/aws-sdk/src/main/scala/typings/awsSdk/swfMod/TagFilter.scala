package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagFilter extends js.Object {
  /**
    *  Specifies the tag that must be associated with the execution for it to meet the filter criteria. Tags may only contain unicode letters, digits, whitespace, or these symbols: _ . : / = + - @.
    */
  var tag: Tag = js.native
}

object TagFilter {
  @scala.inline
  def apply(tag: Tag): TagFilter = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFilter]
  }
  @scala.inline
  implicit class TagFilterOps[Self <: TagFilter] (val x: Self) extends AnyVal {
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
    def setTag(value: Tag): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
  
}

