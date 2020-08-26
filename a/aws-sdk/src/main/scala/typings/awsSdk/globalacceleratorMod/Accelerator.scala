package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accelerator extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator.
    */
  var AcceleratorArn: js.UndefOr[GenericString] = js.native
  /**
    * The date and time that the accelerator was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Domain Name System (DNS) name that Global Accelerator creates that points to your accelerator's static IP addresses.  The naming convention for the DNS name is the following: A lowercase letter a, followed by a 16-bit random hex string, followed by .awsglobalaccelerator.com. For example: a1234567890abcdef.awsglobalaccelerator.com. For more information about the default DNS name, see  Support for DNS Addressing in Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  var DnsName: js.UndefOr[GenericString] = js.native
  /**
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.native
  /**
    * The value for the address type must be IPv4. 
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.globalacceleratorMod.IpAddressType] = js.native
  /**
    * The static IP addresses that Global Accelerator associates with the accelerator.
    */
  var IpSets: js.UndefOr[typings.awsSdk.globalacceleratorMod.IpSets] = js.native
  /**
    * The date and time that the accelerator was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the accelerator. The name must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: js.UndefOr[GenericString] = js.native
  /**
    * Describes the deployment status of the accelerator.
    */
  var Status: js.UndefOr[AcceleratorStatus] = js.native
}

object Accelerator {
  @scala.inline
  def apply(): Accelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accelerator]
  }
  @scala.inline
  implicit class AcceleratorOps[Self <: Accelerator] (val x: Self) extends AnyVal {
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
    def setAcceleratorArn(value: GenericString): Self = this.set("AcceleratorArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorArn: Self = this.set("AcceleratorArn", js.undefined)
    @scala.inline
    def setCreatedTime(value: Timestamp): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setDnsName(value: GenericString): Self = this.set("DnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsName: Self = this.set("DnsName", js.undefined)
    @scala.inline
    def setEnabled(value: GenericBoolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setIpAddressType(value: IpAddressType): Self = this.set("IpAddressType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddressType: Self = this.set("IpAddressType", js.undefined)
    @scala.inline
    def setIpSetsVarargs(value: IpSet*): Self = this.set("IpSets", js.Array(value :_*))
    @scala.inline
    def setIpSets(value: IpSets): Self = this.set("IpSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpSets: Self = this.set("IpSets", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setName(value: GenericString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setStatus(value: AcceleratorStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

