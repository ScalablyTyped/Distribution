package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PiiOutputDataConfig extends StObject {
  
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results from an analysis job.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.comprehendMod.KmsKeyId] = js.native
  
  /**
    * When you use the PiiOutputDataConfig object with asynchronous operations, you specify the Amazon S3 location where you want to write the output data. 
    */
  var S3Uri: typings.awsSdk.comprehendMod.S3Uri = js.native
}
object PiiOutputDataConfig {
  
  @scala.inline
  def apply(S3Uri: S3Uri): PiiOutputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiiOutputDataConfig]
  }
  
  @scala.inline
  implicit class PiiOutputDataConfigMutableBuilder[Self <: PiiOutputDataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
