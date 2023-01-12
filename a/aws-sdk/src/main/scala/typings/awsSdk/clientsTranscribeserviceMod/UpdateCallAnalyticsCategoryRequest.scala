package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCallAnalyticsCategoryRequest extends StObject {
  
  /**
    * The name of the Call Analytics category you want to update. Category names are case sensitive.
    */
  var CategoryName: typings.awsSdk.clientsTranscribeserviceMod.CategoryName
  
  /**
    * The rules used for the updated Call Analytics category. The rules you provide in this field replace the ones that are currently being used in the specified category.
    */
  var Rules: RuleList
}
object UpdateCallAnalyticsCategoryRequest {
  
  inline def apply(CategoryName: CategoryName, Rules: RuleList): UpdateCallAnalyticsCategoryRequest = {
    val __obj = js.Dynamic.literal(CategoryName = CategoryName.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCallAnalyticsCategoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCallAnalyticsCategoryRequest] (val x: Self) extends AnyVal {
    
    inline def setCategoryName(value: CategoryName): Self = StObject.set(x, "CategoryName", value.asInstanceOf[js.Any])
    
    inline def setRules(value: RuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
