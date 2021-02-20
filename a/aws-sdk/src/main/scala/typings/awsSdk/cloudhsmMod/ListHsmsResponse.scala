package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHsmsResponse extends StObject {
  
  /**
    * The list of ARNs that identify the HSMs.
    */
  var HsmList: js.UndefOr[typings.awsSdk.cloudhsmMod.HsmList] = js.native
  
  /**
    * If not null, more results are available. Pass this value to ListHsms to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListHsmsResponse {
  
  @scala.inline
  def apply(): ListHsmsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHsmsResponse]
  }
  
  @scala.inline
  implicit class ListHsmsResponseMutableBuilder[Self <: ListHsmsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmList(value: HsmList): Self = StObject.set(x, "HsmList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmListUndefined: Self = StObject.set(x, "HsmList", js.undefined)
    
    @scala.inline
    def setHsmListVarargs(value: HsmArn*): Self = StObject.set(x, "HsmList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
