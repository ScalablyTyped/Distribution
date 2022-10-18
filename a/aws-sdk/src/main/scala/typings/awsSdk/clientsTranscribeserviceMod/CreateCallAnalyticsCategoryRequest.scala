package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCallAnalyticsCategoryRequest extends StObject {
  
  /**
    * A unique name, chosen by you, for your Call Analytics category. It's helpful to use a detailed naming system that will make sense to you in the future. For example, it's better to use sentiment-positive-last30seconds for a category over a generic name like test-category. Category names are case sensitive.
    */
  var CategoryName: typings.awsSdk.clientsTranscribeserviceMod.CategoryName
  
  /**
    * Rules define a Call Analytics category. When creating a new Call Analytics category, you must create between 1 and 20 rules for that category. For each rule, you specify a filter you want applied to the attributes of a call. For example, you can choose a sentiment filter that detects if a customer's sentiment was positive during the last 30 seconds of the call.
    */
  var Rules: RuleList
}
object CreateCallAnalyticsCategoryRequest {
  
  inline def apply(CategoryName: CategoryName, Rules: RuleList): CreateCallAnalyticsCategoryRequest = {
    val __obj = js.Dynamic.literal(CategoryName = CategoryName.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCallAnalyticsCategoryRequest]
  }
  
  extension [Self <: CreateCallAnalyticsCategoryRequest](x: Self) {
    
    inline def setCategoryName(value: CategoryName): Self = StObject.set(x, "CategoryName", value.asInstanceOf[js.Any])
    
    inline def setRules(value: RuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
