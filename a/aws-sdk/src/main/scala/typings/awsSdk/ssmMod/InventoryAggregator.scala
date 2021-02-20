package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryAggregator extends StObject {
  
  /**
    * Nested aggregators to further refine aggregation for an inventory type.
    */
  var Aggregators: js.UndefOr[InventoryAggregatorList] = js.native
  
  /**
    * The inventory type and attribute name for aggregation.
    */
  var Expression: js.UndefOr[InventoryAggregatorExpression] = js.native
  
  /**
    * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources that match and don't match the specified criteria.
    */
  var Groups: js.UndefOr[InventoryGroupList] = js.native
}
object InventoryAggregator {
  
  @scala.inline
  def apply(): InventoryAggregator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryAggregator]
  }
  
  @scala.inline
  implicit class InventoryAggregatorMutableBuilder[Self <: InventoryAggregator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregators(value: InventoryAggregatorList): Self = StObject.set(x, "Aggregators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatorsUndefined: Self = StObject.set(x, "Aggregators", js.undefined)
    
    @scala.inline
    def setAggregatorsVarargs(value: InventoryAggregator*): Self = StObject.set(x, "Aggregators", js.Array(value :_*))
    
    @scala.inline
    def setExpression(value: InventoryAggregatorExpression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    @scala.inline
    def setGroups(value: InventoryGroupList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: InventoryGroup*): Self = StObject.set(x, "Groups", js.Array(value :_*))
  }
}
