package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCallAnalyticsCategoryRequest extends StObject {
  
  /**
    * The name of the Call Analytics category you want to delete. Category names are case sensitive.
    */
  var CategoryName: typings.awsSdk.clientsTranscribeserviceMod.CategoryName
}
object DeleteCallAnalyticsCategoryRequest {
  
  inline def apply(CategoryName: CategoryName): DeleteCallAnalyticsCategoryRequest = {
    val __obj = js.Dynamic.literal(CategoryName = CategoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCallAnalyticsCategoryRequest]
  }
  
  extension [Self <: DeleteCallAnalyticsCategoryRequest](x: Self) {
    
    inline def setCategoryName(value: CategoryName): Self = StObject.set(x, "CategoryName", value.asInstanceOf[js.Any])
  }
}
