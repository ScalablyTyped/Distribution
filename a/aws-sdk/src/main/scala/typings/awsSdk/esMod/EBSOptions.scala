package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EBSOptions extends StObject {
  
  /**
    * Specifies whether EBS-based storage is enabled.
    */
  var EBSEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the IOPS for Provisioned IOPS And GP3 EBS volume (SSD).
    */
  var Iops: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    * Specifies the Throughput for GP3 EBS volume (SSD).
    */
  var Throughput: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    *  Integer to specify the size of an EBS volume.
    */
  var VolumeSize: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    *  Specifies the volume type for EBS-based storage.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.esMod.VolumeType] = js.undefined
}
object EBSOptions {
  
  inline def apply(): EBSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBSOptions]
  }
  
  extension [Self <: EBSOptions](x: Self) {
    
    inline def setEBSEnabled(value: Boolean): Self = StObject.set(x, "EBSEnabled", value.asInstanceOf[js.Any])
    
    inline def setEBSEnabledUndefined: Self = StObject.set(x, "EBSEnabled", js.undefined)
    
    inline def setIops(value: IntegerClass): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setThroughput(value: IntegerClass): Self = StObject.set(x, "Throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "Throughput", js.undefined)
    
    inline def setVolumeSize(value: IntegerClass): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
    
    inline def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
