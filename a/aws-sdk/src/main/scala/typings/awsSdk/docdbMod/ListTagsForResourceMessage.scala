package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceMessage extends js.Object {
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The Amazon DocumentDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
    */
  var ResourceName: String = js.native
}

object ListTagsForResourceMessage {
  @scala.inline
  def apply(ResourceName: String): ListTagsForResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceMessage]
  }
  @scala.inline
  implicit class ListTagsForResourceMessageOps[Self <: ListTagsForResourceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceName(value: String): Self = this.set("ResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
  }
  
}

