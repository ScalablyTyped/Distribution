package typings.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HomeRegionControl extends js.Object {
  
  /**
    * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-" followed by 12 lowercase letters and numbers.
    */
  var ControlId: js.UndefOr[typings.awsSdk.migrationhubconfigMod.ControlId] = js.native
  
  /**
    * The AWS Region that's been set as home region. For example, "us-west-2" or "eu-central-1" are valid home regions.
    */
  var HomeRegion: js.UndefOr[typings.awsSdk.migrationhubconfigMod.HomeRegion] = js.native
  
  /**
    * A timestamp representing the time when the customer called CreateHomeregionControl and set the home region for the account.
    */
  var RequestedTime: js.UndefOr[typings.awsSdk.migrationhubconfigMod.RequestedTime] = js.native
  
  /**
    * The target parameter specifies the identifier to which the home region is applied, which is always an ACCOUNT. It applies the home region to the current ACCOUNT.
    */
  var Target: js.UndefOr[typings.awsSdk.migrationhubconfigMod.Target] = js.native
}
object HomeRegionControl {
  
  @scala.inline
  def apply(): HomeRegionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HomeRegionControl]
  }
  
  @scala.inline
  implicit class HomeRegionControlOps[Self <: HomeRegionControl] (val x: Self) extends AnyVal {
    
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
    def setControlId(value: ControlId): Self = this.set("ControlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlId: Self = this.set("ControlId", js.undefined)
    
    @scala.inline
    def setHomeRegion(value: HomeRegion): Self = this.set("HomeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeRegion: Self = this.set("HomeRegion", js.undefined)
    
    @scala.inline
    def setRequestedTime(value: RequestedTime): Self = this.set("RequestedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedTime: Self = this.set("RequestedTime", js.undefined)
    
    @scala.inline
    def setTarget(value: Target): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("Target", js.undefined)
  }
}
