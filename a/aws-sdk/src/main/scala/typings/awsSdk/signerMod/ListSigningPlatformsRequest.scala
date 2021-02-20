package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSigningPlatformsRequest extends StObject {
  
  /**
    * The category type of a signing platform.
    */
  var category: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of results to be returned by this operation.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * Value for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * Any partner entities connected to a signing platform.
    */
  var partner: js.UndefOr[String] = js.native
  
  /**
    * The validation template that is used by the target signing platform.
    */
  var target: js.UndefOr[String] = js.native
}
object ListSigningPlatformsRequest {
  
  @scala.inline
  def apply(): ListSigningPlatformsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningPlatformsRequest]
  }
  
  @scala.inline
  implicit class ListSigningPlatformsRequestMutableBuilder[Self <: ListSigningPlatformsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPartner(value: String): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerUndefined: Self = StObject.set(x, "partner", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
