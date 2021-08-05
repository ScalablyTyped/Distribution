package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceDelegatesResponse extends StObject {
  
  /**
    * One page of the resource's delegates.
    */
  var Delegates: js.UndefOr[ResourceDelegates] = js.undefined
  
  /**
    * The token used to paginate through the delegates associated with a resource. While results are still available, it has an associated value. When the last page is reached, the token is empty. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.undefined
}
object ListResourceDelegatesResponse {
  
  inline def apply(): ListResourceDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceDelegatesResponse]
  }
  
  extension [Self <: ListResourceDelegatesResponse](x: Self) {
    
    inline def setDelegates(value: ResourceDelegates): Self = StObject.set(x, "Delegates", value.asInstanceOf[js.Any])
    
    inline def setDelegatesUndefined: Self = StObject.set(x, "Delegates", js.undefined)
    
    inline def setDelegatesVarargs(value: Delegate*): Self = StObject.set(x, "Delegates", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
