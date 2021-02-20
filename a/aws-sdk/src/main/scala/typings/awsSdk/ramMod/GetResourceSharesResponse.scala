package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceSharesResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the resource shares.
    */
  var resourceShares: js.UndefOr[ResourceShareList] = js.native
}
object GetResourceSharesResponse {
  
  @scala.inline
  def apply(): GetResourceSharesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceSharesResponse]
  }
  
  @scala.inline
  implicit class GetResourceSharesResponseMutableBuilder[Self <: GetResourceSharesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceShares(value: ResourceShareList): Self = StObject.set(x, "resourceShares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceSharesUndefined: Self = StObject.set(x, "resourceShares", js.undefined)
    
    @scala.inline
    def setResourceSharesVarargs(value: ResourceShare*): Self = StObject.set(x, "resourceShares", js.Array(value :_*))
  }
}
