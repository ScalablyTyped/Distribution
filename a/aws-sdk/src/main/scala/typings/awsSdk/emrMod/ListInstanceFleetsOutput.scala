package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceFleetsOutput extends StObject {
  
  /**
    * The list of instance fleets for the cluster and given filters.
    */
  var InstanceFleets: js.UndefOr[InstanceFleetList] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.undefined
}
object ListInstanceFleetsOutput {
  
  @scala.inline
  def apply(): ListInstanceFleetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceFleetsOutput]
  }
  
  @scala.inline
  implicit class ListInstanceFleetsOutputMutableBuilder[Self <: ListInstanceFleetsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceFleets(value: InstanceFleetList): Self = StObject.set(x, "InstanceFleets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFleetsUndefined: Self = StObject.set(x, "InstanceFleets", js.undefined)
    
    @scala.inline
    def setInstanceFleetsVarargs(value: InstanceFleet*): Self = StObject.set(x, "InstanceFleets", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
