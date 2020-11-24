package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The port configuration to use for the new Amazon EC2 instance. The following configuration options are available:    DEFAULT - Use the default firewall settings from the Lightsail instance blueprint.    INSTANCE - Use the configured firewall settings from the source Lightsail instance.    NONE - Use the default Amazon EC2 security group.    CLOSED - All ports closed.    If you configured lightsail-connect as a cidrListAliases on your instance, or if you chose to allow the Lightsail browser-based SSH or RDP clients to connect to your instance, that configuration is not carried over to your new Amazon EC2 instance. 
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
    sourceName: ResourceName
  ): InstanceEntry = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], portInfoSource = portInfoSource.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceEntry]
  }
  
  @scala.inline
  implicit class InstanceEntryOps[Self <: InstanceEntry] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: NonEmptyString): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortInfoSource(value: PortInfoSourceType): Self = this.set("portInfoSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceName(value: ResourceName): Self = this.set("sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: String): Self = this.set("userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
  }
}
