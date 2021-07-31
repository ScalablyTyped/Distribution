package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accelerator extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator.
    */
  var AcceleratorArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The date and time that the accelerator was created.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Domain Name System (DNS) name that Global Accelerator creates that points to your accelerator's static IP addresses.  The naming convention for the DNS name is the following: A lowercase letter a, followed by a 16-bit random hex string, followed by .awsglobalaccelerator.com. For example: a1234567890abcdef.awsglobalaccelerator.com. For more information about the default DNS name, see  Support for DNS Addressing in Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  var DnsName: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * The value for the address type must be IPv4. 
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.globalacceleratorMod.IpAddressType] = js.undefined
  
  /**
    * The static IP addresses that Global Accelerator associates with the accelerator.
    */
  var IpSets: js.UndefOr[typings.awsSdk.globalacceleratorMod.IpSets] = js.undefined
  
  /**
    * The date and time that the accelerator was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the accelerator. The name must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Describes the deployment status of the accelerator.
    */
  var Status: js.UndefOr[AcceleratorStatus] = js.undefined
}
object Accelerator {
  
  @scala.inline
  def apply(): Accelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accelerator]
  }
  
  @scala.inline
  implicit class AcceleratorMutableBuilder[Self <: Accelerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorArnUndefined: Self = StObject.set(x, "AcceleratorArn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDnsName(value: GenericString): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    @scala.inline
    def setEnabled(value: GenericBoolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    @scala.inline
    def setIpSets(value: IpSets): Self = StObject.set(x, "IpSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetsUndefined: Self = StObject.set(x, "IpSets", js.undefined)
    
    @scala.inline
    def setIpSetsVarargs(value: IpSet*): Self = StObject.set(x, "IpSets", js.Array(value :_*))
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setName(value: GenericString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: AcceleratorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
