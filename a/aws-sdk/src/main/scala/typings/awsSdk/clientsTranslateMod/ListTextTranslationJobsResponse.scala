package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTextTranslationJobsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTranslateMod.NextToken] = js.undefined
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var TextTranslationJobPropertiesList: js.UndefOr[typings.awsSdk.clientsTranslateMod.TextTranslationJobPropertiesList] = js.undefined
}
object ListTextTranslationJobsResponse {
  
  inline def apply(): ListTextTranslationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTextTranslationJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTextTranslationJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTextTranslationJobPropertiesList(value: TextTranslationJobPropertiesList): Self = StObject.set(x, "TextTranslationJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setTextTranslationJobPropertiesListUndefined: Self = StObject.set(x, "TextTranslationJobPropertiesList", js.undefined)
    
    inline def setTextTranslationJobPropertiesListVarargs(value: TextTranslationJobProperties*): Self = StObject.set(x, "TextTranslationJobPropertiesList", js.Array(value*))
  }
}
