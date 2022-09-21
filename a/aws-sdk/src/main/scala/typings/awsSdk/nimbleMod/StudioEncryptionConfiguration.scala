package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StudioEncryptionConfiguration extends StObject {
  
  /**
    * The ARN for a KMS key that is used to encrypt studio data.
    */
  var keyArn: js.UndefOr[StudioEncryptionConfigurationKeyArn] = js.undefined
  
  /**
    * The type of KMS key that is used to encrypt studio data.
    */
  var keyType: StudioEncryptionConfigurationKeyType
}
object StudioEncryptionConfiguration {
  
  inline def apply(keyType: StudioEncryptionConfigurationKeyType): StudioEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StudioEncryptionConfiguration]
  }
  
  extension [Self <: StudioEncryptionConfiguration](x: Self) {
    
    inline def setKeyArn(value: StudioEncryptionConfigurationKeyArn): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
    
    inline def setKeyArnUndefined: Self = StObject.set(x, "keyArn", js.undefined)
    
    inline def setKeyType(value: StudioEncryptionConfigurationKeyType): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
  }
}
