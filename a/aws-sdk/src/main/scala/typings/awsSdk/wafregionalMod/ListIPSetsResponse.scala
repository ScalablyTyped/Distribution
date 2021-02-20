package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIPSetsResponse extends StObject {
  
  /**
    * An array of IPSetSummary objects.
    */
  var IPSets: js.UndefOr[IPSetSummaries] = js.native
  
  /**
    * To list more IPSet objects, submit another ListIPSets request, and in the next request use the NextMarker response value as the NextMarker value.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.native
}
object ListIPSetsResponse {
  
  @scala.inline
  def apply(): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIPSetsResponse]
  }
  
  @scala.inline
  implicit class ListIPSetsResponseMutableBuilder[Self <: ListIPSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIPSets(value: IPSetSummaries): Self = StObject.set(x, "IPSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPSetsUndefined: Self = StObject.set(x, "IPSets", js.undefined)
    
    @scala.inline
    def setIPSetsVarargs(value: IPSetSummary*): Self = StObject.set(x, "IPSets", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
