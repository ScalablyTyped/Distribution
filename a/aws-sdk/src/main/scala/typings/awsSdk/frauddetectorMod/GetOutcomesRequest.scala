package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOutcomesRequest extends StObject {
  
  /**
    * The maximum number of objects to return for the request. 
    */
  var maxResults: js.UndefOr[OutcomesMaxResults] = js.native
  
  /**
    * The name of the outcome or outcomes to get.
    */
  var name: js.UndefOr[identifier] = js.native
  
  /**
    * The next page token for the request. 
    */
  var nextToken: js.UndefOr[String] = js.native
}
object GetOutcomesRequest {
  
  @scala.inline
  def apply(): GetOutcomesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutcomesRequest]
  }
  
  @scala.inline
  implicit class GetOutcomesRequestMutableBuilder[Self <: GetOutcomesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: OutcomesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
