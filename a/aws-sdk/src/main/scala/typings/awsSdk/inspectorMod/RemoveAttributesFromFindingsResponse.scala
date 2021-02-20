package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveAttributesFromFindingsResponse extends StObject {
  
  /**
    * Attributes details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}
object RemoveAttributesFromFindingsResponse {
  
  @scala.inline
  def apply(failedItems: FailedItems): RemoveAttributesFromFindingsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesFromFindingsResponse]
  }
  
  @scala.inline
  implicit class RemoveAttributesFromFindingsResponseMutableBuilder[Self <: RemoveAttributesFromFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedItems(value: FailedItems): Self = StObject.set(x, "failedItems", value.asInstanceOf[js.Any])
  }
}
