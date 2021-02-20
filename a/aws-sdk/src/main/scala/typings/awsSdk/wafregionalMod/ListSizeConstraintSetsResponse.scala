package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSizeConstraintSetsResponse extends StObject {
  
  /**
    * If you have more SizeConstraintSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more SizeConstraintSet objects, submit another ListSizeConstraintSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.native
  
  /**
    * An array of SizeConstraintSetSummary objects.
    */
  var SizeConstraintSets: js.UndefOr[SizeConstraintSetSummaries] = js.native
}
object ListSizeConstraintSetsResponse {
  
  @scala.inline
  def apply(): ListSizeConstraintSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSizeConstraintSetsResponse]
  }
  
  @scala.inline
  implicit class ListSizeConstraintSetsResponseMutableBuilder[Self <: ListSizeConstraintSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setSizeConstraintSets(value: SizeConstraintSetSummaries): Self = StObject.set(x, "SizeConstraintSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeConstraintSetsUndefined: Self = StObject.set(x, "SizeConstraintSets", js.undefined)
    
    @scala.inline
    def setSizeConstraintSetsVarargs(value: SizeConstraintSetSummary*): Self = StObject.set(x, "SizeConstraintSets", js.Array(value :_*))
  }
}
