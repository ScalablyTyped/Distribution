package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForDomainRequest extends js.Object {
  /**
    * The domain for which you want to get a list of tags.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
}

object ListTagsForDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): ListTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForDomainRequest]
  }
}

