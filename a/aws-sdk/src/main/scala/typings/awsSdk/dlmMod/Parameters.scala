package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameters extends StObject {
  
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
  implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeBootVolume(value: ExcludeBootVolume): Self = StObject.set(x, "ExcludeBootVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeBootVolumeUndefined: Self = StObject.set(x, "ExcludeBootVolume", js.undefined)
    
    @scala.inline
    def setNoReboot(value: NoReboot): Self = StObject.set(x, "NoReboot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRebootUndefined: Self = StObject.set(x, "NoReboot", js.undefined)
  }
}
