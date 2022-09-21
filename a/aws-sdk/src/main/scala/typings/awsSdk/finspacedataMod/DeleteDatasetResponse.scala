package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatasetResponse extends StObject {
  
  /**
    * The unique identifier for the deleted Dataset.
    */
  var datasetId: js.UndefOr[DatasetId] = js.undefined
}
object DeleteDatasetResponse {
  
  inline def apply(): DeleteDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDatasetResponse]
  }
  
  extension [Self <: DeleteDatasetResponse](x: Self) {
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
  }
}
