package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * DNS identifier assigned to the instance that is running the game session. Values have the following format:   TLS-enabled fleets: &lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com.   Non-TLS-enabled fleets: ec2-&lt;unique identifier&gt;.compute.amazonaws.com. (See Amazon EC2 Instance IP Addressing.)   When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP address.
    */
  var DnsName: js.UndefOr[typings.awsSdk.gameliftMod.DnsName] = js.native
  /**
    * A unique identifier for a fleet that the instance is in.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
  /**
    * A unique identifier for an instance.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.gameliftMod.InstanceId] = js.native
  /**
    * IP address that is assigned to the instance.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.gameliftMod.IpAddress] = js.native
  /**
    * Operating system that is running on this instance. 
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.gameliftMod.OperatingSystem] = js.native
  /**
    * Current status of the instance. Possible statuses include the following:    PENDING -- The instance is in the process of being created and launching server processes as defined in the fleet's run-time configuration.     ACTIVE -- The instance has been successfully created and at least one server process has successfully launched and reported back to Amazon GameLift that it is ready to host a game session. The instance is now considered ready to host game sessions.     TERMINATING -- The instance is in the process of shutting down. This may happen to reduce capacity during a scaling down event or to recycle resources in the event of a problem.  
    */
  var Status: js.UndefOr[InstanceStatus] = js.native
  /**
    * EC2 instance type that defines the computing resources of this instance. 
    */
  var Type: js.UndefOr[EC2InstanceType] = js.native
}

object Instance {
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDnsName(value: DnsName): Self = this.set("DnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsName: Self = this.set("DnsName", js.undefined)
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
    @scala.inline
    def setStatus(value: InstanceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setType(value: EC2InstanceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

