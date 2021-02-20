package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInstanceGroupsOutput extends StObject {
  
  /**
    * The list of instance groups for the cluster and given filters.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupList] = js.native
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}
object ListInstanceGroupsOutput {
  
  @scala.inline
  def apply(): ListInstanceGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceGroupsOutput]
  }
  
  @scala.inline
  implicit class ListInstanceGroupsOutputMutableBuilder[Self <: ListInstanceGroupsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceGroups(value: InstanceGroupList): Self = StObject.set(x, "InstanceGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupsUndefined: Self = StObject.set(x, "InstanceGroups", js.undefined)
    
    @scala.inline
    def setInstanceGroupsVarargs(value: InstanceGroup*): Self = StObject.set(x, "InstanceGroups", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
