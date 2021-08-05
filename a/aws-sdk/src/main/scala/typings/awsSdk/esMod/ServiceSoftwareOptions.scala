package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSoftwareOptions extends StObject {
  
  /**
    * Timestamp, in Epoch time, until which you can manually request a service software update. After this date, we automatically update your service software.
    */
  var AutomatedUpdateDate: js.UndefOr[DeploymentCloseDateTimeStamp] = js.undefined
  
  /**
    * True if you are able to cancel your service software version update. False if you are not able to cancel your service software version. 
    */
  var Cancellable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current service software version that is present on the domain.
    */
  var CurrentVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the UpdateStatus.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The new service software version if one is available.
    */
  var NewVersion: js.UndefOr[String] = js.undefined
  
  /**
    * True if a service software is never automatically updated. False if a service software is automatically updated after AutomatedUpdateDate. 
    */
  var OptionalDeployment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if you are able to update you service software version. False if you are not able to update your service software version. 
    */
  var UpdateAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The status of your service software update. This field can take the following values: ELIGIBLE, PENDING_UPDATE, IN_PROGRESS, COMPLETED, and NOT_ELIGIBLE.
    */
  var UpdateStatus: js.UndefOr[DeploymentStatus] = js.undefined
}
object ServiceSoftwareOptions {
  
  inline def apply(): ServiceSoftwareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSoftwareOptions]
  }
  
  extension [Self <: ServiceSoftwareOptions](x: Self) {
    
    inline def setAutomatedUpdateDate(value: DeploymentCloseDateTimeStamp): Self = StObject.set(x, "AutomatedUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setAutomatedUpdateDateUndefined: Self = StObject.set(x, "AutomatedUpdateDate", js.undefined)
    
    inline def setCancellable(value: Boolean): Self = StObject.set(x, "Cancellable", value.asInstanceOf[js.Any])
    
    inline def setCancellableUndefined: Self = StObject.set(x, "Cancellable", js.undefined)
    
    inline def setCurrentVersion(value: String): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setNewVersion(value: String): Self = StObject.set(x, "NewVersion", value.asInstanceOf[js.Any])
    
    inline def setNewVersionUndefined: Self = StObject.set(x, "NewVersion", js.undefined)
    
    inline def setOptionalDeployment(value: Boolean): Self = StObject.set(x, "OptionalDeployment", value.asInstanceOf[js.Any])
    
    inline def setOptionalDeploymentUndefined: Self = StObject.set(x, "OptionalDeployment", js.undefined)
    
    inline def setUpdateAvailable(value: Boolean): Self = StObject.set(x, "UpdateAvailable", value.asInstanceOf[js.Any])
    
    inline def setUpdateAvailableUndefined: Self = StObject.set(x, "UpdateAvailable", js.undefined)
    
    inline def setUpdateStatus(value: DeploymentStatus): Self = StObject.set(x, "UpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatusUndefined: Self = StObject.set(x, "UpdateStatus", js.undefined)
  }
}
