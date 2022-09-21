package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntityRecognizersResponse extends StObject {
  
  /**
    * The list of properties of an entity recognizer.
    */
  var EntityRecognizerPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.EntityRecognizerPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListEntityRecognizersResponse {
  
  inline def apply(): ListEntityRecognizersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntityRecognizersResponse]
  }
  
  extension [Self <: ListEntityRecognizersResponse](x: Self) {
    
    inline def setEntityRecognizerPropertiesList(value: EntityRecognizerPropertiesList): Self = StObject.set(x, "EntityRecognizerPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setEntityRecognizerPropertiesListUndefined: Self = StObject.set(x, "EntityRecognizerPropertiesList", js.undefined)
    
    inline def setEntityRecognizerPropertiesListVarargs(value: EntityRecognizerProperties*): Self = StObject.set(x, "EntityRecognizerPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
