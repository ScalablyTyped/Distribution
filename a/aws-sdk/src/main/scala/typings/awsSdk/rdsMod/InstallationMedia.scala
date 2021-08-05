package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationMedia extends StObject {
  
  /**
    * The custom Availability Zone (AZ) that contains the installation media.
    */
  var CustomAvailabilityZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * The DB engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the installation medium for the DB engine.
    */
  var EngineInstallationMediaPath: js.UndefOr[String] = js.undefined
  
  /**
    * The engine version of the DB engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * If an installation media failure occurred, the cause of the failure.
    */
  var FailureCause: js.UndefOr[InstallationMediaFailureCause] = js.undefined
  
  /**
    * The installation medium ID.
    */
  var InstallationMediaId: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the installation medium for the operating system associated with the DB engine.
    */
  var OSInstallationMediaPath: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the installation medium.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object InstallationMedia {
  
  inline def apply(): InstallationMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallationMedia]
  }
  
  extension [Self <: InstallationMedia](x: Self) {
    
    inline def setCustomAvailabilityZoneId(value: String): Self = StObject.set(x, "CustomAvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setCustomAvailabilityZoneIdUndefined: Self = StObject.set(x, "CustomAvailabilityZoneId", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineInstallationMediaPath(value: String): Self = StObject.set(x, "EngineInstallationMediaPath", value.asInstanceOf[js.Any])
    
    inline def setEngineInstallationMediaPathUndefined: Self = StObject.set(x, "EngineInstallationMediaPath", js.undefined)
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setFailureCause(value: InstallationMediaFailureCause): Self = StObject.set(x, "FailureCause", value.asInstanceOf[js.Any])
    
    inline def setFailureCauseUndefined: Self = StObject.set(x, "FailureCause", js.undefined)
    
    inline def setInstallationMediaId(value: String): Self = StObject.set(x, "InstallationMediaId", value.asInstanceOf[js.Any])
    
    inline def setInstallationMediaIdUndefined: Self = StObject.set(x, "InstallationMediaId", js.undefined)
    
    inline def setOSInstallationMediaPath(value: String): Self = StObject.set(x, "OSInstallationMediaPath", value.asInstanceOf[js.Any])
    
    inline def setOSInstallationMediaPathUndefined: Self = StObject.set(x, "OSInstallationMediaPath", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
