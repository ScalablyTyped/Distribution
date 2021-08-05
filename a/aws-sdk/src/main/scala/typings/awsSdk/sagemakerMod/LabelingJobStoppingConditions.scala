package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobStoppingConditions extends StObject {
  
  /**
    * The maximum number of objects that can be labeled by human workers.
    */
  var MaxHumanLabeledObjectCount: js.UndefOr[typings.awsSdk.sagemakerMod.MaxHumanLabeledObjectCount] = js.undefined
  
  /**
    * The maximum number of input data objects that should be labeled.
    */
  var MaxPercentageOfInputDatasetLabeled: js.UndefOr[typings.awsSdk.sagemakerMod.MaxPercentageOfInputDatasetLabeled] = js.undefined
}
object LabelingJobStoppingConditions {
  
  inline def apply(): LabelingJobStoppingConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingJobStoppingConditions]
  }
  
  extension [Self <: LabelingJobStoppingConditions](x: Self) {
    
    inline def setMaxHumanLabeledObjectCount(value: MaxHumanLabeledObjectCount): Self = StObject.set(x, "MaxHumanLabeledObjectCount", value.asInstanceOf[js.Any])
    
    inline def setMaxHumanLabeledObjectCountUndefined: Self = StObject.set(x, "MaxHumanLabeledObjectCount", js.undefined)
    
    inline def setMaxPercentageOfInputDatasetLabeled(value: MaxPercentageOfInputDatasetLabeled): Self = StObject.set(x, "MaxPercentageOfInputDatasetLabeled", value.asInstanceOf[js.Any])
    
    inline def setMaxPercentageOfInputDatasetLabeledUndefined: Self = StObject.set(x, "MaxPercentageOfInputDatasetLabeled", js.undefined)
  }
}
