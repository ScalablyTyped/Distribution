package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSideEncryptionConfiguration extends StObject {
  
  /**
    * The identifier of the AWS KMS customer master key (CMK). Amazon Kendra doesn't support asymmetric CMKs.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.kendraMod.KmsKeyId] = js.undefined
}
object ServerSideEncryptionConfiguration {
  
  inline def apply(): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
  
  extension [Self <: ServerSideEncryptionConfiguration](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
