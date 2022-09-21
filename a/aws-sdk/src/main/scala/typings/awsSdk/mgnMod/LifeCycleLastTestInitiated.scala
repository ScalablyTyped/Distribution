package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycleLastTestInitiated extends StObject {
  
  /**
    * Lifecycle last Test initiated API call date and time.
    */
  var apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Lifecycle last Test initiated Job ID.
    */
  var jobID: js.UndefOr[JobID] = js.undefined
}
object LifeCycleLastTestInitiated {
  
  inline def apply(): LifeCycleLastTestInitiated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifeCycleLastTestInitiated]
  }
  
  extension [Self <: LifeCycleLastTestInitiated](x: Self) {
    
    inline def setApiCallDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "apiCallDateTime", value.asInstanceOf[js.Any])
    
    inline def setApiCallDateTimeUndefined: Self = StObject.set(x, "apiCallDateTime", js.undefined)
    
    inline def setJobID(value: JobID): Self = StObject.set(x, "jobID", value.asInstanceOf[js.Any])
    
    inline def setJobIDUndefined: Self = StObject.set(x, "jobID", js.undefined)
  }
}
