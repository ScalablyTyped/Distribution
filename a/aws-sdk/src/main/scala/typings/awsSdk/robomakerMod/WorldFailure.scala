package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorldFailure extends StObject {
  
  /**
    * The failure code of the world export job if it failed:  InternalServiceError  Internal service error.  LimitExceeded  The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed.   ResourceNotFound  The specified resource could not be found.   RequestThrottled  The request was throttled.  InvalidInput  An input parameter in the request is not valid.  
    */
  var failureCode: js.UndefOr[WorldGenerationJobErrorCode] = js.undefined
  
  /**
    * The number of failed worlds.
    */
  var failureCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The sample reason why the world failed. World errors are aggregated. A sample is used as the sampleFailureReason. 
    */
  var sampleFailureReason: js.UndefOr[GenericString] = js.undefined
}
object WorldFailure {
  
  inline def apply(): WorldFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldFailure]
  }
  
  extension [Self <: WorldFailure](x: Self) {
    
    inline def setFailureCode(value: WorldGenerationJobErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureCount(value: Integer): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    inline def setFailureCountUndefined: Self = StObject.set(x, "failureCount", js.undefined)
    
    inline def setSampleFailureReason(value: GenericString): Self = StObject.set(x, "sampleFailureReason", value.asInstanceOf[js.Any])
    
    inline def setSampleFailureReasonUndefined: Self = StObject.set(x, "sampleFailureReason", js.undefined)
  }
}
