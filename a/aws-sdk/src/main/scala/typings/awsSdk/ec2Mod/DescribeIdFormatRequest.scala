package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdFormatRequest extends js.Object {
  /**
    * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway 
    */
  var Resource: js.UndefOr[String] = js.native
}

object DescribeIdFormatRequest {
  @scala.inline
  def apply(): DescribeIdFormatRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdFormatRequest]
  }
  @scala.inline
  implicit class DescribeIdFormatRequestOps[Self <: DescribeIdFormatRequest] (val x: Self) extends AnyVal {
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
    def setResource(value: String): Self = this.set("Resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("Resource", js.undefined)
  }
  
}

