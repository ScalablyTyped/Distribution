package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tags extends js.Object {
  /**
    *  A complex type that contains Tag elements.
    */
  var Items: js.UndefOr[TagList] = js.native
}

object Tags {
  @scala.inline
  def apply(): Tags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tags]
  }
  @scala.inline
  implicit class TagsOps[Self <: Tags] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Tag*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: TagList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
  
}

