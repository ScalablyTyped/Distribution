package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOfferingsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * List of offerings
    */
  var Offerings: js.UndefOr[listOfOffering] = js.undefined
}
object ListOfferingsResponse {
  
  @scala.inline
  def apply(): ListOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingsResponse]
  }
  
  @scala.inline
  implicit class ListOfferingsResponseMutableBuilder[Self <: ListOfferingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOfferings(value: listOfOffering): Self = StObject.set(x, "Offerings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingsUndefined: Self = StObject.set(x, "Offerings", js.undefined)
    
    @scala.inline
    def setOfferingsVarargs(value: Offering*): Self = StObject.set(x, "Offerings", js.Array(value :_*))
  }
}
