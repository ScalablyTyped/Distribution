package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDetail extends js.Object {
  /**
    * Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
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
    * The AWS account ID of the service owner.
    */
  var Owner: js.UndefOr[String] = js.native
  /**
    * The private DNS name for the service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The verification state of the VPC endpoint service. Consumers of the endpoint service cannot use the private name when the state is not verified.
    */
  var PrivateDnsNameVerificationState: js.UndefOr[DnsNameState] = js.native
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var ServiceName: js.UndefOr[String] = js.native
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[ServiceTypeDetailSet] = js.native
  /**
    * Any tags assigned to the service.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Indicates whether the service supports endpoint policies.
    */
  var VpcEndpointPolicySupported: js.UndefOr[Boolean] = js.native
}

object ServiceDetail {
  @scala.inline
  def apply(): ServiceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceDetail]
  }
  @scala.inline
  implicit class ServiceDetailOps[Self <: ServiceDetail] (val x: Self) extends AnyVal {
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
    def setAcceptanceRequired(value: Boolean): Self = this.set("AcceptanceRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptanceRequired: Self = this.set("AcceptanceRequired", js.undefined)
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: ValueStringList): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setBaseEndpointDnsNamesVarargs(value: String*): Self = this.set("BaseEndpointDnsNames", js.Array(value :_*))
    @scala.inline
    def setBaseEndpointDnsNames(value: ValueStringList): Self = this.set("BaseEndpointDnsNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseEndpointDnsNames: Self = this.set("BaseEndpointDnsNames", js.undefined)
    @scala.inline
    def setManagesVpcEndpoints(value: Boolean): Self = this.set("ManagesVpcEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagesVpcEndpoints: Self = this.set("ManagesVpcEndpoints", js.undefined)
    @scala.inline
    def setOwner(value: String): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    @scala.inline
    def setPrivateDnsName(value: String): Self = this.set("PrivateDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsName: Self = this.set("PrivateDnsName", js.undefined)
    @scala.inline
    def setPrivateDnsNameVerificationState(value: DnsNameState): Self = this.set("PrivateDnsNameVerificationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsNameVerificationState: Self = this.set("PrivateDnsNameVerificationState", js.undefined)
    @scala.inline
    def setServiceId(value: String): Self = this.set("ServiceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceId: Self = this.set("ServiceId", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("ServiceName", js.undefined)
    @scala.inline
    def setServiceTypeVarargs(value: ServiceTypeDetail*): Self = this.set("ServiceType", js.Array(value :_*))
    @scala.inline
    def setServiceType(value: ServiceTypeDetailSet): Self = this.set("ServiceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceType: Self = this.set("ServiceType", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVpcEndpointPolicySupported(value: Boolean): Self = this.set("VpcEndpointPolicySupported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointPolicySupported: Self = this.set("VpcEndpointPolicySupported", js.undefined)
  }
  
}

