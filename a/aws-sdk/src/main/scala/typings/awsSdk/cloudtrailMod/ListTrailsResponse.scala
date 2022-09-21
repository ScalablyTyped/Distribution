package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrailsResponse extends StObject {
  
  /**
    * The token to use to get the next page of results after a previous API call. If the token does not appear, there are no more results to return. The token must be passed in with the same parameters as the previous call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the name, ARN, and home region of trails in the current account.
    */
  var Trails: js.UndefOr[typings.awsSdk.cloudtrailMod.Trails] = js.undefined
}
object ListTrailsResponse {
  
  inline def apply(): ListTrailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrailsResponse]
  }
  
  extension [Self <: ListTrailsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTrails(value: Trails): Self = StObject.set(x, "Trails", value.asInstanceOf[js.Any])
    
    inline def setTrailsUndefined: Self = StObject.set(x, "Trails", js.undefined)
    
    inline def setTrailsVarargs(value: TrailInfo*): Self = StObject.set(x, "Trails", js.Array(value*))
  }
}
