package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRetryStrategy extends StObject {
  
  /**
    * The number of times to attempt to retry, if the job fails. Valid values are 1–10.
    */
  var Attempts: js.UndefOr[Integer] = js.undefined
}
object BatchRetryStrategy {
  
  inline def apply(): BatchRetryStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRetryStrategy]
  }
  
  extension [Self <: BatchRetryStrategy](x: Self) {
    
    inline def setAttempts(value: Integer): Self = StObject.set(x, "Attempts", value.asInstanceOf[js.Any])
    
    inline def setAttemptsUndefined: Self = StObject.set(x, "Attempts", js.undefined)
  }
}
