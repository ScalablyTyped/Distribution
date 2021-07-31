package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchThingsResponse extends StObject {
  
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of things in the result set.
    */
  var things: js.UndefOr[Things] = js.undefined
}
object SearchThingsResponse {
  
  @scala.inline
  def apply(): SearchThingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchThingsResponse]
  }
  
  @scala.inline
  implicit class SearchThingsResponseMutableBuilder[Self <: SearchThingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setThings(value: Things): Self = StObject.set(x, "things", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingsUndefined: Self = StObject.set(x, "things", js.undefined)
    
    @scala.inline
    def setThingsVarargs(value: Thing*): Self = StObject.set(x, "things", js.Array(value :_*))
  }
}
