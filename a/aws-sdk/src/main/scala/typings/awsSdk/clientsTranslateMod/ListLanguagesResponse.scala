package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLanguagesResponse extends StObject {
  
  /**
    * The language code passed in with the request.
    */
  var DisplayLanguageCode: js.UndefOr[typings.awsSdk.clientsTranslateMod.DisplayLanguageCode] = js.undefined
  
  /**
    * The list of supported languages.
    */
  var Languages: js.UndefOr[LanguagesList] = js.undefined
  
  /**
    *  If the response does not include all remaining results, use the NextToken in the next request to fetch the next group of supported languages.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTranslateMod.NextToken] = js.undefined
}
object ListLanguagesResponse {
  
  inline def apply(): ListLanguagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLanguagesResponse]
  }
  
  extension [Self <: ListLanguagesResponse](x: Self) {
    
    inline def setDisplayLanguageCode(value: DisplayLanguageCode): Self = StObject.set(x, "DisplayLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setDisplayLanguageCodeUndefined: Self = StObject.set(x, "DisplayLanguageCode", js.undefined)
    
    inline def setLanguages(value: LanguagesList): Self = StObject.set(x, "Languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "Languages", js.undefined)
    
    inline def setLanguagesVarargs(value: Language*): Self = StObject.set(x, "Languages", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
