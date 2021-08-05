package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionPlanOptions extends StObject {
  
  var displayActualQueryPlan: js.UndefOr[Boolean] = js.undefined
  
  var displayEstimatedQueryPlan: js.UndefOr[Boolean] = js.undefined
}
object ExecutionPlanOptions {
  
  inline def apply(): ExecutionPlanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionPlanOptions]
  }
  
  extension [Self <: ExecutionPlanOptions](x: Self) {
    
    inline def setDisplayActualQueryPlan(value: Boolean): Self = StObject.set(x, "displayActualQueryPlan", value.asInstanceOf[js.Any])
    
    inline def setDisplayActualQueryPlanUndefined: Self = StObject.set(x, "displayActualQueryPlan", js.undefined)
    
    inline def setDisplayEstimatedQueryPlan(value: Boolean): Self = StObject.set(x, "displayEstimatedQueryPlan", value.asInstanceOf[js.Any])
    
    inline def setDisplayEstimatedQueryPlanUndefined: Self = StObject.set(x, "displayEstimatedQueryPlan", js.undefined)
  }
}
