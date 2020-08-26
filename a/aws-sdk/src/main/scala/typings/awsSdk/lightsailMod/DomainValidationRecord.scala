package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainValidationRecord extends js.Object {
  /**
    * The domain name of the certificate validation record. For example, example.com or www.example.com.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
    */
  var resourceRecord: js.UndefOr[ResourceRecord] = js.native
}

object DomainValidationRecord {
  @scala.inline
  def apply(): DomainValidationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainValidationRecord]
  }
  @scala.inline
  implicit class DomainValidationRecordOps[Self <: DomainValidationRecord] (val x: Self) extends AnyVal {
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
    def setDomainName(value: DomainName): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setResourceRecord(value: ResourceRecord): Self = this.set("resourceRecord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceRecord: Self = this.set("resourceRecord", js.undefined)
  }
  
}

