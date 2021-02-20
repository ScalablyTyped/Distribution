package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGatewayInformationOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor events in the gateway.
    */
  var CloudWatchLogGroupARN: js.UndefOr[typings.awsSdk.storagegatewayMod.CloudWatchLogGroupARN] = js.native
  
  /**
    * Date after which this gateway will not receive software updates for new features and bug fixes.
    */
  var DeprecationDate: js.UndefOr[typings.awsSdk.storagegatewayMod.DeprecationDate] = js.native
  
  /**
    * The ID of the Amazon EC2 instance that was used to launch the gateway.
    */
  var Ec2InstanceId: js.UndefOr[typings.awsSdk.storagegatewayMod.Ec2InstanceId] = js.native
  
  /**
    * The AWS Region where the Amazon EC2 instance is located.
    */
  var Ec2InstanceRegion: js.UndefOr[typings.awsSdk.storagegatewayMod.Ec2InstanceRegion] = js.native
  
  /**
    * The type of endpoint for your gateway. Valid Values: STANDARD | FIPS 
    */
  var EndpointType: js.UndefOr[typings.awsSdk.storagegatewayMod.EndpointType] = js.native
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
    */
  var GatewayId: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayId] = js.native
  
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: js.UndefOr[String] = js.native
  
  /**
    * A NetworkInterface array that contains descriptions of the gateway network interfaces.
    */
  var GatewayNetworkInterfaces: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayNetworkInterfaces] = js.native
  
  /**
    * A value that indicates the operating state of the gateway.
    */
  var GatewayState: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayState] = js.native
  
  /**
    * A value that indicates the time zone configured for the gateway.
    */
  var GatewayTimezone: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayTimezone] = js.native
  
  /**
    * The type of the gateway.
    */
  var GatewayType: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayType] = js.native
  
  /**
    * The type of hypervisor environment used by the host.
    */
  var HostEnvironment: js.UndefOr[typings.awsSdk.storagegatewayMod.HostEnvironment] = js.native
  
  /**
    * The date on which the last software update was applied to the gateway. If the gateway has never been updated, this field does not return a value in the response.
    */
  var LastSoftwareUpdate: js.UndefOr[typings.awsSdk.storagegatewayMod.LastSoftwareUpdate] = js.native
  
  /**
    * The date on which an update to the gateway is available. This date is in the time zone of the gateway. If the gateway is not available for an update this field is not returned in the response.
    */
  var NextUpdateAvailabilityDate: js.UndefOr[typings.awsSdk.storagegatewayMod.NextUpdateAvailabilityDate] = js.native
  
  /**
    * Date after which this gateway will not receive software updates for new features.
    */
  var SoftwareUpdatesEndDate: js.UndefOr[typings.awsSdk.storagegatewayMod.SoftwareUpdatesEndDate] = js.native
  
  /**
    * A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.native
  
  /**
    * The configuration settings for the virtual private cloud (VPC) endpoint for your gateway.
    */
  var VPCEndpoint: js.UndefOr[String] = js.native
}
object DescribeGatewayInformationOutput {
  
  @scala.inline
  def apply(): DescribeGatewayInformationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGatewayInformationOutput]
  }
  
  @scala.inline
  implicit class DescribeGatewayInformationOutputMutableBuilder[Self <: DescribeGatewayInformationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogGroupARN(value: CloudWatchLogGroupARN): Self = StObject.set(x, "CloudWatchLogGroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogGroupARNUndefined: Self = StObject.set(x, "CloudWatchLogGroupARN", js.undefined)
    
    @scala.inline
    def setDeprecationDate(value: DeprecationDate): Self = StObject.set(x, "DeprecationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationDateUndefined: Self = StObject.set(x, "DeprecationDate", js.undefined)
    
    @scala.inline
    def setEc2InstanceId(value: Ec2InstanceId): Self = StObject.set(x, "Ec2InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2InstanceIdUndefined: Self = StObject.set(x, "Ec2InstanceId", js.undefined)
    
    @scala.inline
    def setEc2InstanceRegion(value: Ec2InstanceRegion): Self = StObject.set(x, "Ec2InstanceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2InstanceRegionUndefined: Self = StObject.set(x, "Ec2InstanceRegion", js.undefined)
    
    @scala.inline
    def setEndpointType(value: EndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setGatewayId(value: GatewayId): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    @scala.inline
    def setGatewayName(value: String): Self = StObject.set(x, "GatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayNameUndefined: Self = StObject.set(x, "GatewayName", js.undefined)
    
    @scala.inline
    def setGatewayNetworkInterfaces(value: GatewayNetworkInterfaces): Self = StObject.set(x, "GatewayNetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayNetworkInterfacesUndefined: Self = StObject.set(x, "GatewayNetworkInterfaces", js.undefined)
    
    @scala.inline
    def setGatewayNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "GatewayNetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setGatewayState(value: GatewayState): Self = StObject.set(x, "GatewayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayStateUndefined: Self = StObject.set(x, "GatewayState", js.undefined)
    
    @scala.inline
    def setGatewayTimezone(value: GatewayTimezone): Self = StObject.set(x, "GatewayTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayTimezoneUndefined: Self = StObject.set(x, "GatewayTimezone", js.undefined)
    
    @scala.inline
    def setGatewayType(value: GatewayType): Self = StObject.set(x, "GatewayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayTypeUndefined: Self = StObject.set(x, "GatewayType", js.undefined)
    
    @scala.inline
    def setHostEnvironment(value: HostEnvironment): Self = StObject.set(x, "HostEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostEnvironmentUndefined: Self = StObject.set(x, "HostEnvironment", js.undefined)
    
    @scala.inline
    def setLastSoftwareUpdate(value: LastSoftwareUpdate): Self = StObject.set(x, "LastSoftwareUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSoftwareUpdateUndefined: Self = StObject.set(x, "LastSoftwareUpdate", js.undefined)
    
    @scala.inline
    def setNextUpdateAvailabilityDate(value: NextUpdateAvailabilityDate): Self = StObject.set(x, "NextUpdateAvailabilityDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUpdateAvailabilityDateUndefined: Self = StObject.set(x, "NextUpdateAvailabilityDate", js.undefined)
    
    @scala.inline
    def setSoftwareUpdatesEndDate(value: SoftwareUpdatesEndDate): Self = StObject.set(x, "SoftwareUpdatesEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareUpdatesEndDateUndefined: Self = StObject.set(x, "SoftwareUpdatesEndDate", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVPCEndpoint(value: String): Self = StObject.set(x, "VPCEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCEndpointUndefined: Self = StObject.set(x, "VPCEndpoint", js.undefined)
  }
}
