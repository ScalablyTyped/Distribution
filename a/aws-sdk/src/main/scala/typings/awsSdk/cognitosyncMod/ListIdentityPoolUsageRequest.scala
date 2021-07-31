package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityPoolUsageRequest extends StObject {
  
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[IntegerString] = js.undefined
  
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListIdentityPoolUsageRequest {
  
  @scala.inline
  def apply(): ListIdentityPoolUsageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityPoolUsageRequest]
  }
  
  @scala.inline
  implicit class ListIdentityPoolUsageRequestMutableBuilder[Self <: ListIdentityPoolUsageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: IntegerString): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
