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
  def apply(DomainId: DomainId): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainRequest]
  }
  @scala.inline
  implicit class DeleteDomainRequestOps[Self <: DeleteDomainRequest] (val x: Self) extends AnyVal {
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
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetentionPolicy(value: RetentionPolicy): Self = this.set("RetentionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetentionPolicy: Self = this.set("RetentionPolicy", js.undefined)
  }
  
}

