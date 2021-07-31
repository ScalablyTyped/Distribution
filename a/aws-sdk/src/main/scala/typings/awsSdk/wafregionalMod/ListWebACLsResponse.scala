package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWebACLsResponse extends StObject {
  
  /**
    * If you have more WebACL objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more WebACL objects, submit another ListWebACLs request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.undefined
  
  /**
    * An array of WebACLSummary objects.
    */
  var WebACLs: js.UndefOr[WebACLSummaries] = js.undefined
}
object ListWebACLsResponse {
  
  @scala.inline
  def apply(): ListWebACLsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebACLsResponse]
  }
  
  @scala.inline
  implicit class ListWebACLsResponseMutableBuilder[Self <: ListWebACLsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setWebACLs(value: WebACLSummaries): Self = StObject.set(x, "WebACLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLsUndefined: Self = StObject.set(x, "WebACLs", js.undefined)
    
    @scala.inline
    def setWebACLsVarargs(value: WebACLSummary*): Self = StObject.set(x, "WebACLs", js.Array(value :_*))
  }
}
