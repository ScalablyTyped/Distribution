package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingOutputConfig extends StObject {
  
  /**
    * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt the processing job output. KmsKeyId can be an ID of a KMS key, ARN of a KMS key, alias of a KMS key, or alias of a KMS key. The KmsKeyId is applied to all outputs.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * An array of outputs configuring the data to upload from the processing container.
    */
  var Outputs: ProcessingOutputs
}
object ProcessingOutputConfig {
  
  inline def apply(Outputs: ProcessingOutputs): ProcessingOutputConfig = {
    val __obj = js.Dynamic.literal(Outputs = Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingOutputConfig]
  }
  
  extension [Self <: ProcessingOutputConfig](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setOutputs(value: ProcessingOutputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: ProcessingOutput*): Self = StObject.set(x, "Outputs", js.Array(value*))
  }
}
