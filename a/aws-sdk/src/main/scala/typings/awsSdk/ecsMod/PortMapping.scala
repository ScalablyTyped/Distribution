package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortMapping extends js.Object {
  /**
    * The port number on the container that is bound to the user-specified or automatically assigned host port. If you are using containers in a task with the awsvpc or host network mode, exposed ports should be specified using containerPort. If you are using containers in a task with the bridge network mode and you specify a container port and not a host port, your container automatically receives a host port in the ephemeral port range. For more information, see hostPort. Port mappings that are automatically assigned in this way do not count toward the 100 reserved ports limit of a container instance.  You cannot expose the same container port for multiple protocols. An error will be returned if this is attempted. 
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.native
  /**
    * The port number on the container instance to reserve for your container. If you are using containers in a task with the awsvpc or host network mode, the hostPort can either be left blank or set to the same value as the containerPort. If you are using containers in a task with the bridge network mode, you can specify a non-reserved host port for your container port mapping, or you can omit the hostPort (or set it to 0) while specifying a containerPort and your container automatically receives a port in the ephemeral port range for your container instance operating system and Docker version. The default ephemeral port range for Docker version 1.6.0 and later is listed on the instance under /proc/sys/net/ipv4/ip_local_port_range. If this kernel parameter is unavailable, the default ephemeral port range from 49153 through 65535 is used. Do not attempt to specify a host port in the ephemeral port range as these are reserved for automatic assignment. In general, ports below 32768 are outside of the ephemeral port range.  The default ephemeral port range from 49153 through 65535 is always used for Docker versions before 1.6.0.  The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container agent ports 51678-51680. Any host port that was previously specified in a running task is also reserved while the task is running (after a task stops, the host port is released). The current reserved ports are displayed in the remainingResources of DescribeContainerInstances output. A container instance can have up to 100 reserved ports at a time, including the default reserved ports. Automatically assigned ports don't count toward the 100 reserved ports limit.
    */
  var hostPort: js.UndefOr[BoxedInteger] = js.native
  /**
    * The protocol used for the port mapping. Valid values are tcp and udp. The default is tcp.
    */
  var protocol: js.UndefOr[TransportProtocol] = js.native
}

object PortMapping {
  @scala.inline
  def apply(
    containerPort: js.UndefOr[BoxedInteger] = js.undefined,
    hostPort: js.UndefOr[BoxedInteger] = js.undefined,
    protocol: TransportProtocol = null
  ): PortMapping = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containerPort)) __obj.updateDynamic("containerPort")(containerPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hostPort)) __obj.updateDynamic("hostPort")(hostPort.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortMapping]
  }
}

