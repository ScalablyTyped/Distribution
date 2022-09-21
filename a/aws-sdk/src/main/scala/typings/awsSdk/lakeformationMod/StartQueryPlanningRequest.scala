package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartQueryPlanningRequest extends StObject {
  
  /**
    * A structure containing information about the query plan.
    */
  var QueryPlanningContext: typings.awsSdk.lakeformationMod.QueryPlanningContext
  
  /**
    * A PartiQL query statement used as an input to the planner service.
    */
  var QueryString: SyntheticStartQueryPlanningRequestQueryString
}
object StartQueryPlanningRequest {
  
  inline def apply(
    QueryPlanningContext: QueryPlanningContext,
    QueryString: SyntheticStartQueryPlanningRequestQueryString
  ): StartQueryPlanningRequest = {
    val __obj = js.Dynamic.literal(QueryPlanningContext = QueryPlanningContext.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartQueryPlanningRequest]
  }
  
  extension [Self <: StartQueryPlanningRequest](x: Self) {
    
    inline def setQueryPlanningContext(value: QueryPlanningContext): Self = StObject.set(x, "QueryPlanningContext", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: SyntheticStartQueryPlanningRequestQueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
  }
}
