package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetRepositoryScanningConfigurationResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[RepositoryScanningConfigurationFailureList] = js.undefined
  
  /**
    * The scanning configuration for the requested repositories.
    */
  var scanningConfigurations: js.UndefOr[RepositoryScanningConfigurationList] = js.undefined
}
object BatchGetRepositoryScanningConfigurationResponse {
  
  inline def apply(): BatchGetRepositoryScanningConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetRepositoryScanningConfigurationResponse]
  }
  
  extension [Self <: BatchGetRepositoryScanningConfigurationResponse](x: Self) {
    
    inline def setFailures(value: RepositoryScanningConfigurationFailureList): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: RepositoryScanningConfigurationFailure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setScanningConfigurations(value: RepositoryScanningConfigurationList): Self = StObject.set(x, "scanningConfigurations", value.asInstanceOf[js.Any])
    
    inline def setScanningConfigurationsUndefined: Self = StObject.set(x, "scanningConfigurations", js.undefined)
    
    inline def setScanningConfigurationsVarargs(value: RepositoryScanningConfiguration*): Self = StObject.set(x, "scanningConfigurations", js.Array(value*))
  }
}
