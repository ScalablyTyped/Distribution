package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDefaultEncryptionConfigurationResponse extends StObject {
  
  /**
    * The status of the account configuration. This contains the ConfigurationState. If there's an error, it also contains the ErrorDetails.
    */
  var configurationStatus: ConfigurationStatus
  
  /**
    * The type of encryption used for the encryption configuration.
    */
  var encryptionType: EncryptionType
  
  /**
    * The key ARN of the customer managed key used for KMS encryption if you use KMS_BASED_ENCRYPTION.
    */
  var kmsKeyArn: js.UndefOr[ARN] = js.undefined
}
object DescribeDefaultEncryptionConfigurationResponse {
  
  inline def apply(configurationStatus: ConfigurationStatus, encryptionType: EncryptionType): DescribeDefaultEncryptionConfigurationResponse = {
    val __obj = js.Dynamic.literal(configurationStatus = configurationStatus.asInstanceOf[js.Any], encryptionType = encryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDefaultEncryptionConfigurationResponse]
  }
  
  extension [Self <: DescribeDefaultEncryptionConfigurationResponse](x: Self) {
    
    inline def setConfigurationStatus(value: ConfigurationStatus): Self = StObject.set(x, "configurationStatus", value.asInstanceOf[js.Any])
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArn(value: ARN): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
  }
}
