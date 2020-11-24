package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowModeScheduleActionStartSettings extends js.Object {
  
  /**
    * Identifies whether this action starts relative to the start or relative to the end of the reference action.
    */
  var FollowPoint: typings.awsSdk.medialiveMod.FollowPoint = js.native
  
  /**
    * The action name of another action that this one refers to.
    */
  var ReferenceActionName: string = js.native
}
object FollowModeScheduleActionStartSettings {
  
  @scala.inline
  def apply(FollowPoint: FollowPoint, ReferenceActionName: string): FollowModeScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal(FollowPoint = FollowPoint.asInstanceOf[js.Any], ReferenceActionName = ReferenceActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowModeScheduleActionStartSettings]
  }
  
  @scala.inline
  implicit class FollowModeScheduleActionStartSettingsOps[Self <: FollowModeScheduleActionStartSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFollowPoint(value: FollowPoint): Self = this.set("FollowPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceActionName(value: string): Self = this.set("ReferenceActionName", value.asInstanceOf[js.Any])
  }
}
