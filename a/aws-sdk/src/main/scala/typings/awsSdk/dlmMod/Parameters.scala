package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameters extends js.Object {
  
  /**
    * [EBS Snapshot Management – Instance policies only] Indicates whether to exclude the root volume from snapshots created using CreateSnapshots. The default is false.
    */
  var ExcludeBootVolume: js.UndefOr[typings.awsSdk.dlmMod.ExcludeBootVolume] = js.native
  
  /**
    * Applies to AMI lifecycle policies only. Indicates whether targeted instances are rebooted when the lifecycle policy runs. true indicates that targeted instances are not rebooted when the policy runs. false indicates that target instances are rebooted when the policy runs. The default is true (instance are not rebooted).
    */
  var NoReboot: js.UndefOr[typings.awsSdk.dlmMod.NoReboot] = js.native
}
object Parameters {
  
  @scala.inline
  def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
    
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
    def setExcludeBootVolume(value: ExcludeBootVolume): Self = this.set("ExcludeBootVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeBootVolume: Self = this.set("ExcludeBootVolume", js.undefined)
    
    @scala.inline
    def setNoReboot(value: NoReboot): Self = this.set("NoReboot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoReboot: Self = this.set("NoReboot", js.undefined)
  }
}
