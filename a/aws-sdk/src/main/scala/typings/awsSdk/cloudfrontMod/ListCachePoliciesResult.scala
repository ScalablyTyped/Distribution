package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCachePoliciesResult extends StObject {
  
  /**
    * A list of cache policies.
    */
  var CachePolicyList: js.UndefOr[typings.awsSdk.cloudfrontMod.CachePolicyList] = js.native
}
object ListCachePoliciesResult {
  
  @scala.inline
  def apply(): ListCachePoliciesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCachePoliciesResult]
  }
  
  @scala.inline
  implicit class ListCachePoliciesResultMutableBuilder[Self <: ListCachePoliciesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachePolicyList(value: CachePolicyList): Self = StObject.set(x, "CachePolicyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachePolicyListUndefined: Self = StObject.set(x, "CachePolicyList", js.undefined)
  }
}
