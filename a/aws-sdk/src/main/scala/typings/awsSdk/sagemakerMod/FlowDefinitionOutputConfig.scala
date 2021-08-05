package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowDefinitionOutputConfig extends StObject {
  
  /**
    * The Amazon Key Management Service (KMS) key ID for server-side encryption.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * The Amazon S3 path where the object containing human output will be made available.
    */
  var S3OutputPath: S3Uri
}
object FlowDefinitionOutputConfig {
  
  inline def apply(S3OutputPath: S3Uri): FlowDefinitionOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDefinitionOutputConfig]
  }
  
  extension [Self <: FlowDefinitionOutputConfig](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
  }
}
