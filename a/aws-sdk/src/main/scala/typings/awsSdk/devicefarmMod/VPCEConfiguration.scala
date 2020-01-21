package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPCEConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The DNS name that maps to the private IP address of the service you want to access.
    */
  var serviceDnsName: js.UndefOr[ServiceDnsName] = js.native
  /**
    * An optional description that provides details about your VPC endpoint configuration.
    */
  var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.native
  /**
    * The friendly name you give to your VPC endpoint configuration to manage your configurations more easily.
    */
  var vpceConfigurationName: js.UndefOr[VPCEConfigurationName] = js.native
  /**
    * The name of the VPC endpoint service running in your AWS account that you want Device Farm to test.
    */
  var vpceServiceName: js.UndefOr[VPCEServiceName] = js.native
}

object VPCEConfiguration {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    serviceDnsName: ServiceDnsName = null,
    vpceConfigurationDescription: VPCEConfigurationDescription = null,
    vpceConfigurationName: VPCEConfigurationName = null,
    vpceServiceName: VPCEServiceName = null
  ): VPCEConfiguration = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (serviceDnsName != null) __obj.updateDynamic("serviceDnsName")(serviceDnsName.asInstanceOf[js.Any])
    if (vpceConfigurationDescription != null) __obj.updateDynamic("vpceConfigurationDescription")(vpceConfigurationDescription.asInstanceOf[js.Any])
    if (vpceConfigurationName != null) __obj.updateDynamic("vpceConfigurationName")(vpceConfigurationName.asInstanceOf[js.Any])
    if (vpceServiceName != null) __obj.updateDynamic("vpceServiceName")(vpceServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VPCEConfiguration]
  }
}

