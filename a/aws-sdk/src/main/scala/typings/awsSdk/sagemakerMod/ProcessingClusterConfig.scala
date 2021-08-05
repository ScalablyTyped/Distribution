package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingClusterConfig extends StObject {
  
  /**
    * The number of ML compute instances to use in the processing job. For distributed processing jobs, specify a value greater than 1. The default value is 1.
    */
  var InstanceCount: ProcessingInstanceCount
  
  /**
    * The ML compute instance type for the processing job.
    */
  var InstanceType: ProcessingInstanceType
  
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the processing job. 
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The size of the ML storage volume in gigabytes that you want to provision. You must specify sufficient ML storage for your scenario.
    */
  var VolumeSizeInGB: ProcessingVolumeSizeInGB
}
object ProcessingClusterConfig {
  
  inline def apply(
    InstanceCount: ProcessingInstanceCount,
    InstanceType: ProcessingInstanceType,
    VolumeSizeInGB: ProcessingVolumeSizeInGB
  ): ProcessingClusterConfig = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], VolumeSizeInGB = VolumeSizeInGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingClusterConfig]
  }
  
  extension [Self <: ProcessingClusterConfig](x: Self) {
    
    inline def setInstanceCount(value: ProcessingInstanceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: ProcessingInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
    
    inline def setVolumeSizeInGB(value: ProcessingVolumeSizeInGB): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
  }
}
