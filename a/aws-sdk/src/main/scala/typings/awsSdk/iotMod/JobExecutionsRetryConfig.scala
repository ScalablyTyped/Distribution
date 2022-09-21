package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecutionsRetryConfig extends StObject {
  
  /**
    * The list of criteria that determines how many retries are allowed for each failure type for a job.
    */
  var criteriaList: RetryCriteriaList
}
object JobExecutionsRetryConfig {
  
  inline def apply(criteriaList: RetryCriteriaList): JobExecutionsRetryConfig = {
    val __obj = js.Dynamic.literal(criteriaList = criteriaList.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecutionsRetryConfig]
  }
  
  extension [Self <: JobExecutionsRetryConfig](x: Self) {
    
    inline def setCriteriaList(value: RetryCriteriaList): Self = StObject.set(x, "criteriaList", value.asInstanceOf[js.Any])
    
    inline def setCriteriaListVarargs(value: RetryCriteria*): Self = StObject.set(x, "criteriaList", js.Array(value*))
  }
}
