package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAggregateIdFormatResult extends StObject {
  
  /**
    * Information about each resource's ID format.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.undefined
  
  /**
    * Indicates whether all resource types in the Region are configured to use longer IDs. This value is only true if all users are configured to use longer IDs for all resources types in the Region.
    */
  var UseLongIdsAggregated: js.UndefOr[Boolean] = js.undefined
}
object DescribeAggregateIdFormatResult {
  
  inline def apply(): DescribeAggregateIdFormatResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregateIdFormatResult]
  }
  
  extension [Self <: DescribeAggregateIdFormatResult](x: Self) {
    
    inline def setStatuses(value: IdFormatList): Self = StObject.set(x, "Statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "Statuses", js.undefined)
    
    inline def setStatusesVarargs(value: IdFormat*): Self = StObject.set(x, "Statuses", js.Array(value :_*))
    
    inline def setUseLongIdsAggregated(value: Boolean): Self = StObject.set(x, "UseLongIdsAggregated", value.asInstanceOf[js.Any])
    
    inline def setUseLongIdsAggregatedUndefined: Self = StObject.set(x, "UseLongIdsAggregated", js.undefined)
  }
}
