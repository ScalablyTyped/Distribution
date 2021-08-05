package typings.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageAllocation extends StObject {
  
  /**
    * The total quantity allocated to this bucket of usage.
    */
  var AllocatedUsageQuantity: typings.awsSdk.marketplacemeteringMod.AllocatedUsageQuantity
  
  /**
    * The set of tags that define the bucket of usage. For the bucket of items with no tags, this parameter can be left out.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object UsageAllocation {
  
  inline def apply(AllocatedUsageQuantity: AllocatedUsageQuantity): UsageAllocation = {
    val __obj = js.Dynamic.literal(AllocatedUsageQuantity = AllocatedUsageQuantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageAllocation]
  }
  
  extension [Self <: UsageAllocation](x: Self) {
    
    inline def setAllocatedUsageQuantity(value: AllocatedUsageQuantity): Self = StObject.set(x, "AllocatedUsageQuantity", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
