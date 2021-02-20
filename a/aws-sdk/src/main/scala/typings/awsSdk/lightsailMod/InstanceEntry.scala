package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceEntry extends StObject {
  
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
  implicit class InstanceEntryMutableBuilder[Self <: InstanceEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: NonEmptyString): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortInfoSource(value: PortInfoSourceType): Self = StObject.set(x, "portInfoSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceName(value: ResourceName): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
