package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsResponse extends js.Object {
  /**
    * The call returns a token. Use this token to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Depending on the input, this is a list of configuration items tagged with a specific tag, or a list of tags for a specific configuration item.
    */
  var tags: js.UndefOr[ConfigurationTagSet] = js.native
}

object DescribeTagsResponse {
  @scala.inline
  def apply(): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagsResponse]
  }
  @scala.inline
  implicit class DescribeTagsResponseOps[Self <: DescribeTagsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setTagsVarargs(value: ConfigurationTag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: ConfigurationTagSet): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

