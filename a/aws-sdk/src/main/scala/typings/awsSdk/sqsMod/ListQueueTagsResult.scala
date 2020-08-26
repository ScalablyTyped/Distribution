package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueueTagsResult extends js.Object {
  /**
    * The list of all tags added to the specified queue.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object ListQueueTagsResult {
  @scala.inline
  def apply(): ListQueueTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueueTagsResult]
  }
  @scala.inline
  implicit class ListQueueTagsResultOps[Self <: ListQueueTagsResult] (val x: Self) extends AnyVal {
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
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

