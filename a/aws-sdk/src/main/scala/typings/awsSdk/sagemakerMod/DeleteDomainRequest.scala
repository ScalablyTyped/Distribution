package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainRequest extends js.Object {
  /**
    * The domain ID.
    */
  var DomainId: typings.awsSdk.sagemakerMod.DomainId = js.native
  /**
    * The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained (not automatically deleted). 
    */
  var RetentionPolicy: js.UndefOr[typings.awsSdk.sagemakerMod.RetentionPolicy] = js.native
}

object DeleteDomainRequest {
  @scala.inline
  def apply(DomainId: DomainId, RetentionPolicy: RetentionPolicy = null): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    if (RetentionPolicy != null) __obj.updateDynamic("RetentionPolicy")(RetentionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainRequest]
  }
}

