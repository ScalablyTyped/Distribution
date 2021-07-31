package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBundlesRequest extends StObject {
  
  /**
    * A Boolean value that indicates whether to include inactive bundle results in your request.
    */
  var includeInactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetBundles request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object GetBundlesRequest {
  
  @scala.inline
  def apply(): GetBundlesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBundlesRequest]
  }
  
  @scala.inline
  implicit class GetBundlesRequestMutableBuilder[Self <: GetBundlesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeInactive(value: Boolean): Self = StObject.set(x, "includeInactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInactiveUndefined: Self = StObject.set(x, "includeInactive", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
