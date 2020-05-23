package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
    */
  var Arn: js.UndefOr[typings.awsSdk.servicediscoveryMod.Arn] = js.native
  /**
    * The date and time that the service was created.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description that you specify when you create the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  var DnsConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.DnsConfig] = js.native
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.native
  var HealthCheckCustomConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckCustomConfig] = js.native
  /**
    * The ID that AWS Cloud Map assigned to the service when you created it.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  /**
    * The number of instances that are currently associated with the service. Instances that were previously associated with the service but that have been deleted are not included in the count. The count might not reflect pending registrations and deregistrations.
    */
  var InstanceCount: js.UndefOr[ResourceCount] = js.native
  /**
    * The name of the service.
    */
  var Name: js.UndefOr[ServiceName] = js.native
}

object ServiceSummary {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreateDate: Timestamp = null,
    Description: ResourceDescription = null,
    DnsConfig: DnsConfig = null,
    HealthCheckConfig: HealthCheckConfig = null,
    HealthCheckCustomConfig: HealthCheckCustomConfig = null,
    Id: ResourceId = null,
    InstanceCount: js.UndefOr[ResourceCount] = js.undefined,
    Name: ServiceName = null
  ): ServiceSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DnsConfig != null) __obj.updateDynamic("DnsConfig")(DnsConfig.asInstanceOf[js.Any])
    if (HealthCheckConfig != null) __obj.updateDynamic("HealthCheckConfig")(HealthCheckConfig.asInstanceOf[js.Any])
    if (HealthCheckCustomConfig != null) __obj.updateDynamic("HealthCheckCustomConfig")(HealthCheckCustomConfig.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSummary]
  }
}

