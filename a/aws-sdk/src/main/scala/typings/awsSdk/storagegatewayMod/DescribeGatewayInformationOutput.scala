package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGatewayInformationOutput extends js.Object {
  
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
  implicit class DescribeGatewayInformationOutputOps[Self <: DescribeGatewayInformationOutput] (val x: Self) extends AnyVal {
    
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
    def setCloudWatchLogGroupARN(value: CloudWatchLogGroupARN): Self = this.set("CloudWatchLogGroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLogGroupARN: Self = this.set("CloudWatchLogGroupARN", js.undefined)
    
    @scala.inline
    def setDeprecationDate(value: DeprecationDate): Self = this.set("DeprecationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecationDate: Self = this.set("DeprecationDate", js.undefined)
    
    @scala.inline
    def setEc2InstanceId(value: Ec2InstanceId): Self = this.set("Ec2InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2InstanceId: Self = this.set("Ec2InstanceId", js.undefined)
    
    @scala.inline
    def setEc2InstanceRegion(value: Ec2InstanceRegion): Self = this.set("Ec2InstanceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2InstanceRegion: Self = this.set("Ec2InstanceRegion", js.undefined)
    
    @scala.inline
    def setEndpointType(value: EndpointType): Self = this.set("EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointType: Self = this.set("EndpointType", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
    
    @scala.inline
    def setGatewayId(value: GatewayId): Self = this.set("GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayId: Self = this.set("GatewayId", js.undefined)
    
    @scala.inline
    def setGatewayName(value: String): Self = this.set("GatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayName: Self = this.set("GatewayName", js.undefined)
    
    @scala.inline
    def setGatewayNetworkInterfacesVarargs(value: NetworkInterface*): Self = this.set("GatewayNetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setGatewayNetworkInterfaces(value: GatewayNetworkInterfaces): Self = this.set("GatewayNetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayNetworkInterfaces: Self = this.set("GatewayNetworkInterfaces", js.undefined)
    
    @scala.inline
    def setGatewayState(value: GatewayState): Self = this.set("GatewayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayState: Self = this.set("GatewayState", js.undefined)
    
    @scala.inline
    def setGatewayTimezone(value: GatewayTimezone): Self = this.set("GatewayTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayTimezone: Self = this.set("GatewayTimezone", js.undefined)
    
    @scala.inline
    def setGatewayType(value: GatewayType): Self = this.set("GatewayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayType: Self = this.set("GatewayType", js.undefined)
    
    @scala.inline
    def setHostEnvironment(value: HostEnvironment): Self = this.set("HostEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostEnvironment: Self = this.set("HostEnvironment", js.undefined)
    
    @scala.inline
    def setLastSoftwareUpdate(value: LastSoftwareUpdate): Self = this.set("LastSoftwareUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSoftwareUpdate: Self = this.set("LastSoftwareUpdate", js.undefined)
    
    @scala.inline
    def setNextUpdateAvailabilityDate(value: NextUpdateAvailabilityDate): Self = this.set("NextUpdateAvailabilityDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextUpdateAvailabilityDate: Self = this.set("NextUpdateAvailabilityDate", js.undefined)
    
    @scala.inline
    def setSoftwareUpdatesEndDate(value: SoftwareUpdatesEndDate): Self = this.set("SoftwareUpdatesEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftwareUpdatesEndDate: Self = this.set("SoftwareUpdatesEndDate", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVPCEndpoint(value: String): Self = this.set("VPCEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVPCEndpoint: Self = this.set("VPCEndpoint", js.undefined)
  }
}
