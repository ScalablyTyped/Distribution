package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatingSystem extends js.Object {
  
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
  implicit class OperatingSystemOps[Self <: OperatingSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigurationManagersVarargs(value: OperatingSystemConfigurationManager*): Self = this.set("ConfigurationManagers", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationManagers(value: OperatingSystemConfigurationManagers): Self = this.set("ConfigurationManagers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationManagers: Self = this.set("ConfigurationManagers", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setReportedName(value: String): Self = this.set("ReportedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportedName: Self = this.set("ReportedName", js.undefined)
    
    @scala.inline
    def setReportedVersion(value: String): Self = this.set("ReportedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportedVersion: Self = this.set("ReportedVersion", js.undefined)
    
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("Supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupported: Self = this.set("Supported", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
