package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcAttributeResult extends js.Object {
  /**
    * Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is true, instances in the VPC get DNS hostnames; otherwise, they do not.
    */
  var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Indicates whether DNS resolution is enabled for the VPC. If this attribute is true, the Amazon DNS server resolves DNS hostnames for your instances to their corresponding IP addresses; otherwise, it does not.
    */
  var EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DescribeVpcAttributeResult {
  @scala.inline
  def apply(): DescribeVpcAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcAttributeResult]
  }
  @scala.inline
  implicit class DescribeVpcAttributeResultOps[Self <: DescribeVpcAttributeResult] (val x: Self) extends AnyVal {
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
    def setEnableDnsHostnames(value: AttributeBooleanValue): Self = this.set("EnableDnsHostnames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDnsHostnames: Self = this.set("EnableDnsHostnames", js.undefined)
    @scala.inline
    def setEnableDnsSupport(value: AttributeBooleanValue): Self = this.set("EnableDnsSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDnsSupport: Self = this.set("EnableDnsSupport", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

