package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceGroupsInput extends StObject {
  
  /**
    * The identifier of the cluster for which to list the instance groups.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.undefined
}
object ListInstanceGroupsInput {
  
  @scala.inline
  def apply(ClusterId: ClusterId): ListInstanceGroupsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceGroupsInput]
  }
  
  @scala.inline
  implicit class ListInstanceGroupsInputMutableBuilder[Self <: ListInstanceGroupsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
