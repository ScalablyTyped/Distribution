package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The maximum number of objects to return for the request. 
    */
  var maxResults: js.UndefOr[TagsMaxResults] = js.native
  /**
    * The next token from the previous results.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The ARN that specifies the resource whose tags you want to list.
    */
  var resourceARN: fraudDetectorArn = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(resourceARN: fraudDetectorArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceARN = resourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  @scala.inline
  implicit class ListTagsForResourceRequestOps[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
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
    def setResourceARN(value: fraudDetectorArn): Self = this.set("resourceARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: TagsMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

