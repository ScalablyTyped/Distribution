package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCallAnalyticsCategoryResponse extends StObject {
  
  /**
    * Provides you with the properties of your new category, including its associated rules.
    */
  var CategoryProperties: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.CategoryProperties] = js.undefined
}
object CreateCallAnalyticsCategoryResponse {
  
  inline def apply(): CreateCallAnalyticsCategoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCallAnalyticsCategoryResponse]
  }
  
  extension [Self <: CreateCallAnalyticsCategoryResponse](x: Self) {
    
    inline def setCategoryProperties(value: CategoryProperties): Self = StObject.set(x, "CategoryProperties", value.asInstanceOf[js.Any])
    
    inline def setCategoryPropertiesUndefined: Self = StObject.set(x, "CategoryProperties", js.undefined)
  }
}
