package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAggregateIdFormatResult extends StObject {
  
  /**
    * Information about each resource's ID format.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.native
  
  /**
    * Indicates whether all resource types in the Region are configured to use longer IDs. This value is only true if all users are configured to use longer IDs for all resources types in the Region.
    */
  var UseLongIdsAggregated: js.UndefOr[Boolean] = js.native
}
object DescribeAggregateIdFormatResult {
  
  @scala.inline
  def apply(): DescribeAggregateIdFormatResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregateIdFormatResult]
  }
  
  @scala.inline
  implicit class DescribeAggregateIdFormatResultMutableBuilder[Self <: DescribeAggregateIdFormatResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatuses(value: IdFormatList): Self = StObject.set(x, "Statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesUndefined: Self = StObject.set(x, "Statuses", js.undefined)
    
    @scala.inline
    def setStatusesVarargs(value: IdFormat*): Self = StObject.set(x, "Statuses", js.Array(value :_*))
    
    @scala.inline
    def setUseLongIdsAggregated(value: Boolean): Self = StObject.set(x, "UseLongIdsAggregated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLongIdsAggregatedUndefined: Self = StObject.set(x, "UseLongIdsAggregated", js.undefined)
  }
}
