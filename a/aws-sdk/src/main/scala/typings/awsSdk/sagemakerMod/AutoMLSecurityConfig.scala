package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLSecurityConfig extends StObject {
  
  /**
    * Whether to use traffic encryption between the container layers.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The key used to encrypt stored data.
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * VPC configuration.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.VpcConfig] = js.undefined
}
object AutoMLSecurityConfig {
  
  @scala.inline
  def apply(): AutoMLSecurityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLSecurityConfig]
  }
  
  @scala.inline
  implicit class AutoMLSecurityConfigMutableBuilder[Self <: AutoMLSecurityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableInterContainerTrafficEncryption(value: Boolean): Self = StObject.set(x, "EnableInterContainerTrafficEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableInterContainerTrafficEncryptionUndefined: Self = StObject.set(x, "EnableInterContainerTrafficEncryption", js.undefined)
    
    @scala.inline
    def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
