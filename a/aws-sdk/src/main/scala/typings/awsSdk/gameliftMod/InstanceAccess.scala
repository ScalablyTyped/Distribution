package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAccess extends js.Object {
  /**
    * Credentials required to access the instance.
    */
  var Credentials: js.UndefOr[InstanceCredentials] = js.native
  /**
    * A unique identifier for a fleet containing the instance being accessed.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
  /**
    * A unique identifier for an instance being accessed.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.gameliftMod.InstanceId] = js.native
  /**
    * IP address that is assigned to the instance.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.gameliftMod.IpAddress] = js.native
  /**
    * Operating system that is running on the instance.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.gameliftMod.OperatingSystem] = js.native
}

object InstanceAccess {
  @scala.inline
  def apply(
    Credentials: InstanceCredentials = null,
    FleetId: FleetId = null,
    InstanceId: InstanceId = null,
    IpAddress: IpAddress = null,
    OperatingSystem: OperatingSystem = null
  ): InstanceAccess = {
    val __obj = js.Dynamic.literal()
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceAccess]
  }
}

