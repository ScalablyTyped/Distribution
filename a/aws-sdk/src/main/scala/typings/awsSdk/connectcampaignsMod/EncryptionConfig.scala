package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfig extends StObject {
  
  var enabled: Enabled
  
  var encryptionType: js.UndefOr[EncryptionType] = js.undefined
  
  var keyArn: js.UndefOr[EncryptionKey] = js.undefined
}
object EncryptionConfig {
  
  inline def apply(enabled: Enabled): EncryptionConfig = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  extension [Self <: EncryptionConfig](x: Self) {
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
    
    inline def setKeyArn(value: EncryptionKey): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
    
    inline def setKeyArnUndefined: Self = StObject.set(x, "keyArn", js.undefined)
  }
}
