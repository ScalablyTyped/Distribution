package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallationMedia extends js.Object {
  
  /**
    * The custom Availability Zone (AZ) that contains the installation media.
    */
  var CustomAvailabilityZoneId: js.UndefOr[String] = js.native
  
  /**
    * The DB engine.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The path to the installation medium for the DB engine.
    */
  var EngineInstallationMediaPath: js.UndefOr[String] = js.native
  
  /**
    * The engine version of the DB engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * If an installation media failure occurred, the cause of the failure.
    */
  var FailureCause: js.UndefOr[InstallationMediaFailureCause] = js.native
  
  /**
    * The installation medium ID.
    */
  var InstallationMediaId: js.UndefOr[String] = js.native
  
  /**
    * The path to the installation medium for the operating system associated with the DB engine.
    */
  var OSInstallationMediaPath: js.UndefOr[String] = js.native
  
  /**
    * The status of the installation medium.
    */
  var Status: js.UndefOr[String] = js.native
}
object InstallationMedia {
  
  @scala.inline
  def apply(): InstallationMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallationMedia]
  }
  
  @scala.inline
  implicit class InstallationMediaOps[Self <: InstallationMedia] (val x: Self) extends AnyVal {
    
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
    def setCustomAvailabilityZoneId(value: String): Self = this.set("CustomAvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAvailabilityZoneId: Self = this.set("CustomAvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineInstallationMediaPath(value: String): Self = this.set("EngineInstallationMediaPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineInstallationMediaPath: Self = this.set("EngineInstallationMediaPath", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setFailureCause(value: InstallationMediaFailureCause): Self = this.set("FailureCause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCause: Self = this.set("FailureCause", js.undefined)
    
    @scala.inline
    def setInstallationMediaId(value: String): Self = this.set("InstallationMediaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallationMediaId: Self = this.set("InstallationMediaId", js.undefined)
    
    @scala.inline
    def setOSInstallationMediaPath(value: String): Self = this.set("OSInstallationMediaPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOSInstallationMediaPath: Self = this.set("OSInstallationMediaPath", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
