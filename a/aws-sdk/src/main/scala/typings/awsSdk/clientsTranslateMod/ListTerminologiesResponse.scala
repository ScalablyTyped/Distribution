package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTerminologiesResponse extends StObject {
  
  /**
    *  If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom terminologies.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTranslateMod.NextToken] = js.undefined
  
  /**
    * The properties list of the custom terminologies returned on the list request.
    */
  var TerminologyPropertiesList: js.UndefOr[typings.awsSdk.clientsTranslateMod.TerminologyPropertiesList] = js.undefined
}
object ListTerminologiesResponse {
  
  inline def apply(): ListTerminologiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTerminologiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTerminologiesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTerminologyPropertiesList(value: TerminologyPropertiesList): Self = StObject.set(x, "TerminologyPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setTerminologyPropertiesListUndefined: Self = StObject.set(x, "TerminologyPropertiesList", js.undefined)
    
    inline def setTerminologyPropertiesListVarargs(value: TerminologyProperties*): Self = StObject.set(x, "TerminologyPropertiesList", js.Array(value*))
  }
}
