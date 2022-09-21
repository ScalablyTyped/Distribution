package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceConfig extends StObject {
  
  /**
    * The number of ML compute instances to use. For distributed training, provide a value greater than 1. 
    */
  var InstanceCount: js.UndefOr[TrainingInstanceCount] = js.undefined
  
  /**
    * The configuration of a heterogeneous cluster in JSON format.
    */
  var InstanceGroups: js.UndefOr[typings.awsSdk.sagemakerMod.InstanceGroups] = js.undefined
  
  /**
    * The ML compute instance type. 
    */
  var InstanceType: js.UndefOr[TrainingInstanceType] = js.undefined
  
  /**
    * The Amazon Web Services KMS key that SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the training job.  Certain Nitro-based instances include local storage, dependent on the instance type. Local storage volumes are encrypted using a hardware module on the instance. You can't request a VolumeKmsKeyId when using an instance type with local storage. For a list of instance types that support local instance storage, see Instance Store Volumes. For more information about local instance storage encryption, see SSD Instance Store Volumes.  The VolumeKmsKeyId can be in any of the following formats:   // KMS Key ID  "1234abcd-12ab-34cd-56ef-1234567890ab"    // Amazon Resource Name (ARN) of a KMS Key  "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The size of the ML storage volume that you want to provision.  ML storage volumes store model artifacts and incremental states. Training algorithms might also use the ML storage volume for scratch space. If you want to store the training data in the ML storage volume, choose File as the TrainingInputMode in the algorithm specification.  When using an ML instance with NVMe SSD volumes, SageMaker doesn't provision Amazon EBS General Purpose SSD (gp2) storage. Available storage is fixed to the NVMe-type instance's storage capacity. SageMaker configures storage paths for training datasets, checkpoints, model artifacts, and outputs to use the entire capacity of the instance storage. For example, ML instance families with the NVMe-type instance storage include ml.p4d, ml.g4dn, and ml.g5.  When using an ML instance with the EBS-only storage option and without instance storage, you must define the size of EBS volume through VolumeSizeInGB in the ResourceConfig API. For example, ML instance families that use EBS volumes include ml.c5 and ml.p2.  To look up instance types and their instance storage types and volumes, see Amazon EC2 Instance Types. To find the default local paths defined by the SageMaker training platform, see Amazon SageMaker Training Storage Folders for Training Datasets, Checkpoints, Model Artifacts, and Outputs.
    */
  var VolumeSizeInGB: typings.awsSdk.sagemakerMod.VolumeSizeInGB
}
object ResourceConfig {
  
  inline def apply(VolumeSizeInGB: VolumeSizeInGB): ResourceConfig = {
    val __obj = js.Dynamic.literal(VolumeSizeInGB = VolumeSizeInGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceConfig]
  }
  
  extension [Self <: ResourceConfig](x: Self) {
    
    inline def setInstanceCount(value: TrainingInstanceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setInstanceGroups(value: InstanceGroups): Self = StObject.set(x, "InstanceGroups", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupsUndefined: Self = StObject.set(x, "InstanceGroups", js.undefined)
    
    inline def setInstanceGroupsVarargs(value: InstanceGroup*): Self = StObject.set(x, "InstanceGroups", js.Array(value*))
    
    inline def setInstanceType(value: TrainingInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
    
    inline def setVolumeSizeInGB(value: VolumeSizeInGB): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
  }
}
