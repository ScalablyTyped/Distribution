package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceConfiguration extends js.Object {
  /**
    * Indicates whether requests from other AWS accounts to create an endpoint to the service must first be accepted.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.native
  /**
    * The Availability Zones in which the service is available.
    */
  var AvailabilityZones: js.UndefOr[ValueStringList] = js.native
  /**
    * The DNS names for the service.
    */
  var BaseEndpointDnsNames: js.UndefOr[ValueStringList] = js.native
  /**
    * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC endpoint API is restricted.
    */
  var ManagesVpcEndpoints: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
    */
  var NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  /**
    * The private DNS name for the service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * Information about the endpoint service private DNS name configuration.
    */
  var PrivateDnsNameConfiguration: js.UndefOr[typings.awsSdk.ec2Mod.PrivateDnsNameConfiguration] = js.native
  /**
    * The ID of the service.
    */
  var ServiceId: js.UndefOr[String] = js.native
  /**
    * The name of the service.
    */
  var ServiceName: js.UndefOr[String] = js.native
  /**
    * The service state.
    */
  var ServiceState: js.UndefOr[typings.awsSdk.ec2Mod.ServiceState] = js.native
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[ServiceTypeDetailSet] = js.native
  /**
    * Any tags assigned to the service.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ServiceConfiguration {
  @scala.inline
  def apply(
    AcceptanceRequired: js.UndefOr[Boolean] = js.undefined,
    AvailabilityZones: ValueStringList = null,
    BaseEndpointDnsNames: ValueStringList = null,
    ManagesVpcEndpoints: js.UndefOr[Boolean] = js.undefined,
    NetworkLoadBalancerArns: ValueStringList = null,
    PrivateDnsName: String = null,
    PrivateDnsNameConfiguration: PrivateDnsNameConfiguration = null,
    ServiceId: String = null,
    ServiceName: String = null,
    ServiceState: ServiceState = null,
    ServiceType: ServiceTypeDetailSet = null,
    Tags: TagList = null
  ): ServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AcceptanceRequired)) __obj.updateDynamic("AcceptanceRequired")(AcceptanceRequired.get.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (BaseEndpointDnsNames != null) __obj.updateDynamic("BaseEndpointDnsNames")(BaseEndpointDnsNames.asInstanceOf[js.Any])
    if (!js.isUndefined(ManagesVpcEndpoints)) __obj.updateDynamic("ManagesVpcEndpoints")(ManagesVpcEndpoints.get.asInstanceOf[js.Any])
    if (NetworkLoadBalancerArns != null) __obj.updateDynamic("NetworkLoadBalancerArns")(NetworkLoadBalancerArns.asInstanceOf[js.Any])
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName.asInstanceOf[js.Any])
    if (PrivateDnsNameConfiguration != null) __obj.updateDynamic("PrivateDnsNameConfiguration")(PrivateDnsNameConfiguration.asInstanceOf[js.Any])
    if (ServiceId != null) __obj.updateDynamic("ServiceId")(ServiceId.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    if (ServiceState != null) __obj.updateDynamic("ServiceState")(ServiceState.asInstanceOf[js.Any])
    if (ServiceType != null) __obj.updateDynamic("ServiceType")(ServiceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfiguration]
  }
}

