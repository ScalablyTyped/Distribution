package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceOutput extends js.Object {
  /**
    * If you specify this parameter and the result of a ListTagsForResource call is truncated, the response includes a token that you can use in the next request to fetch the next set of tags. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoMod.NextToken] = js.native
  /**
    * A map of tag keys and values associated with the specified signaling channel.
    */
  var Tags: js.UndefOr[ResourceTags] = js.native
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
  @scala.inline
  implicit class ListTagsForResourceOutputOps[Self <: ListTagsForResourceOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTags(value: ResourceTags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

