package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEncryption extends StObject {
  
  /**
    * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
    */
  var Algorithm: js.UndefOr[typings.awsSdk.mediaconnectMod.Algorithm] = js.native
  
  /**
    * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting content. This parameter is not valid for static key encryption.
    */
  var ConstantInitializationVector: js.UndefOr[string] = js.native
  
  /**
    * The value of one of the devices that you configured with your digital rights management (DRM) platform key provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var DeviceId: js.UndefOr[string] = js.native
  
  /**
    * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var KeyType: js.UndefOr[typings.awsSdk.mediaconnectMod.KeyType] = js.native
  
  /**
    * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var Region: js.UndefOr[string] = js.native
  
  /**
    * An identifier for the content. The service sends this value to the key server to identify the current endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var ResourceId: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
    */
  var RoleArn: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
    */
  var SecretArn: js.UndefOr[string] = js.native
  
  /**
    * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var Url: js.UndefOr[string] = js.native
}
object UpdateEncryption {
  
  @scala.inline
  def apply(): UpdateEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEncryption]
  }
  
  @scala.inline
  implicit class UpdateEncryptionMutableBuilder[Self <: UpdateEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: Algorithm): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "Algorithm", js.undefined)
    
    @scala.inline
    def setConstantInitializationVector(value: string): Self = StObject.set(x, "ConstantInitializationVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstantInitializationVectorUndefined: Self = StObject.set(x, "ConstantInitializationVector", js.undefined)
    
    @scala.inline
    def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    @scala.inline
    def setKeyType(value: KeyType): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTypeUndefined: Self = StObject.set(x, "KeyType", js.undefined)
    
    @scala.inline
    def setRegion(value: string): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setResourceId(value: string): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setSecretArn(value: string): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
    
    @scala.inline
    def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
