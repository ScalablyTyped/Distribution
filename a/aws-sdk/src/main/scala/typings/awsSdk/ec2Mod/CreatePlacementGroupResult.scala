package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePlacementGroupResult extends js.Object {
  
  var PlacementGroup: js.UndefOr[typings.awsSdk.ec2Mod.PlacementGroup] = js.native
}
object CreatePlacementGroupResult {
  
  @scala.inline
  def apply(): CreatePlacementGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlacementGroupResult]
  }
  
  @scala.inline
  implicit class CreatePlacementGroupResultOps[Self <: CreatePlacementGroupResult] (val x: Self) extends AnyVal {
    
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
    def setPlacementGroup(value: PlacementGroup): Self = this.set("PlacementGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementGroup: Self = this.set("PlacementGroup", js.undefined)
  }
}
