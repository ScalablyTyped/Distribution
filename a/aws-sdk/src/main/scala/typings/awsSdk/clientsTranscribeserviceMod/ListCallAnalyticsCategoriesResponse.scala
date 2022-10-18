package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCallAnalyticsCategoriesResponse extends StObject {
  
  /**
    * Provides detailed information about your Call Analytics categories, including all the rules associated with each category.
    */
  var Categories: js.UndefOr[CategoryPropertiesList] = js.undefined
  
  /**
    * If NextToken is present in your response, it indicates that not all results are displayed. To view the next set of results, copy the string associated with the NextToken parameter in your results output, then run your request again including NextToken with the value of the copied string. Repeat as needed to view all your results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.NextToken] = js.undefined
}
object ListCallAnalyticsCategoriesResponse {
  
  inline def apply(): ListCallAnalyticsCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCallAnalyticsCategoriesResponse]
  }
  
  extension [Self <: ListCallAnalyticsCategoriesResponse](x: Self) {
    
    inline def setCategories(value: CategoryPropertiesList): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "Categories", js.undefined)
    
    inline def setCategoriesVarargs(value: CategoryProperties*): Self = StObject.set(x, "Categories", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
