package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalNodeGroup extends js.Object {
  
  /**
    * The name of the global node group
    */
  var GlobalNodeGroupId: js.UndefOr[String] = js.native
  
  /**
    * The keyspace for this node group
    */
  var Slots: js.UndefOr[String] = js.native
}
object GlobalNodeGroup {
  
  @scala.inline
  def apply(): GlobalNodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalNodeGroup]
  }
  
  @scala.inline
  implicit class GlobalNodeGroupOps[Self <: GlobalNodeGroup] (val x: Self) extends AnyVal {
    
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
    def setGlobalNodeGroupId(value: String): Self = this.set("GlobalNodeGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalNodeGroupId: Self = this.set("GlobalNodeGroupId", js.undefined)
    
    @scala.inline
    def setSlots(value: String): Self = this.set("Slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlots: Self = this.set("Slots", js.undefined)
  }
}
