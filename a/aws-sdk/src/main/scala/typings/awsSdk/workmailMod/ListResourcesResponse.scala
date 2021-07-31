package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesResponse extends StObject {
  
  /**
    *  The token used to paginate through all the organization's resources. While results are still available, it has an associated value. When the last page is reached, the token is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.undefined
  
  /**
    * One page of the organization's resource representation.
    */
  var Resources: js.UndefOr[typings.awsSdk.workmailMod.Resources] = js.undefined
}
object ListResourcesResponse {
  
  @scala.inline
  def apply(): ListResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesResponse]
  }
  
  @scala.inline
  implicit class ListResourcesResponseMutableBuilder[Self <: ListResourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResources(value: Resources): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "Resources", js.Array(value :_*))
  }
}
