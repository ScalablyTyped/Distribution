package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntityAggregatesResponse extends StObject {
  
  /**
    * The number of entities that are affected by each of the specified events.
    */
  var entityAggregates: js.UndefOr[EntityAggregateList] = js.undefined
}
object DescribeEntityAggregatesResponse {
  
  inline def apply(): DescribeEntityAggregatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntityAggregatesResponse]
  }
  
  extension [Self <: DescribeEntityAggregatesResponse](x: Self) {
    
    inline def setEntityAggregates(value: EntityAggregateList): Self = StObject.set(x, "entityAggregates", value.asInstanceOf[js.Any])
    
    inline def setEntityAggregatesUndefined: Self = StObject.set(x, "entityAggregates", js.undefined)
    
    inline def setEntityAggregatesVarargs(value: EntityAggregate*): Self = StObject.set(x, "entityAggregates", js.Array(value*))
  }
}
