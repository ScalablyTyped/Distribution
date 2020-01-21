package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceEntry extends js.Object {
  /**
    * The Availability Zone for the new Amazon EC2 instance.
    */
  var availabilityZone: String = js.native
  /**
    * The instance type (e.g., t2.micro) to use for the new Amazon EC2 instance.
    */
  var instanceType: NonEmptyString = js.native
  /**
    * The port configuration to use for the new Amazon EC2 instance. The following configuration options are available:   DEFAULT — Use the default firewall settings from the image.   INSTANCE — Use the firewall settings from the source Lightsail instance.   NONE — Default to Amazon EC2.   CLOSED — All ports closed.  
    */
  var portInfoSource: PortInfoSourceType = js.native
  /**
    * The name of the export snapshot record, which contains the exported Lightsail instance snapshot that will be used as the source of the new Amazon EC2 instance. Use the get export snapshot records operation to get a list of export snapshot records that you can use to create a CloudFormation stack.
    */
  var sourceName: ResourceName = js.native
  /**
    * A launch script you can create that configures a server with additional user data. For example, you might want to run apt-get -y update.  Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and CentOS use yum, Debian and Ubuntu use apt-get, and FreeBSD uses pkg. 
    */
  var userData: js.UndefOr[String] = js.native
}

object InstanceEntry {
  @scala.inline
  def apply(
    availabilityZone: String,
    instanceType: NonEmptyString,
    portInfoSource: PortInfoSourceType,
    sourceName: ResourceName,
    userData: String = null
  ): InstanceEntry = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], portInfoSource = portInfoSource.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceEntry]
  }
}

