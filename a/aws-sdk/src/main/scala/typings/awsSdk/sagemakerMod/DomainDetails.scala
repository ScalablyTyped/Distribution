package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDetails extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.sagemakerMod.CreationTime] = js.native
  /**
    * The domain's Amazon Resource Name (ARN).
    */
  var DomainArn: js.UndefOr[typings.awsSdk.sagemakerMod.DomainArn] = js.native
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typings.awsSdk.sagemakerMod.DomainId] = js.native
  /**
    * The domain name.
    */
  var DomainName: js.UndefOr[typings.awsSdk.sagemakerMod.DomainName] = js.native
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[typings.awsSdk.sagemakerMod.LastModifiedTime] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[DomainStatus] = js.native
  /**
    * The domain's URL.
    */
  var Url: js.UndefOr[String1024] = js.native
}

object DomainDetails {
  @scala.inline
  def apply(): DomainDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDetails]
  }
  @scala.inline
  implicit class DomainDetailsOps[Self <: DomainDetails] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDomainArn(value: DomainArn): Self = this.set("DomainArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainArn: Self = this.set("DomainArn", js.undefined)
    @scala.inline
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainId: Self = this.set("DomainId", js.undefined)
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: LastModifiedTime): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setStatus(value: DomainStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUrl(value: String1024): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
  
}

