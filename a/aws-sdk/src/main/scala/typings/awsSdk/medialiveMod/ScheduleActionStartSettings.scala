package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleActionStartSettings extends js.Object {
  
  /**
    * Option for specifying the start time for an action.
    */
  var FixedModeScheduleActionStartSettings: js.UndefOr[typings.awsSdk.medialiveMod.FixedModeScheduleActionStartSettings] = js.native
  
  /**
    * Option for specifying an action as relative to another action.
    */
  var FollowModeScheduleActionStartSettings: js.UndefOr[typings.awsSdk.medialiveMod.FollowModeScheduleActionStartSettings] = js.native
  
  /**
    * Option for specifying an action that should be applied immediately.
    */
  var ImmediateModeScheduleActionStartSettings: js.UndefOr[typings.awsSdk.medialiveMod.ImmediateModeScheduleActionStartSettings] = js.native
}
object ScheduleActionStartSettings {
  
  @scala.inline
  def apply(): ScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleActionStartSettings]
  }
  
  @scala.inline
  implicit class ScheduleActionStartSettingsOps[Self <: ScheduleActionStartSettings] (val x: Self) extends AnyVal {
    
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
    def setFixedModeScheduleActionStartSettings(value: FixedModeScheduleActionStartSettings): Self = this.set("FixedModeScheduleActionStartSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedModeScheduleActionStartSettings: Self = this.set("FixedModeScheduleActionStartSettings", js.undefined)
    
    @scala.inline
    def setFollowModeScheduleActionStartSettings(value: FollowModeScheduleActionStartSettings): Self = this.set("FollowModeScheduleActionStartSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowModeScheduleActionStartSettings: Self = this.set("FollowModeScheduleActionStartSettings", js.undefined)
    
    @scala.inline
    def setImmediateModeScheduleActionStartSettings(value: ImmediateModeScheduleActionStartSettings): Self = this.set("ImmediateModeScheduleActionStartSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediateModeScheduleActionStartSettings: Self = this.set("ImmediateModeScheduleActionStartSettings", js.undefined)
  }
}
