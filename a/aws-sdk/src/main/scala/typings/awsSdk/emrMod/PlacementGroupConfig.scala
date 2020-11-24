package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementGroupConfig extends js.Object {
  
  /**
    * Role of the instance in the cluster. Starting with Amazon EMR version 5.23.0, the only supported instance role is MASTER.
    */
  var InstanceRole: InstanceRoleType = js.native
  
  /**
    * EC2 Placement Group strategy associated with instance role. Starting with Amazon EMR version 5.23.0, the only supported placement strategy is SPREAD for the MASTER instance role.
    */
  var PlacementStrategy: js.UndefOr[PlacementGroupStrategy] = js.native
}
object PlacementGroupConfig {
  
  @scala.inline
  def apply(InstanceRole: InstanceRoleType): PlacementGroupConfig = {
    val __obj = js.Dynamic.literal(InstanceRole = InstanceRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementGroupConfig]
  }
  
  @scala.inline
  implicit class PlacementGroupConfigOps[Self <: PlacementGroupConfig] (val x: Self) extends AnyVal {
    
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
    def setInstanceRole(value: InstanceRoleType): Self = this.set("InstanceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementStrategy(value: PlacementGroupStrategy): Self = this.set("PlacementStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementStrategy: Self = this.set("PlacementStrategy", js.undefined)
  }
}
