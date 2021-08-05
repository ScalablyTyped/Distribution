package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionAtRest extends StObject {
  
  /**
    * 
    The ARN of the AWS KMS key for encrypting data at rest. If you don't specify a KMS key, MSK creates one for you and uses it.
    
    */
  var DataVolumeKMSKeyId: string
}
object EncryptionAtRest {
  
  inline def apply(DataVolumeKMSKeyId: string): EncryptionAtRest = {
    val __obj = js.Dynamic.literal(DataVolumeKMSKeyId = DataVolumeKMSKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAtRest]
  }
  
  extension [Self <: EncryptionAtRest](x: Self) {
    
    inline def setDataVolumeKMSKeyId(value: string): Self = StObject.set(x, "DataVolumeKMSKeyId", value.asInstanceOf[js.Any])
  }
}
