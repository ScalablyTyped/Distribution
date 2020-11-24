package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExclusionsResponse extends js.Object {
  
  /**
    * Information about the exclusions.
    */
  var exclusions: ExclusionMap = js.native
  
  /**
    * Exclusion details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}
object DescribeExclusionsResponse {
  
  @scala.inline
  def apply(exclusions: ExclusionMap, failedItems: FailedItems): DescribeExclusionsResponse = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExclusionsResponse]
  }
  
  @scala.inline
  implicit class DescribeExclusionsResponseOps[Self <: DescribeExclusionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExclusions(value: ExclusionMap): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedItems(value: FailedItems): Self = this.set("failedItems", value.asInstanceOf[js.Any])
  }
}
