package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLanguagesRequest extends StObject {
  
  /**
    * The language code for the language to use to display the language names in the response. The language code is en by default. 
    */
  var DisplayLanguageCode: js.UndefOr[typings.awsSdk.translateMod.DisplayLanguageCode] = js.undefined
  
  /**
    * The maximum number of results to return in each response.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * Include the NextToken value to fetch the next group of supported languages. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.translateMod.NextToken] = js.undefined
}
object ListLanguagesRequest {
  
  inline def apply(): ListLanguagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLanguagesRequest]
  }
  
  extension [Self <: ListLanguagesRequest](x: Self) {
    
    inline def setDisplayLanguageCode(value: DisplayLanguageCode): Self = StObject.set(x, "DisplayLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setDisplayLanguageCodeUndefined: Self = StObject.set(x, "DisplayLanguageCode", js.undefined)
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
