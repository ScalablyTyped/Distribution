package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForDomainResponse extends js.Object {
  /**
    * A list of the tags that are associated with the specified domain.
    */
  var TagList: typings.awsSdk.route53domainsMod.TagList = js.native
}

object ListTagsForDomainResponse {
  @scala.inline
  def apply(TagList: TagList): ListTagsForDomainResponse = {
    val __obj = js.Dynamic.literal(TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForDomainResponse]
  }
  @scala.inline
  implicit class ListTagsForDomainResponseOps[Self <: ListTagsForDomainResponse] (val x: Self) extends AnyVal {
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
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
  }
  
}

