package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataViewResponse extends StObject {
  
  /**
    * The unique identifier for the created Dataview.
    */
  var dataViewId: js.UndefOr[DataViewId] = js.undefined
  
  /**
    * The unique identifier of the Dataset used for the Dataview.
    */
  var datasetId: js.UndefOr[DatasetId] = js.undefined
}
object CreateDataViewResponse {
  
  inline def apply(): CreateDataViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataViewResponse]
  }
  
  extension [Self <: CreateDataViewResponse](x: Self) {
    
    inline def setDataViewId(value: DataViewId): Self = StObject.set(x, "dataViewId", value.asInstanceOf[js.Any])
    
    inline def setDataViewIdUndefined: Self = StObject.set(x, "dataViewId", js.undefined)
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
  }
}
