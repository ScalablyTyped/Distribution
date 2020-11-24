package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDataContainer extends js.Object {
  
  /**
    * Attributes that define the local device resource.
    */
  var LocalDeviceResourceData: js.UndefOr[typings.awsSdk.greengrassMod.LocalDeviceResourceData] = js.native
  
  /**
    * Attributes that define the local volume resource.
    */
  var LocalVolumeResourceData: js.UndefOr[typings.awsSdk.greengrassMod.LocalVolumeResourceData] = js.native
  
  /**
    * Attributes that define an Amazon S3 machine learning resource.
    */
  var S3MachineLearningModelResourceData: js.UndefOr[typings.awsSdk.greengrassMod.S3MachineLearningModelResourceData] = js.native
  
  /**
    * Attributes that define an Amazon SageMaker machine learning resource.
    */
  var SageMakerMachineLearningModelResourceData: js.UndefOr[typings.awsSdk.greengrassMod.SageMakerMachineLearningModelResourceData] = js.native
  
  /**
    * Attributes that define a secret resource, which references a secret from AWS Secrets Manager.
    */
  var SecretsManagerSecretResourceData: js.UndefOr[typings.awsSdk.greengrassMod.SecretsManagerSecretResourceData] = js.native
}
object ResourceDataContainer {
  
  @scala.inline
  def apply(): ResourceDataContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataContainer]
  }
  
  @scala.inline
  implicit class ResourceDataContainerOps[Self <: ResourceDataContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocalDeviceResourceData(value: LocalDeviceResourceData): Self = this.set("LocalDeviceResourceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalDeviceResourceData: Self = this.set("LocalDeviceResourceData", js.undefined)
    
    @scala.inline
    def setLocalVolumeResourceData(value: LocalVolumeResourceData): Self = this.set("LocalVolumeResourceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalVolumeResourceData: Self = this.set("LocalVolumeResourceData", js.undefined)
    
    @scala.inline
    def setS3MachineLearningModelResourceData(value: S3MachineLearningModelResourceData): Self = this.set("S3MachineLearningModelResourceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3MachineLearningModelResourceData: Self = this.set("S3MachineLearningModelResourceData", js.undefined)
    
    @scala.inline
    def setSageMakerMachineLearningModelResourceData(value: SageMakerMachineLearningModelResourceData): Self = this.set("SageMakerMachineLearningModelResourceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSageMakerMachineLearningModelResourceData: Self = this.set("SageMakerMachineLearningModelResourceData", js.undefined)
    
    @scala.inline
    def setSecretsManagerSecretResourceData(value: SecretsManagerSecretResourceData): Self = this.set("SecretsManagerSecretResourceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretsManagerSecretResourceData: Self = this.set("SecretsManagerSecretResourceData", js.undefined)
  }
}
