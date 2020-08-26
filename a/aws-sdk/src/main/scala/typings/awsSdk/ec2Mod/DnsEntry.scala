package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DnsEntry extends js.Object {
  /**
    * The DNS name.
    */
  var DnsName: js.UndefOr[String] = js.native
  /**
    * The ID of the private hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.native
}

object DnsEntry {
  @scala.inline
  def apply(): DnsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsEntry]
  }
  @scala.inline
  implicit class DnsEntryOps[Self <: DnsEntry] (val x: Self) extends AnyVal {
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
    def setDnsName(value: String): Self = this.set("DnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsName: Self = this.set("DnsName", js.undefined)
    @scala.inline
    def setHostedZoneId(value: String): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedZoneId: Self = this.set("HostedZoneId", js.undefined)
  }
  
}

