package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetMetadata extends StObject {
  
  /**
    *  The Unix timestamp for the date and time that the dataset was created. 
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) for the dataset. 
    */
  var DatasetArn: js.UndefOr[typings.awsSdk.rekognitionMod.DatasetArn] = js.undefined
  
  /**
    *  The type of the dataset. 
    */
  var DatasetType: js.UndefOr[typings.awsSdk.rekognitionMod.DatasetType] = js.undefined
  
  /**
    *  The status for the dataset. 
    */
  var Status: js.UndefOr[DatasetStatus] = js.undefined
  
  /**
    *  The status message for the dataset. 
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.undefined
  
  /**
    *  The status message code for the dataset operation. If a service error occurs, try the API call again later. If a client error occurs, check the input parameters to the dataset API call that failed. 
    */
  var StatusMessageCode: js.UndefOr[DatasetStatusMessageCode] = js.undefined
}
object DatasetMetadata {
  
  inline def apply(): DatasetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetMetadata]
  }
  
  extension [Self <: DatasetMetadata](x: Self) {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setDatasetTypeUndefined: Self = StObject.set(x, "DatasetType", js.undefined)
    
    inline def setStatus(value: DatasetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageCode(value: DatasetStatusMessageCode): Self = StObject.set(x, "StatusMessageCode", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageCodeUndefined: Self = StObject.set(x, "StatusMessageCode", js.undefined)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
