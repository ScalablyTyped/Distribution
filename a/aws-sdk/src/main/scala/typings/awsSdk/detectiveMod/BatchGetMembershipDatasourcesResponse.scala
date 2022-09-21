package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetMembershipDatasourcesResponse extends StObject {
  
  /**
    * Details on the data source package history for an member of the behavior graph.
    */
  var MembershipDatasources: js.UndefOr[MembershipDatasourcesList] = js.undefined
  
  /**
    * Graphs that data source package information could not be retrieved for.
    */
  var UnprocessedGraphs: js.UndefOr[UnprocessedGraphList] = js.undefined
}
object BatchGetMembershipDatasourcesResponse {
  
  inline def apply(): BatchGetMembershipDatasourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetMembershipDatasourcesResponse]
  }
  
  extension [Self <: BatchGetMembershipDatasourcesResponse](x: Self) {
    
    inline def setMembershipDatasources(value: MembershipDatasourcesList): Self = StObject.set(x, "MembershipDatasources", value.asInstanceOf[js.Any])
    
    inline def setMembershipDatasourcesUndefined: Self = StObject.set(x, "MembershipDatasources", js.undefined)
    
    inline def setMembershipDatasourcesVarargs(value: MembershipDatasources*): Self = StObject.set(x, "MembershipDatasources", js.Array(value*))
    
    inline def setUnprocessedGraphs(value: UnprocessedGraphList): Self = StObject.set(x, "UnprocessedGraphs", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedGraphsUndefined: Self = StObject.set(x, "UnprocessedGraphs", js.undefined)
    
    inline def setUnprocessedGraphsVarargs(value: UnprocessedGraph*): Self = StObject.set(x, "UnprocessedGraphs", js.Array(value*))
  }
}
