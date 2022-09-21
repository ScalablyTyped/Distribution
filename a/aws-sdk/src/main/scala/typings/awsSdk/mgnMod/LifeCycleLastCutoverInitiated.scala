package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycleLastCutoverInitiated extends StObject {
  
  /**
    * 
    */
  var apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Lifecycle last Cutover initiated by Job ID.
    */
  var jobID: js.UndefOr[JobID] = js.undefined
}
object LifeCycleLastCutoverInitiated {
  
  inline def apply(): LifeCycleLastCutoverInitiated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifeCycleLastCutoverInitiated]
  }
  
  extension [Self <: LifeCycleLastCutoverInitiated](x: Self) {
    
    inline def setApiCallDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "apiCallDateTime", value.asInstanceOf[js.Any])
    
    inline def setApiCallDateTimeUndefined: Self = StObject.set(x, "apiCallDateTime", js.undefined)
    
    inline def setJobID(value: JobID): Self = StObject.set(x, "jobID", value.asInstanceOf[js.Any])
    
    inline def setJobIDUndefined: Self = StObject.set(x, "jobID", js.undefined)
  }
}
