package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsResponse extends js.Object {
  /**
    * If the request included a Marker, the response returns that value in this field.
    */
  var Marker: js.UndefOr[typings.awsSdk.efsMod.Marker] = js.native
  /**
    * If a value is present, there are more tags to return. In a subsequent request, you can provide the value of NextMarker as the value of the Marker parameter in your next request to retrieve the next set of tags.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
  /**
    * Returns tags associated with the file system as an array of Tag objects. 
    */
  var Tags: typings.awsSdk.efsMod.Tags = js.native
}

object DescribeTagsResponse {
  @scala.inline
  def apply(Tags: Tags): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsResponse]
  }
  @scala.inline
  implicit class DescribeTagsResponseOps[Self <: DescribeTagsResponse] (val x: Self) extends AnyVal {
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
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

