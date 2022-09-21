package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetTrigger extends StObject {
  
  /**
    * The dataset whose content creation triggers the creation of this dataset's contents.
    */
  var dataset: js.UndefOr[TriggeringDataset] = js.undefined
  
  /**
    * The Schedule when the trigger is initiated.
    */
  var schedule: js.UndefOr[Schedule] = js.undefined
}
object DatasetTrigger {
  
  inline def apply(): DatasetTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetTrigger]
  }
  
  extension [Self <: DatasetTrigger](x: Self) {
    
    inline def setDataset(value: TriggeringDataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setSchedule(value: Schedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
