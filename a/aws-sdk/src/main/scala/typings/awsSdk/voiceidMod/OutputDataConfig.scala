package typings.awsSdk.voiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputDataConfig extends StObject {
  
  /**
    * The identifier of the KMS key you want Voice ID to use to encrypt the output file of a speaker enrollment job/fraudster registration job. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.voiceidMod.KmsKeyId] = js.undefined
  
  /**
    * The S3 path of the folder where Voice ID writes the job output file. It has a *.out extension. For example, if the input file name is input-file.json and the output folder path is s3://output-bucket/output-folder, the full output file path is s3://output-bucket/output-folder/job-Id/input-file.json.out.
    */
  var S3Uri: typings.awsSdk.voiceidMod.S3Uri
}
object OutputDataConfig {
  
  inline def apply(S3Uri: S3Uri): OutputDataConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDataConfig]
  }
  
  extension [Self <: OutputDataConfig](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
