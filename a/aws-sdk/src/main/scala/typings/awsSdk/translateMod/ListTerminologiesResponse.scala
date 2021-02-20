package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTerminologiesResponse extends StObject {
  
  /**
    *  If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom terminologies.
    */
  var NextToken: js.UndefOr[typings.awsSdk.translateMod.NextToken] = js.native
  
  /**
    * The properties list of the custom terminologies returned on the list request.
    */
  var TerminologyPropertiesList: js.UndefOr[typings.awsSdk.translateMod.TerminologyPropertiesList] = js.native
}
object ListTerminologiesResponse {
  
  @scala.inline
  def apply(): ListTerminologiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTerminologiesResponse]
  }
  
  @scala.inline
  implicit class ListTerminologiesResponseMutableBuilder[Self <: ListTerminologiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTerminologyPropertiesList(value: TerminologyPropertiesList): Self = StObject.set(x, "TerminologyPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminologyPropertiesListUndefined: Self = StObject.set(x, "TerminologyPropertiesList", js.undefined)
    
    @scala.inline
    def setTerminologyPropertiesListVarargs(value: TerminologyProperties*): Self = StObject.set(x, "TerminologyPropertiesList", js.Array(value :_*))
  }
}
