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
    * Choose whether you want to create a real-time or a post-call category for your Call Analytics transcription. Specifying POST_CALL assigns your category to post-call transcriptions; categories with this input type cannot be applied to streaming (real-time) transcriptions. Specifying REAL_TIME assigns your category to streaming transcriptions; categories with this input type cannot be applied to post-call transcriptions. If you do not include InputType, your category is created as a post-call category by default.
    */
  var InputType: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.InputType] = js.undefined
  
  /**
    * Rules define a Call Analytics category. When creating a new category, you must create between 1 and 20 rules for that category. For each rule, you specify a filter you want applied to the attributes of a call. For example, you can choose a sentiment filter that detects if a customer's sentiment was positive during the last 30 seconds of the call.
    */
  var Rules: RuleList
}
object CreateCallAnalyticsCategoryRequest {
  
  inline def apply(CategoryName: CategoryName, Rules: RuleList): CreateCallAnalyticsCategoryRequest = {
    val __obj = js.Dynamic.literal(CategoryName = CategoryName.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCallAnalyticsCategoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCallAnalyticsCategoryRequest] (val x: Self) extends AnyVal {
    
    inline def setCategoryName(value: CategoryName): Self = StObject.set(x, "CategoryName", value.asInstanceOf[js.Any])
    
    inline def setInputType(value: InputType): Self = StObject.set(x, "InputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "InputType", js.undefined)
    
    inline def setRules(value: RuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
