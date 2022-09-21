package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSideEncryptionConfiguration extends StObject {
  
  /**
    * The KMS key. For information about valid ID values, see Key identifiers (KeyId).
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
}
object ServerSideEncryptionConfiguration {
  
  inline def apply(): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
  
  extension [Self <: ServerSideEncryptionConfiguration](x: Self) {
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
  }
}
