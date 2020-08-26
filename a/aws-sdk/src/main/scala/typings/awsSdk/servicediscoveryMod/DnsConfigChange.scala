package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DnsConfigChange extends js.Object {
  /**
    * An array that contains one DnsRecord object for each Route 53 record that you want AWS Cloud Map to create when you register an instance.
    */
  var DnsRecords: DnsRecordList = js.native
}

object DnsConfigChange {
  @scala.inline
  def apply(DnsRecords: DnsRecordList): DnsConfigChange = {
    val __obj = js.Dynamic.literal(DnsRecords = DnsRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsConfigChange]
  }
  @scala.inline
  implicit class DnsConfigChangeOps[Self <: DnsConfigChange] (val x: Self) extends AnyVal {
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
    def setDnsRecordsVarargs(value: DnsRecord*): Self = this.set("DnsRecords", js.Array(value :_*))
    @scala.inline
    def setDnsRecords(value: DnsRecordList): Self = this.set("DnsRecords", value.asInstanceOf[js.Any])
  }
  
}

