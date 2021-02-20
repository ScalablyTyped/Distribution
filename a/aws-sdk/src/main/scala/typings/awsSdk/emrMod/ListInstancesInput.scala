package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInstancesInput extends StObject {
  
  /**
    * The identifier of the cluster for which to list the instances.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
  
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleetId: js.UndefOr[typings.awsSdk.emrMod.InstanceFleetId] = js.native
  
  /**
    * The node type of the instance fleet. For example MASTER, CORE, or TASK.
    */
  var InstanceFleetType: js.UndefOr[typings.awsSdk.emrMod.InstanceFleetType] = js.native
  
  /**
    * The identifier of the instance group for which to list the instances.
    */
  var InstanceGroupId: js.UndefOr[typings.awsSdk.emrMod.InstanceGroupId] = js.native
  
  /**
    * The type of instance group for which to list the instances.
    */
  var InstanceGroupTypes: js.UndefOr[InstanceGroupTypeList] = js.native
  
  /**
    * A list of instance states that will filter the instances returned with this request.
    */
  var InstanceStates: js.UndefOr[InstanceStateList] = js.native
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}
object ListInstancesInput {
  
  @scala.inline
  def apply(ClusterId: ClusterId): ListInstancesInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstancesInput]
  }
  
  @scala.inline
  implicit class ListInstancesInputMutableBuilder[Self <: ListInstancesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFleetId(value: InstanceFleetId): Self = StObject.set(x, "InstanceFleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFleetIdUndefined: Self = StObject.set(x, "InstanceFleetId", js.undefined)
    
    @scala.inline
    def setInstanceFleetType(value: InstanceFleetType): Self = StObject.set(x, "InstanceFleetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFleetTypeUndefined: Self = StObject.set(x, "InstanceFleetType", js.undefined)
    
    @scala.inline
    def setInstanceGroupId(value: InstanceGroupId): Self = StObject.set(x, "InstanceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupIdUndefined: Self = StObject.set(x, "InstanceGroupId", js.undefined)
    
    @scala.inline
    def setInstanceGroupTypes(value: InstanceGroupTypeList): Self = StObject.set(x, "InstanceGroupTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupTypesUndefined: Self = StObject.set(x, "InstanceGroupTypes", js.undefined)
    
    @scala.inline
    def setInstanceGroupTypesVarargs(value: InstanceGroupType*): Self = StObject.set(x, "InstanceGroupTypes", js.Array(value :_*))
    
    @scala.inline
    def setInstanceStates(value: InstanceStateList): Self = StObject.set(x, "InstanceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStatesUndefined: Self = StObject.set(x, "InstanceStates", js.undefined)
    
    @scala.inline
    def setInstanceStatesVarargs(value: InstanceState*): Self = StObject.set(x, "InstanceStates", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
