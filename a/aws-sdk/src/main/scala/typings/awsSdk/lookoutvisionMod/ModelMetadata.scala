package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelMetadata extends StObject {
  
  /**
    * The unix timestamp for the date and time that the model was created. 
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description for the model.
    */
  var Description: js.UndefOr[ModelDescriptionMessage] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model.
    */
  var ModelArn: js.UndefOr[typings.awsSdk.lookoutvisionMod.ModelArn] = js.undefined
  
  /**
    * The version of the model.
    */
  var ModelVersion: js.UndefOr[typings.awsSdk.lookoutvisionMod.ModelVersion] = js.undefined
  
  /**
    * Performance metrics for the model. Not available until training has successfully completed.
    */
  var Performance: js.UndefOr[ModelPerformance] = js.undefined
  
  /**
    * The status of the model.
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
  
  /**
    * The status message for the model.
    */
  var StatusMessage: js.UndefOr[ModelStatusMessage] = js.undefined
}
object ModelMetadata {
  
  inline def apply(): ModelMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelMetadata]
  }
  
  extension [Self <: ModelMetadata](x: Self) {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDescription(value: ModelDescriptionMessage): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    inline def setModelVersion(value: ModelVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    inline def setPerformance(value: ModelPerformance): Self = StObject.set(x, "Performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "Performance", js.undefined)
    
    inline def setStatus(value: ModelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: ModelStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
