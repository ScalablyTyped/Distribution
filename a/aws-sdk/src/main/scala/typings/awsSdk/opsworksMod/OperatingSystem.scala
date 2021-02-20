package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatingSystem extends StObject {
  
  /**
    * Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
    */
  var ConfigurationManagers: js.UndefOr[OperatingSystemConfigurationManagers] = js.native
  
  /**
    * The ID of a supported operating system, such as Amazon Linux 2018.03.
    */
  var Id: js.UndefOr[String] = js.native
  
  /**
    * The name of the operating system, such as Amazon Linux 2018.03.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * A short name for the operating system manufacturer.
    */
  var ReportedName: js.UndefOr[String] = js.native
  
  /**
    * The version of the operating system, including the release and edition, if applicable.
    */
  var ReportedVersion: js.UndefOr[String] = js.native
  
  /**
    * Indicates that an operating system is not supported for new instances.
    */
  var Supported: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of a supported operating system, either Linux or Windows.
    */
  var Type: js.UndefOr[String] = js.native
}
object OperatingSystem {
  
  @scala.inline
  def apply(): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystem]
  }
  
  @scala.inline
  implicit class OperatingSystemMutableBuilder[Self <: OperatingSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationManagers(value: OperatingSystemConfigurationManagers): Self = StObject.set(x, "ConfigurationManagers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationManagersUndefined: Self = StObject.set(x, "ConfigurationManagers", js.undefined)
    
    @scala.inline
    def setConfigurationManagersVarargs(value: OperatingSystemConfigurationManager*): Self = StObject.set(x, "ConfigurationManagers", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setReportedName(value: String): Self = StObject.set(x, "ReportedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportedNameUndefined: Self = StObject.set(x, "ReportedName", js.undefined)
    
    @scala.inline
    def setReportedVersion(value: String): Self = StObject.set(x, "ReportedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportedVersionUndefined: Self = StObject.set(x, "ReportedVersion", js.undefined)
    
    @scala.inline
    def setSupported(value: Boolean): Self = StObject.set(x, "Supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedUndefined: Self = StObject.set(x, "Supported", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
