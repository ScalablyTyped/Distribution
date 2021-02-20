package typings.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageAllocation extends StObject {
  
  /**
    * The total quantity allocated to this bucket of usage.
    */
  var AllocatedUsageQuantity: typings.awsSdk.marketplacemeteringMod.AllocatedUsageQuantity = js.native
  
  /**
    * The set of tags that define the bucket of usage. For the bucket of items with no tags, this parameter can be left out.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object UsageAllocation {
  
  @scala.inline
  def apply(AllocatedUsageQuantity: AllocatedUsageQuantity): UsageAllocation = {
    val __obj = js.Dynamic.literal(AllocatedUsageQuantity = AllocatedUsageQuantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageAllocation]
  }
  
  @scala.inline
  implicit class UsageAllocationMutableBuilder[Self <: UsageAllocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocatedUsageQuantity(value: AllocatedUsageQuantity): Self = StObject.set(x, "AllocatedUsageQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
