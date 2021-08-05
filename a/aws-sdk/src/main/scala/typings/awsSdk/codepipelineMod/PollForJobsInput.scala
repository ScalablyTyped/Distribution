package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollForJobsInput extends StObject {
  
  /**
    * Represents information about an action type.
    */
  var actionTypeId: ActionTypeId
  
  /**
    * The maximum number of jobs to return in a poll for jobs call.
    */
  var maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined
  
  /**
    * A map of property names and values. For an action type with no queryable properties, this value must be null or an empty map. For an action type with a queryable property, you must supply that property as a key in the map. Only jobs whose action configuration matches the mapped value are returned.
    */
  var queryParam: js.UndefOr[QueryParamMap] = js.undefined
}
object PollForJobsInput {
  
  inline def apply(actionTypeId: ActionTypeId): PollForJobsInput = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForJobsInput]
  }
  
  extension [Self <: PollForJobsInput](x: Self) {
    
    inline def setActionTypeId(value: ActionTypeId): Self = StObject.set(x, "actionTypeId", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchSize(value: MaxBatchSize): Self = StObject.set(x, "maxBatchSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchSizeUndefined: Self = StObject.set(x, "maxBatchSize", js.undefined)
    
    inline def setQueryParam(value: QueryParamMap): Self = StObject.set(x, "queryParam", value.asInstanceOf[js.Any])
    
    inline def setQueryParamUndefined: Self = StObject.set(x, "queryParam", js.undefined)
  }
}
