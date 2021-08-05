package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetSummary extends StObject {
  
  /**
    * A list of DataActionSummary objects.
    */
  var actions: js.UndefOr[DatasetActionSummaries] = js.undefined
  
  /**
    * The time the data set was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the data set.
    */
  var datasetName: js.UndefOr[DatasetName] = js.undefined
  
  /**
    * The last time the data set was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The status of the data set.
    */
  var status: js.UndefOr[DatasetStatus] = js.undefined
  
  /**
    * A list of triggers. A trigger causes data set content to be populated at a specified time interval or when another data set is populated. The list of triggers can be empty or contain up to five DataSetTrigger objects
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.undefined
}
object DatasetSummary {
  
  inline def apply(): DatasetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetSummary]
  }
  
  extension [Self <: DatasetSummary](x: Self) {
    
    inline def setActions(value: DatasetActionSummaries): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: DatasetActionSummary*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "datasetName", js.undefined)
    
    inline def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setStatus(value: DatasetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTriggers(value: DatasetTriggers): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    inline def setTriggersVarargs(value: DatasetTrigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
  }
}
