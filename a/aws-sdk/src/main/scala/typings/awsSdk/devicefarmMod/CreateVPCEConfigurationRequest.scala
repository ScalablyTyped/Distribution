package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVPCEConfigurationRequest extends js.Object {
  /**
    * The DNS name of the service running in your VPC that you want Device Farm to test.
    */
  var serviceDnsName: ServiceDnsName = js.native
  /**
    * An optional description that provides details about your VPC endpoint configuration.
    */
  var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.native
  /**
    * The friendly name you give to your VPC endpoint configuration, to manage your configurations more easily.
    */
  var vpceConfigurationName: VPCEConfigurationName = js.native
  /**
    * The name of the VPC endpoint service running in your AWS account that you want Device Farm to test.
    */
  var vpceServiceName: VPCEServiceName = js.native
}

object CreateVPCEConfigurationRequest {
  @scala.inline
  def apply(
    serviceDnsName: ServiceDnsName,
    vpceConfigurationName: VPCEConfigurationName,
    vpceServiceName: VPCEServiceName,
    vpceConfigurationDescription: VPCEConfigurationDescription = null
  ): CreateVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(serviceDnsName = serviceDnsName.asInstanceOf[js.Any], vpceConfigurationName = vpceConfigurationName.asInstanceOf[js.Any], vpceServiceName = vpceServiceName.asInstanceOf[js.Any])
    if (vpceConfigurationDescription != null) __obj.updateDynamic("vpceConfigurationDescription")(vpceConfigurationDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVPCEConfigurationRequest]
  }
}

