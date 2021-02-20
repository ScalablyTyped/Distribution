package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportInstallationMediaMessage extends StObject {
  
  /**
    * The identifier of the custom Availability Zone (AZ) to import the installation media to.
    */
  var CustomAvailabilityZoneId: String = js.native
  
  /**
    * The name of the database engine to be used for this instance.  The list only includes supported DB engines that require an on-premises customer provided license.  Valid Values:     sqlserver-ee     sqlserver-se     sqlserver-ex     sqlserver-web   
    */
  var Engine: String = js.native
  
  /**
    * The path to the installation medium for the specified DB engine. Example: SQLServerISO/en_sql_server_2016_enterprise_x64_dvd_8701793.iso 
    */
  var EngineInstallationMediaPath: String = js.native
  
  /**
    * The version number of the database engine to use. For a list of valid engine versions, call DescribeDBEngineVersions. The following are the database engines and links to information about the major and minor versions. The list only includes DB engines that require an on-premises customer provided license.  Microsoft SQL Server  See  Microsoft SQL Server Versions on Amazon RDS in the Amazon RDS User Guide. 
    */
  var EngineVersion: String = js.native
  
  /**
    * The path to the installation medium for the operating system associated with the specified DB engine. Example: WindowsISO/en_windows_server_2016_x64_dvd_9327751.iso 
    */
  var OSInstallationMediaPath: String = js.native
}
object ImportInstallationMediaMessage {
  
  @scala.inline
  def apply(
    CustomAvailabilityZoneId: String,
    Engine: String,
    EngineInstallationMediaPath: String,
    EngineVersion: String,
    OSInstallationMediaPath: String
  ): ImportInstallationMediaMessage = {
    val __obj = js.Dynamic.literal(CustomAvailabilityZoneId = CustomAvailabilityZoneId.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], EngineInstallationMediaPath = EngineInstallationMediaPath.asInstanceOf[js.Any], EngineVersion = EngineVersion.asInstanceOf[js.Any], OSInstallationMediaPath = OSInstallationMediaPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportInstallationMediaMessage]
  }
  
  @scala.inline
  implicit class ImportInstallationMediaMessageMutableBuilder[Self <: ImportInstallationMediaMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAvailabilityZoneId(value: String): Self = StObject.set(x, "CustomAvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineInstallationMediaPath(value: String): Self = StObject.set(x, "EngineInstallationMediaPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOSInstallationMediaPath(value: String): Self = StObject.set(x, "OSInstallationMediaPath", value.asInstanceOf[js.Any])
  }
}
