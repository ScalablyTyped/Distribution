package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningResourceConfig extends StObject {
  
  /**
    * The strategy that determines the order of preference for resources specified in InstanceConfigs used in hyperparameter optimization.
    */
  var AllocationStrategy: js.UndefOr[HyperParameterTuningAllocationStrategy] = js.undefined
  
  /**
    * A list containing the configuration(s) for one or more resources for processing hyperparameter jobs. These resources include compute instances and storage volumes to use in model training jobs launched by hyperparameter tuning jobs. The AllocationStrategy controls the order in which multiple configurations provided in InstanceConfigs are used.  If you only want to use a single instance configuration inside the HyperParameterTuningResourceConfig API, do not provide a value for InstanceConfigs. Instead, use InstanceType, VolumeSizeInGB and InstanceCount. If you use InstanceConfigs, do not provide values for InstanceType, VolumeSizeInGB or InstanceCount. 
    */
  var InstanceConfigs: js.UndefOr[HyperParameterTuningInstanceConfigs] = js.undefined
  
  /**
    * The number of compute instances of type InstanceType to use. For distributed training, select a value greater than 1.
    */
  var InstanceCount: js.UndefOr[TrainingInstanceCount] = js.undefined
  
  /**
    * The instance type used to run hyperparameter optimization tuning jobs. See  descriptions of instance types for more information.
    */
  var InstanceType: js.UndefOr[TrainingInstanceType] = js.undefined
  
  /**
    * A key used by Amazon Web Services Key Management Service to encrypt data on the storage volume attached to the compute instances used to run the training job. You can use either of the following formats to specify a key. KMS Key ID:  "1234abcd-12ab-34cd-56ef-1234567890ab"  Amazon Resource Name (ARN) of a KMS key:  "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"  Some instances use local storage, which use a hardware module to encrypt storage volumes. If you choose one of these instance types, you cannot request a VolumeKmsKeyId. For a list of instance types that use local storage, see instance store volumes. For more information about Amazon Web Services Key Management Service, see KMS encryption for more information.
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The volume size in GB for the storage volume to be used in processing hyperparameter optimization jobs (optional). These volumes store model artifacts, incremental states and optionally, scratch space for training algorithms. Do not provide a value for this parameter if a value for InstanceConfigs is also specified. Some instance types have a fixed total local storage size. If you select one of these instances for training, VolumeSizeInGB cannot be greater than this total size. For a list of instance types with local instance storage and their sizes, see instance store volumes.  SageMaker supports only the General Purpose SSD (gp2) storage volume type. 
    */
  var VolumeSizeInGB: js.UndefOr[OptionalVolumeSizeInGB] = js.undefined
}
object HyperParameterTuningResourceConfig {
  
  inline def apply(): HyperParameterTuningResourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterTuningResourceConfig]
  }
  
  extension [Self <: HyperParameterTuningResourceConfig](x: Self) {
    
    inline def setAllocationStrategy(value: HyperParameterTuningAllocationStrategy): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAllocationStrategyUndefined: Self = StObject.set(x, "AllocationStrategy", js.undefined)
    
    inline def setInstanceConfigs(value: HyperParameterTuningInstanceConfigs): Self = StObject.set(x, "InstanceConfigs", value.asInstanceOf[js.Any])
    
    inline def setInstanceConfigsUndefined: Self = StObject.set(x, "InstanceConfigs", js.undefined)
    
    inline def setInstanceConfigsVarargs(value: HyperParameterTuningInstanceConfig*): Self = StObject.set(x, "InstanceConfigs", js.Array(value*))
    
    inline def setInstanceCount(value: TrainingInstanceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setInstanceType(value: TrainingInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
    
    inline def setVolumeSizeInGB(value: OptionalVolumeSizeInGB): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInGBUndefined: Self = StObject.set(x, "VolumeSizeInGB", js.undefined)
  }
}
