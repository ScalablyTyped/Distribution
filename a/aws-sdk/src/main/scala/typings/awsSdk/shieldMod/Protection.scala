package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Protection extends js.Object {
  /**
    * The unique identifier (ID) for the Route 53 health check that's associated with the protection. 
    */
  var HealthCheckIds: js.UndefOr[typings.awsSdk.shieldMod.HealthCheckIds] = js.native
  /**
    * The unique identifier (ID) of the protection.
    */
  var Id: js.UndefOr[ProtectionId] = js.native
  /**
    * The friendly name of the protection. For example, My CloudFront distributions.
    */
  var Name: js.UndefOr[ProtectionName] = js.native
  /**
    * The ARN (Amazon Resource Name) of the AWS resource that is protected.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.shieldMod.ResourceArn] = js.native
}

object Protection {
  @scala.inline
  def apply(
    HealthCheckIds: HealthCheckIds = null,
    Id: ProtectionId = null,
    Name: ProtectionName = null,
    ResourceArn: ResourceArn = null
  ): Protection = {
    val __obj = js.Dynamic.literal()
    if (HealthCheckIds != null) __obj.updateDynamic("HealthCheckIds")(HealthCheckIds.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protection]
  }
}

