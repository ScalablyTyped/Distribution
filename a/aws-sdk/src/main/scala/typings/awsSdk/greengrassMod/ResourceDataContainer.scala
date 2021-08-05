package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataContainer extends StObject {
  
  /**
    * Attributes that define the local device resource.
    */
  var LocalDeviceResourceData: js.UndefOr[typings.awsSdk.greengrassMod.LocalDeviceResourceData] = js.undefined
  
  /**
    * Attributes that define the local volume resource.
    */
  var LocalVolumeResourceData: js.UndefOr[typings.awsSdk.greengrassMod.LocalVolumeResourceData] = js.undefined
  
  /**
    * Attributes that define an Amazon S3 machine learning resource.
    */
  var S3MachineLearningModelResourceData: js.UndefOr[typings.awsSdk.greengrassMod.S3MachineLearningModelResourceData] = js.undefined
  
  /**
    * Attributes that define an Amazon SageMaker machine learning resource.
    */
  var SageMakerMachineLearningModelResourceData: js.UndefOr[typings.awsSdk.greengrassMod.SageMakerMachineLearningModelResourceData] = js.undefined
  
  /**
    * Attributes that define a secret resource, which references a secret from AWS Secrets Manager.
    */
  var SecretsManagerSecretResourceData: js.UndefOr[typings.awsSdk.greengrassMod.SecretsManagerSecretResourceData] = js.undefined
}
object ResourceDataContainer {
  
  inline def apply(): ResourceDataContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataContainer]
  }
  
  extension [Self <: ResourceDataContainer](x: Self) {
    
    inline def setLocalDeviceResourceData(value: LocalDeviceResourceData): Self = StObject.set(x, "LocalDeviceResourceData", value.asInstanceOf[js.Any])
    
    inline def setLocalDeviceResourceDataUndefined: Self = StObject.set(x, "LocalDeviceResourceData", js.undefined)
    
    inline def setLocalVolumeResourceData(value: LocalVolumeResourceData): Self = StObject.set(x, "LocalVolumeResourceData", value.asInstanceOf[js.Any])
    
    inline def setLocalVolumeResourceDataUndefined: Self = StObject.set(x, "LocalVolumeResourceData", js.undefined)
    
    inline def setS3MachineLearningModelResourceData(value: S3MachineLearningModelResourceData): Self = StObject.set(x, "S3MachineLearningModelResourceData", value.asInstanceOf[js.Any])
    
    inline def setS3MachineLearningModelResourceDataUndefined: Self = StObject.set(x, "S3MachineLearningModelResourceData", js.undefined)
    
    inline def setSageMakerMachineLearningModelResourceData(value: SageMakerMachineLearningModelResourceData): Self = StObject.set(x, "SageMakerMachineLearningModelResourceData", value.asInstanceOf[js.Any])
    
    inline def setSageMakerMachineLearningModelResourceDataUndefined: Self = StObject.set(x, "SageMakerMachineLearningModelResourceData", js.undefined)
    
    inline def setSecretsManagerSecretResourceData(value: SecretsManagerSecretResourceData): Self = StObject.set(x, "SecretsManagerSecretResourceData", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerSecretResourceDataUndefined: Self = StObject.set(x, "SecretsManagerSecretResourceData", js.undefined)
  }
}
