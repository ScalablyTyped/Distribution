package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2InstanceDetails extends StObject {
  
  /**
    * The IAM profile ARN of the instance.
    */
  var IamInstanceProfileArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Machine Image (AMI) ID of the instance.
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The IPv4 addresses associated with the instance.
    */
  var IpV4Addresses: js.UndefOr[StringList] = js.undefined
  
  /**
    * The IPv6 addresses associated with the instance.
    */
  var IpV6Addresses: js.UndefOr[StringList] = js.undefined
  
  /**
    * The key name associated with the instance.
    */
  var KeyName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the instance was launched. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the subnet that the instance was launched in.
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The instance type of the instance. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the VPC that the instance was launched in.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2InstanceDetails {
  
  @scala.inline
  def apply(): AwsEc2InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2InstanceDetails]
  }
  
  @scala.inline
  implicit class AwsEc2InstanceDetailsMutableBuilder[Self <: AwsEc2InstanceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamInstanceProfileArn(value: NonEmptyString): Self = StObject.set(x, "IamInstanceProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileArnUndefined: Self = StObject.set(x, "IamInstanceProfileArn", js.undefined)
    
    @scala.inline
    def setImageId(value: NonEmptyString): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setIpV4Addresses(value: StringList): Self = StObject.set(x, "IpV4Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpV4AddressesUndefined: Self = StObject.set(x, "IpV4Addresses", js.undefined)
    
    @scala.inline
    def setIpV4AddressesVarargs(value: NonEmptyString*): Self = StObject.set(x, "IpV4Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpV6Addresses(value: StringList): Self = StObject.set(x, "IpV6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpV6AddressesUndefined: Self = StObject.set(x, "IpV6Addresses", js.undefined)
    
    @scala.inline
    def setIpV6AddressesVarargs(value: NonEmptyString*): Self = StObject.set(x, "IpV6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setKeyName(value: NonEmptyString): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    @scala.inline
    def setLaunchedAt(value: NonEmptyString): Self = StObject.set(x, "LaunchedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchedAtUndefined: Self = StObject.set(x, "LaunchedAt", js.undefined)
    
    @scala.inline
    def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
