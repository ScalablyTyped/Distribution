package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceDelegatesResponse extends StObject {
  
  /**
    * One page of the resource's delegates.
    */
  var Delegates: js.UndefOr[ResourceDelegates] = js.native
  
  /**
    * The token used to paginate through the delegates associated with a resource. While results are still available, it has an associated value. When the last page is reached, the token is empty. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.native
}
object ListResourceDelegatesResponse {
  
  @scala.inline
  def apply(): ListResourceDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceDelegatesResponse]
  }
  
  @scala.inline
  implicit class ListResourceDelegatesResponseMutableBuilder[Self <: ListResourceDelegatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegates(value: ResourceDelegates): Self = StObject.set(x, "Delegates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatesUndefined: Self = StObject.set(x, "Delegates", js.undefined)
    
    @scala.inline
    def setDelegatesVarargs(value: Delegate*): Self = StObject.set(x, "Delegates", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
