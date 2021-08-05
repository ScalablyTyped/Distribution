package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAttributesFromFindingsResponse extends StObject {
  
  /**
    * Attributes details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
}
object RemoveAttributesFromFindingsResponse {
  
  inline def apply(failedItems: FailedItems): RemoveAttributesFromFindingsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesFromFindingsResponse]
  }
  
  extension [Self <: RemoveAttributesFromFindingsResponse](x: Self) {
    
    inline def setFailedItems(value: FailedItems): Self = StObject.set(x, "failedItems", value.asInstanceOf[js.Any])
  }
}
