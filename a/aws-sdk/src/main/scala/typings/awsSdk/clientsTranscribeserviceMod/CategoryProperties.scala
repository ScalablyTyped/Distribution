package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryProperties extends StObject {
  
  /**
    * The name of the Call Analytics category. Category names are case sensitive and must be unique within an Amazon Web Services account.
    */
  var CategoryName: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.CategoryName] = js.undefined
  
  /**
    * The date and time the specified Call Analytics category was created. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.761000-07:00 represents 12:32 PM UTC-7 on May 4, 2022.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The input type associated with the specified category. POST_CALL refers to a category that is applied to batch transcriptions; REAL_TIME refers to a category that is applied to streaming transcriptions.
    */
  var InputType: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.InputType] = js.undefined
  
  /**
    * The date and time the specified Call Analytics category was last updated. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-05T12:45:32.691000-07:00 represents 12:45 PM UTC-7 on May 5, 2022.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The rules used to define a Call Analytics category. Each category can have between 1 and 20 rules.
    */
  var Rules: js.UndefOr[RuleList] = js.undefined
}
object CategoryProperties {
  
  inline def apply(): CategoryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoryProperties] (val x: Self) extends AnyVal {
    
    inline def setCategoryName(value: CategoryName): Self = StObject.set(x, "CategoryName", value.asInstanceOf[js.Any])
    
    inline def setCategoryNameUndefined: Self = StObject.set(x, "CategoryName", js.undefined)
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setInputType(value: InputType): Self = StObject.set(x, "InputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "InputType", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    inline def setRules(value: RuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
