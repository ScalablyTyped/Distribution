package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTagsForDomainRequest extends js.Object {
  /**
    * The domain for which you want to add or update tags.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the corresponding value will be replaced.
    */
  var TagsToUpdate: js.UndefOr[TagList] = js.native
}

object UpdateTagsForDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName, TagsToUpdate: TagList = null): UpdateTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (TagsToUpdate != null) __obj.updateDynamic("TagsToUpdate")(TagsToUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagsForDomainRequest]
  }
}

