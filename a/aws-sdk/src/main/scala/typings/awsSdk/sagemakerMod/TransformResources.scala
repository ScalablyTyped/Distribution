package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformResources extends StObject {
  
  /**
    * The number of ML compute instances to use in the transform job. For distributed transform jobs, specify a value greater than 1. The default value is 1.
    */
  var InstanceCount: TransformInstanceCount
  
  /**
    * The ML compute instance type for the transform job. If you are using built-in algorithms to transform moderately sized datasets, we recommend using ml.m4.xlarge or ml.m5.large instance types.
    */
  var InstanceType: TransformInstanceType
  
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt model data on the storage volume attached to the ML compute instance(s) that run the batch transform job. The VolumeKmsKeyId can be any of the following formats:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias name ARN: arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
}
object TransformResources {
  
  @scala.inline
  def apply(InstanceCount: TransformInstanceCount, InstanceType: TransformInstanceType): TransformResources = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformResources]
  }
  
  @scala.inline
  implicit class TransformResourcesMutableBuilder[Self <: TransformResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceCount(value: TransformInstanceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: TransformInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
  }
}
