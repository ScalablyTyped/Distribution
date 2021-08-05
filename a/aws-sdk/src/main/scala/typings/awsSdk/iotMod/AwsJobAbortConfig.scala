package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsJobAbortConfig extends StObject {
  
  /**
    * The list of criteria that determine when and how to abort the job.
    */
  var abortCriteriaList: AwsJobAbortCriteriaList
}
object AwsJobAbortConfig {
  
  inline def apply(abortCriteriaList: AwsJobAbortCriteriaList): AwsJobAbortConfig = {
    val __obj = js.Dynamic.literal(abortCriteriaList = abortCriteriaList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsJobAbortConfig]
  }
  
  extension [Self <: AwsJobAbortConfig](x: Self) {
    
    inline def setAbortCriteriaList(value: AwsJobAbortCriteriaList): Self = StObject.set(x, "abortCriteriaList", value.asInstanceOf[js.Any])
    
    inline def setAbortCriteriaListVarargs(value: AwsJobAbortCriteria*): Self = StObject.set(x, "abortCriteriaList", js.Array(value :_*))
  }
}
