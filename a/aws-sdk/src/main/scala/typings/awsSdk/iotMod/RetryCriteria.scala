package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryCriteria extends StObject {
  
  /**
    * The type of job execution failures that can initiate a job retry.
    */
  var failureType: RetryableFailureType
  
  /**
    * The number of retries allowed for a failure type for the job.
    */
  var numberOfRetries: NumberOfRetries
}
object RetryCriteria {
  
  inline def apply(failureType: RetryableFailureType, numberOfRetries: NumberOfRetries): RetryCriteria = {
    val __obj = js.Dynamic.literal(failureType = failureType.asInstanceOf[js.Any], numberOfRetries = numberOfRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryCriteria]
  }
  
  extension [Self <: RetryCriteria](x: Self) {
    
    inline def setFailureType(value: RetryableFailureType): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRetries(value: NumberOfRetries): Self = StObject.set(x, "numberOfRetries", value.asInstanceOf[js.Any])
  }
}
