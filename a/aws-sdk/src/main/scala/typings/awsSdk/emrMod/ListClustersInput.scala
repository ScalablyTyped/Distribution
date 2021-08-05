package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersInput extends StObject {
  
  /**
    * The cluster state filters to apply when listing clusters.
    */
  var ClusterStates: js.UndefOr[ClusterStateList] = js.undefined
  
  /**
    * The creation date and time beginning value filter for listing clusters.
    */
  var CreatedAfter: js.UndefOr[Date] = js.undefined
  
  /**
    * The creation date and time end value filter for listing clusters.
    */
  var CreatedBefore: js.UndefOr[Date] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.undefined
}
object ListClustersInput {
  
  inline def apply(): ListClustersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersInput]
  }
  
  extension [Self <: ListClustersInput](x: Self) {
    
    inline def setClusterStates(value: ClusterStateList): Self = StObject.set(x, "ClusterStates", value.asInstanceOf[js.Any])
    
    inline def setClusterStatesUndefined: Self = StObject.set(x, "ClusterStates", js.undefined)
    
    inline def setClusterStatesVarargs(value: ClusterState*): Self = StObject.set(x, "ClusterStates", js.Array(value :_*))
    
    inline def setCreatedAfter(value: Date): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    inline def setCreatedBefore(value: Date): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
