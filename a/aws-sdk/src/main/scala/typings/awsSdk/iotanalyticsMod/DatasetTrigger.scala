package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetTrigger extends StObject {
  
  /**
    * The data set whose content creation triggers the creation of this data set's contents.
    */
  var dataset: js.UndefOr[TriggeringDataset] = js.native
  
  /**
    * The Schedule when the trigger is initiated.
    */
  var schedule: js.UndefOr[Schedule] = js.native
}
object DatasetTrigger {
  
  @scala.inline
  def apply(): DatasetTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetTrigger]
  }
  
  @scala.inline
  implicit class DatasetTriggerMutableBuilder[Self <: DatasetTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: TriggeringDataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setSchedule(value: Schedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
