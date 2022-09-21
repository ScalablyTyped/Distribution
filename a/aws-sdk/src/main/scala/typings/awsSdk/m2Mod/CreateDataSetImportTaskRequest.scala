package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSetImportTaskRequest extends StObject {
  
  /**
    * The unique identifier of the application for which you want to import data sets.
    */
  var applicationId: Identifier
  
  /**
    *  Unique, case-sensitive identifier you provide to ensure the idempotency of the request to create a data set import. The service generates the clientToken when the API call is triggered. The token expires after one hour, so if you retry the API within this timeframe with the same clientToken, you will get the same response. The service also handles deleting the clientToken after it expires. 
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The data set import task configuration.
    */
  var importConfig: DataSetImportConfig
}
object CreateDataSetImportTaskRequest {
  
  inline def apply(applicationId: Identifier, importConfig: DataSetImportConfig): CreateDataSetImportTaskRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], importConfig = importConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSetImportTaskRequest]
  }
  
  extension [Self <: CreateDataSetImportTaskRequest](x: Self) {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setImportConfig(value: DataSetImportConfig): Self = StObject.set(x, "importConfig", value.asInstanceOf[js.Any])
  }
}
