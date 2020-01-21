package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsForDomainRequest extends js.Object {
  /**
    * The domain for which you want to delete one or more tags.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * A list of tag keys to delete.
    */
  var TagsToDelete: TagKeyList = js.native
}

object DeleteTagsForDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName, TagsToDelete: TagKeyList): DeleteTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], TagsToDelete = TagsToDelete.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTagsForDomainRequest]
  }
}

