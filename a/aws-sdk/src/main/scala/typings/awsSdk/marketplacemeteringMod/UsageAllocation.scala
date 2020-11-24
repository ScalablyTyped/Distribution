package typings.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageAllocation extends js.Object {
  
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
  implicit class UsageAllocationOps[Self <: UsageAllocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllocatedUsageQuantity(value: AllocatedUsageQuantity): Self = this.set("AllocatedUsageQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
