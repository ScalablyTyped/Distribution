package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsResponse extends js.Object {
  /**
    * The function's tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.lambdaMod.Tags] = js.native
}

object ListTagsResponse {
  @scala.inline
  def apply(): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsResponse]
  }
  @scala.inline
  implicit class ListTagsResponseOps[Self <: ListTagsResponse] (val x: Self) extends AnyVal {
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
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

