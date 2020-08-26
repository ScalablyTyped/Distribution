package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestDNSAnswerRequest extends js.Object {
  /**
    * If the resolver that you specified for resolverip supports EDNS0, specify the IPv4 or IPv6 address of a client in the applicable location, for example, 192.0.2.44 or 2001:db8:85a3::8a2e:370:7334.
    */
  var EDNS0ClientSubnetIP: js.UndefOr[IPAddress] = js.native
  /**
    * If you specify an IP address for edns0clientsubnetip, you can optionally specify the number of bits of the IP address that you want the checking tool to include in the DNS query. For example, if you specify 192.0.2.44 for edns0clientsubnetip and 24 for edns0clientsubnetmask, the checking tool will simulate a request from 192.0.2.0/24. The default value is 24 bits for IPv4 addresses and 64 bits for IPv6 addresses. The range of valid values depends on whether edns0clientsubnetip is an IPv4 or an IPv6 address:    IPv4: Specify a value between 0 and 32    IPv6: Specify a value between 0 and 128  
    */
  var EDNS0ClientSubnetMask: js.UndefOr[SubnetMask] = js.native
  /**
    * The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * The name of the resource record set that you want Amazon Route 53 to simulate a query for.
    */
  var RecordName: DNSName = js.native
  /**
    * The type of the resource record set.
    */
  var RecordType: RRType = js.native
  /**
    * If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver. If you omit this value, TestDnsAnswer uses the IP address of a DNS resolver in the AWS US East (N. Virginia) Region (us-east-1).
    */
  var ResolverIP: js.UndefOr[IPAddress] = js.native
}

object TestDNSAnswerRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId, RecordName: DNSName, RecordType: RRType): TestDNSAnswerRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], RecordName = RecordName.asInstanceOf[js.Any], RecordType = RecordType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestDNSAnswerRequest]
  }
  @scala.inline
  implicit class TestDNSAnswerRequestOps[Self <: TestDNSAnswerRequest] (val x: Self) extends AnyVal {
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
    def setHostedZoneId(value: ResourceId): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordName(value: DNSName): Self = this.set("RecordName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordType(value: RRType): Self = this.set("RecordType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEDNS0ClientSubnetIP(value: IPAddress): Self = this.set("EDNS0ClientSubnetIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEDNS0ClientSubnetIP: Self = this.set("EDNS0ClientSubnetIP", js.undefined)
    @scala.inline
    def setEDNS0ClientSubnetMask(value: SubnetMask): Self = this.set("EDNS0ClientSubnetMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEDNS0ClientSubnetMask: Self = this.set("EDNS0ClientSubnetMask", js.undefined)
    @scala.inline
    def setResolverIP(value: IPAddress): Self = this.set("ResolverIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolverIP: Self = this.set("ResolverIP", js.undefined)
  }
  
}

