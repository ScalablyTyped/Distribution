package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApprovedOriginsResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  
  /**
    * The approved origins.
    */
  var Origins: js.UndefOr[OriginsList] = js.native
}
object ListApprovedOriginsResponse {
  
  @scala.inline
  def apply(): ListApprovedOriginsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApprovedOriginsResponse]
  }
  
  @scala.inline
  implicit class ListApprovedOriginsResponseMutableBuilder[Self <: ListApprovedOriginsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrigins(value: OriginsList): Self = StObject.set(x, "Origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginsUndefined: Self = StObject.set(x, "Origins", js.undefined)
    
    @scala.inline
    def setOriginsVarargs(value: Origin*): Self = StObject.set(x, "Origins", js.Array(value :_*))
  }
}
