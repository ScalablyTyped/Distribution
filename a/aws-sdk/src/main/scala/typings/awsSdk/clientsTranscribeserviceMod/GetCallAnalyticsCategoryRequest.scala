package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCallAnalyticsCategoryRequest extends StObject {
  
  /**
    * The name of the Call Analytics category you want information about. Category names are case sensitive.
    */
  var CategoryName: typings.awsSdk.clientsTranscribeserviceMod.CategoryName
}
object GetCallAnalyticsCategoryRequest {
  
  inline def apply(CategoryName: CategoryName): GetCallAnalyticsCategoryRequest = {
    val __obj = js.Dynamic.literal(CategoryName = CategoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCallAnalyticsCategoryRequest]
  }
  
  extension [Self <: GetCallAnalyticsCategoryRequest](x: Self) {
    
    inline def setCategoryName(value: CategoryName): Self = StObject.set(x, "CategoryName", value.asInstanceOf[js.Any])
  }
}
