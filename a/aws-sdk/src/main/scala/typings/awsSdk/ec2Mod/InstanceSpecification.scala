package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceSpecification extends StObject {
  
  /**
    * Excludes the root volume from being snapshotted.
    */
  var ExcludeBootVolume: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the data (non-root) volumes to exclude from the multi-volume snapshot set. If you specify the ID of the root volume, the request fails. To exclude the root volume, use ExcludeBootVolume. You can specify up to 40 volume IDs per request.
    */
  var ExcludeDataVolumeIds: js.UndefOr[VolumeIdStringList] = js.undefined
  
  /**
    * The instance to specify which volumes should be snapshotted.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceId] = js.undefined
}
object InstanceSpecification {
  
  inline def apply(): InstanceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSpecification]
  }
  
  extension [Self <: InstanceSpecification](x: Self) {
    
    inline def setExcludeBootVolume(value: Boolean): Self = StObject.set(x, "ExcludeBootVolume", value.asInstanceOf[js.Any])
    
    inline def setExcludeBootVolumeUndefined: Self = StObject.set(x, "ExcludeBootVolume", js.undefined)
    
    inline def setExcludeDataVolumeIds(value: VolumeIdStringList): Self = StObject.set(x, "ExcludeDataVolumeIds", value.asInstanceOf[js.Any])
    
    inline def setExcludeDataVolumeIdsUndefined: Self = StObject.set(x, "ExcludeDataVolumeIds", js.undefined)
    
    inline def setExcludeDataVolumeIdsVarargs(value: VolumeId*): Self = StObject.set(x, "ExcludeDataVolumeIds", js.Array(value*))
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
