package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInstancesInput extends js.Object {
  
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
  implicit class ListInstancesInputOps[Self <: ListInstancesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFleetId(value: InstanceFleetId): Self = this.set("InstanceFleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFleetId: Self = this.set("InstanceFleetId", js.undefined)
    
    @scala.inline
    def setInstanceFleetType(value: InstanceFleetType): Self = this.set("InstanceFleetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFleetType: Self = this.set("InstanceFleetType", js.undefined)
    
    @scala.inline
    def setInstanceGroupId(value: InstanceGroupId): Self = this.set("InstanceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceGroupId: Self = this.set("InstanceGroupId", js.undefined)
    
    @scala.inline
    def setInstanceGroupTypesVarargs(value: InstanceGroupType*): Self = this.set("InstanceGroupTypes", js.Array(value :_*))
    
    @scala.inline
    def setInstanceGroupTypes(value: InstanceGroupTypeList): Self = this.set("InstanceGroupTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceGroupTypes: Self = this.set("InstanceGroupTypes", js.undefined)
    
    @scala.inline
    def setInstanceStatesVarargs(value: InstanceState*): Self = this.set("InstanceStates", js.Array(value :_*))
    
    @scala.inline
    def setInstanceStates(value: InstanceStateList): Self = this.set("InstanceStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceStates: Self = this.set("InstanceStates", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
