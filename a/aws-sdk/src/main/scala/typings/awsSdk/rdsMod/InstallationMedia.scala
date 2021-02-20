package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallationMedia extends StObject {
  
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
  implicit class InstallationMediaMutableBuilder[Self <: InstallationMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAvailabilityZoneId(value: String): Self = StObject.set(x, "CustomAvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAvailabilityZoneIdUndefined: Self = StObject.set(x, "CustomAvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineInstallationMediaPath(value: String): Self = StObject.set(x, "EngineInstallationMediaPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineInstallationMediaPathUndefined: Self = StObject.set(x, "EngineInstallationMediaPath", js.undefined)
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setFailureCause(value: InstallationMediaFailureCause): Self = StObject.set(x, "FailureCause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCauseUndefined: Self = StObject.set(x, "FailureCause", js.undefined)
    
    @scala.inline
    def setInstallationMediaId(value: String): Self = StObject.set(x, "InstallationMediaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationMediaIdUndefined: Self = StObject.set(x, "InstallationMediaId", js.undefined)
    
    @scala.inline
    def setOSInstallationMediaPath(value: String): Self = StObject.set(x, "OSInstallationMediaPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOSInstallationMediaPathUndefined: Self = StObject.set(x, "OSInstallationMediaPath", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
