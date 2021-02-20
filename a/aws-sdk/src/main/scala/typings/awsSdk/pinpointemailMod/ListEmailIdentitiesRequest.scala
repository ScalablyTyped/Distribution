package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEmailIdentitiesRequest extends StObject {
  
  /**
    * A token returned from a previous call to ListEmailIdentities to indicate the position in the list of identities.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointemailMod.NextToken] = js.native
  
  /**
    * The number of results to show in a single call to ListEmailIdentities. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results. The value you specify has to be at least 0, and can be no more than 1000.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
}
object ListEmailIdentitiesRequest {
  
  @scala.inline
  def apply(): ListEmailIdentitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEmailIdentitiesRequest]
  }
  
  @scala.inline
  implicit class ListEmailIdentitiesRequestMutableBuilder[Self <: ListEmailIdentitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPageSize(value: MaxItems): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
