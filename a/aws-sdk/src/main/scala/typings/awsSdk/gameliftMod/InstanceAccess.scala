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
  def apply(): InstanceAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAccess]
  }
  @scala.inline
  implicit class InstanceAccessOps[Self <: InstanceAccess] (val x: Self) extends AnyVal {
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
    def setCredentials(value: InstanceCredentials): Self = this.set("Credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("Credentials", js.undefined)
    @scala.inline
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setIpAddress(value: IpAddress): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("IpAddress", js.undefined)
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = this.set("OperatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystem: Self = this.set("OperatingSystem", js.undefined)
  }
  
}

