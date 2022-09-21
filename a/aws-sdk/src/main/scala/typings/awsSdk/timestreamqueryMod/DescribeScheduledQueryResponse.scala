package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduledQueryResponse extends StObject {
  
  /**
    * The scheduled query.
    */
  var ScheduledQuery: ScheduledQueryDescription
}
object DescribeScheduledQueryResponse {
  
  inline def apply(ScheduledQuery: ScheduledQueryDescription): DescribeScheduledQueryResponse = {
    val __obj = js.Dynamic.literal(ScheduledQuery = ScheduledQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledQueryResponse]
  }
  
  extension [Self <: DescribeScheduledQueryResponse](x: Self) {
    
    inline def setScheduledQuery(value: ScheduledQueryDescription): Self = StObject.set(x, "ScheduledQuery", value.asInstanceOf[js.Any])
  }
}
