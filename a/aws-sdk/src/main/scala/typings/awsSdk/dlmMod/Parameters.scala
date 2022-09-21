package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  /**
    *  [Snapshot policies that target instances only] Indicates whether to exclude the root volume from multi-volume snapshot sets. The default is false. If you specify true, then the root volumes attached to targeted instances will be excluded from the multi-volume snapshot sets created by the policy.
    */
  var ExcludeBootVolume: js.UndefOr[typings.awsSdk.dlmMod.ExcludeBootVolume] = js.undefined
  
  /**
    *  [Snapshot policies that target instances only] The tags used to identify data (non-root) volumes to exclude from multi-volume snapshot sets. If you create a snapshot lifecycle policy that targets instances and you specify tags for this parameter, then data volumes with the specified tags that are attached to targeted instances will be excluded from the multi-volume snapshot sets created by the policy.
    */
  var ExcludeDataVolumeTags: js.UndefOr[ExcludeDataVolumeTagList] = js.undefined
  
  /**
    *  [AMI policies only] Indicates whether targeted instances are rebooted when the lifecycle policy runs. true indicates that targeted instances are not rebooted when the policy runs. false indicates that target instances are rebooted when the policy runs. The default is true (instances are not rebooted).
    */
  var NoReboot: js.UndefOr[typings.awsSdk.dlmMod.NoReboot] = js.undefined
}
object Parameters {
  
  inline def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  
  extension [Self <: Parameters](x: Self) {
    
    inline def setExcludeBootVolume(value: ExcludeBootVolume): Self = StObject.set(x, "ExcludeBootVolume", value.asInstanceOf[js.Any])
    
    inline def setExcludeBootVolumeUndefined: Self = StObject.set(x, "ExcludeBootVolume", js.undefined)
    
    inline def setExcludeDataVolumeTags(value: ExcludeDataVolumeTagList): Self = StObject.set(x, "ExcludeDataVolumeTags", value.asInstanceOf[js.Any])
    
    inline def setExcludeDataVolumeTagsUndefined: Self = StObject.set(x, "ExcludeDataVolumeTags", js.undefined)
    
    inline def setExcludeDataVolumeTagsVarargs(value: Tag*): Self = StObject.set(x, "ExcludeDataVolumeTags", js.Array(value*))
    
    inline def setNoReboot(value: NoReboot): Self = StObject.set(x, "NoReboot", value.asInstanceOf[js.Any])
    
    inline def setNoRebootUndefined: Self = StObject.set(x, "NoReboot", js.undefined)
  }
}
