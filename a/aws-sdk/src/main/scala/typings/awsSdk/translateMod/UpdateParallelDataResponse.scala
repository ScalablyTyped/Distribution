package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateParallelDataResponse extends StObject {
  
  /**
    * The time that the most recent update was attempted.
    */
  var LatestUpdateAttemptAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the parallel data update attempt. When the updated parallel data resource is ready for you to use, the status is ACTIVE.
    */
  var LatestUpdateAttemptStatus: js.UndefOr[ParallelDataStatus] = js.undefined
  
  /**
    * The name of the parallel data resource being updated.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The status of the parallel data resource that you are attempting to update. Your update request is accepted only if this status is either ACTIVE or FAILED.
    */
  var Status: js.UndefOr[ParallelDataStatus] = js.undefined
}
object UpdateParallelDataResponse {
  
  inline def apply(): UpdateParallelDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParallelDataResponse]
  }
  
  extension [Self <: UpdateParallelDataResponse](x: Self) {
    
    inline def setLatestUpdateAttemptAt(value: js.Date): Self = StObject.set(x, "LatestUpdateAttemptAt", value.asInstanceOf[js.Any])
    
    inline def setLatestUpdateAttemptAtUndefined: Self = StObject.set(x, "LatestUpdateAttemptAt", js.undefined)
    
    inline def setLatestUpdateAttemptStatus(value: ParallelDataStatus): Self = StObject.set(x, "LatestUpdateAttemptStatus", value.asInstanceOf[js.Any])
    
    inline def setLatestUpdateAttemptStatusUndefined: Self = StObject.set(x, "LatestUpdateAttemptStatus", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: ParallelDataStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
