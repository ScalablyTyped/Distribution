package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessingOutputConfig extends StObject {
  
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the processing job output. KmsKeyId can be an ID of a KMS key, ARN of a KMS key, alias of a KMS key, or alias of a KMS key. The KmsKeyId is applied to all outputs.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.native
  
  /**
    * Output configuration information for a processing job.
    */
  var Outputs: ProcessingOutputs = js.native
}
object ProcessingOutputConfig {
  
  @scala.inline
  def apply(Outputs: ProcessingOutputs): ProcessingOutputConfig = {
    val __obj = js.Dynamic.literal(Outputs = Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingOutputConfig]
  }
  
  @scala.inline
  implicit class ProcessingOutputConfigMutableBuilder[Self <: ProcessingOutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setOutputs(value: ProcessingOutputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: ProcessingOutput*): Self = StObject.set(x, "Outputs", js.Array(value :_*))
  }
}
