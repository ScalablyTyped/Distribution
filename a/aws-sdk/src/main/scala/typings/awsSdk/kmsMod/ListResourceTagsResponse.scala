package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceTagsResponse extends js.Object {
  /**
    * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request. Do not assume or infer any information from this value.
    */
  var NextMarker: js.UndefOr[MarkerType] = js.native
  /**
    * A list of tags. Each tag consists of a tag key and a tag value.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in thisresponse to the Marker parameter in a subsequent request.
    */
  var Truncated: js.UndefOr[BooleanType] = js.native
}

object ListResourceTagsResponse {
  @scala.inline
  def apply(): ListResourceTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceTagsResponse]
  }
  @scala.inline
  implicit class ListResourceTagsResponseOps[Self <: ListResourceTagsResponse] (val x: Self) extends AnyVal {
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
    def setNextMarker(value: MarkerType): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTruncated(value: BooleanType): Self = this.set("Truncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncated: Self = this.set("Truncated", js.undefined)
  }
  
}

