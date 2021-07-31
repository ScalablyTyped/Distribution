package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigsRequest extends StObject {
  
  /**
    * Maximum number of Configs returned.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * Next token returned in the request of a previous ListConfigs call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListConfigsRequest {
  
  @scala.inline
  def apply(): ListConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigsRequest]
  }
  
  @scala.inline
  implicit class ListConfigsRequestMutableBuilder[Self <: ListConfigsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
