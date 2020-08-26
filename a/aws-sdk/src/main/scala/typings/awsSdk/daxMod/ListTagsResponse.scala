package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsResponse extends js.Object {
  /**
    * If this value is present, there are additional results to be displayed. To retrieve them, call ListTags again, with NextToken set to this value.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of tags currently associated with the DAX cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

