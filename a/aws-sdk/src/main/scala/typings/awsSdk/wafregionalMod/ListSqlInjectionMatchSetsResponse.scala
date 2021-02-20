package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSqlInjectionMatchSetsResponse extends StObject {
  
  /**
    * If you have more SqlInjectionMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more SqlInjectionMatchSet objects, submit another ListSqlInjectionMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.native
  
  /**
    * An array of SqlInjectionMatchSetSummary objects.
    */
  var SqlInjectionMatchSets: js.UndefOr[SqlInjectionMatchSetSummaries] = js.native
}
object ListSqlInjectionMatchSetsResponse {
  
  @scala.inline
  def apply(): ListSqlInjectionMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSqlInjectionMatchSetsResponse]
  }
  
  @scala.inline
  implicit class ListSqlInjectionMatchSetsResponseMutableBuilder[Self <: ListSqlInjectionMatchSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setSqlInjectionMatchSets(value: SqlInjectionMatchSetSummaries): Self = StObject.set(x, "SqlInjectionMatchSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlInjectionMatchSetsUndefined: Self = StObject.set(x, "SqlInjectionMatchSets", js.undefined)
    
    @scala.inline
    def setSqlInjectionMatchSetsVarargs(value: SqlInjectionMatchSetSummary*): Self = StObject.set(x, "SqlInjectionMatchSets", js.Array(value :_*))
  }
}
