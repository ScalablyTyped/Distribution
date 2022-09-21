package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageOptimizer extends StObject {
  
  /**
    * A map of the storage optimizer configuration. Currently contains only one key-value pair: is_enabled indicates true or false for acceleration.
    */
  var Config: js.UndefOr[StorageOptimizerConfig] = js.undefined
  
  /**
    * A message that contains information about any error (if present). When an acceleration result has an enabled status, the error message is empty. When an acceleration result has a disabled status, the message describes an error or simply indicates "disabled by the user".
    */
  var ErrorMessage: js.UndefOr[MessageString] = js.undefined
  
  /**
    * When an acceleration result has an enabled status, contains the details of the last job run.
    */
  var LastRunDetails: js.UndefOr[MessageString] = js.undefined
  
  /**
    * The specific type of storage optimizer. The supported value is compaction.
    */
  var StorageOptimizerType: js.UndefOr[OptimizerType] = js.undefined
  
  /**
    * A message that contains information about any warnings (if present).
    */
  var Warnings: js.UndefOr[MessageString] = js.undefined
}
object StorageOptimizer {
  
  inline def apply(): StorageOptimizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageOptimizer]
  }
  
  extension [Self <: StorageOptimizer](x: Self) {
    
    inline def setConfig(value: StorageOptimizerConfig): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "Config", js.undefined)
    
    inline def setErrorMessage(value: MessageString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setLastRunDetails(value: MessageString): Self = StObject.set(x, "LastRunDetails", value.asInstanceOf[js.Any])
    
    inline def setLastRunDetailsUndefined: Self = StObject.set(x, "LastRunDetails", js.undefined)
    
    inline def setStorageOptimizerType(value: OptimizerType): Self = StObject.set(x, "StorageOptimizerType", value.asInstanceOf[js.Any])
    
    inline def setStorageOptimizerTypeUndefined: Self = StObject.set(x, "StorageOptimizerType", js.undefined)
    
    inline def setWarnings(value: MessageString): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
  }
}
