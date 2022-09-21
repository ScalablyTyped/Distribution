package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOntapVolumeConfiguration extends StObject {
  
  /**
    * Specifies the location in the SVM's namespace where the volume is mounted. The JunctionPath must have a leading forward slash, such as /vol3.
    */
  var JunctionPath: js.UndefOr[typings.awsSdk.fsxMod.JunctionPath] = js.undefined
  
  /**
    * The security style for the volume, which can be UNIX. NTFS, or MIXED.
    */
  var SecurityStyle: js.UndefOr[typings.awsSdk.fsxMod.SecurityStyle] = js.undefined
  
  /**
    * Specifies the size of the volume in megabytes.
    */
  var SizeInMegabytes: js.UndefOr[VolumeCapacity] = js.undefined
  
  /**
    * Default is false. Set to true to enable the deduplication, compression, and compaction storage efficiency features on the volume.
    */
  var StorageEfficiencyEnabled: js.UndefOr[Flag] = js.undefined
  
  /**
    * Update the volume's data tiering policy.
    */
  var TieringPolicy: js.UndefOr[typings.awsSdk.fsxMod.TieringPolicy] = js.undefined
}
object UpdateOntapVolumeConfiguration {
  
  inline def apply(): UpdateOntapVolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOntapVolumeConfiguration]
  }
  
  extension [Self <: UpdateOntapVolumeConfiguration](x: Self) {
    
    inline def setJunctionPath(value: JunctionPath): Self = StObject.set(x, "JunctionPath", value.asInstanceOf[js.Any])
    
    inline def setJunctionPathUndefined: Self = StObject.set(x, "JunctionPath", js.undefined)
    
    inline def setSecurityStyle(value: SecurityStyle): Self = StObject.set(x, "SecurityStyle", value.asInstanceOf[js.Any])
    
    inline def setSecurityStyleUndefined: Self = StObject.set(x, "SecurityStyle", js.undefined)
    
    inline def setSizeInMegabytes(value: VolumeCapacity): Self = StObject.set(x, "SizeInMegabytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInMegabytesUndefined: Self = StObject.set(x, "SizeInMegabytes", js.undefined)
    
    inline def setStorageEfficiencyEnabled(value: Flag): Self = StObject.set(x, "StorageEfficiencyEnabled", value.asInstanceOf[js.Any])
    
    inline def setStorageEfficiencyEnabledUndefined: Self = StObject.set(x, "StorageEfficiencyEnabled", js.undefined)
    
    inline def setTieringPolicy(value: TieringPolicy): Self = StObject.set(x, "TieringPolicy", value.asInstanceOf[js.Any])
    
    inline def setTieringPolicyUndefined: Self = StObject.set(x, "TieringPolicy", js.undefined)
  }
}
