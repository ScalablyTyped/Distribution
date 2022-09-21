package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IoTJobAbortConfig extends StObject {
  
  /**
    * The list of criteria that define when and how to cancel the configuration deployment.
    */
  var criteriaList: IoTJobAbortCriteriaList
}
object IoTJobAbortConfig {
  
  inline def apply(criteriaList: IoTJobAbortCriteriaList): IoTJobAbortConfig = {
    val __obj = js.Dynamic.literal(criteriaList = criteriaList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IoTJobAbortConfig]
  }
  
  extension [Self <: IoTJobAbortConfig](x: Self) {
    
    inline def setCriteriaList(value: IoTJobAbortCriteriaList): Self = StObject.set(x, "criteriaList", value.asInstanceOf[js.Any])
    
    inline def setCriteriaListVarargs(value: IoTJobAbortCriteria*): Self = StObject.set(x, "criteriaList", js.Array(value*))
  }
}
