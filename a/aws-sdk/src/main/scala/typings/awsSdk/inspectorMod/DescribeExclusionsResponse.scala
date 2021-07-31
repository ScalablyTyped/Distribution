package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExclusionsResponse extends StObject {
  
  /**
    * Information about the exclusions.
    */
  var exclusions: ExclusionMap
  
  /**
    * Exclusion details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
}
object DescribeExclusionsResponse {
  
  @scala.inline
  def apply(exclusions: ExclusionMap, failedItems: FailedItems): DescribeExclusionsResponse = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExclusionsResponse]
  }
  
  @scala.inline
  implicit class DescribeExclusionsResponseMutableBuilder[Self <: DescribeExclusionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusions(value: ExclusionMap): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedItems(value: FailedItems): Self = StObject.set(x, "failedItems", value.asInstanceOf[js.Any])
  }
}
