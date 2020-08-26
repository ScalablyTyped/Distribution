package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedZone extends js.Object {
  /**
    * The value that you specified for CallerReference when you created the hosted zone.
    */
  var CallerReference: Nonce = js.native
  /**
    * A complex type that includes the Comment and PrivateZone elements. If you omitted the HostedZoneConfig and Comment elements from the request, the Config and Comment elements don't appear in the response.
    */
  var Config: js.UndefOr[HostedZoneConfig] = js.native
  /**
    * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
    */
  var Id: ResourceId = js.native
  /**
    * If the hosted zone was created by another service, the service that created the hosted zone. When a hosted zone is created by another service, you can't edit or delete it using Route 53. 
    */
  var LinkedService: js.UndefOr[typings.awsSdk.route53Mod.LinkedService] = js.native
  /**
    * The name of the domain. For public hosted zones, this is the name that you have registered with your DNS registrar. For information about how to specify characters other than a-z, 0-9, and - (hyphen) and how to specify internationalized domain names, see CreateHostedZone.
    */
  var Name: DNSName = js.native
  /**
    * The number of resource record sets in the hosted zone.
    */
  var ResourceRecordSetCount: js.UndefOr[HostedZoneRRSetCount] = js.native
}

object HostedZone {
  @scala.inline
  def apply(CallerReference: Nonce, Id: ResourceId, Name: DNSName): HostedZone = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedZone]
  }
  @scala.inline
  implicit class HostedZoneOps[Self <: HostedZone] (val x: Self) extends AnyVal {
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
    def setCallerReference(value: Nonce): Self = this.set("CallerReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: ResourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: DNSName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: HostedZoneConfig): Self = this.set("Config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("Config", js.undefined)
    @scala.inline
    def setLinkedService(value: LinkedService): Self = this.set("LinkedService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedService: Self = this.set("LinkedService", js.undefined)
    @scala.inline
    def setResourceRecordSetCount(value: HostedZoneRRSetCount): Self = this.set("ResourceRecordSetCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceRecordSetCount: Self = this.set("ResourceRecordSetCount", js.undefined)
  }
  
}

