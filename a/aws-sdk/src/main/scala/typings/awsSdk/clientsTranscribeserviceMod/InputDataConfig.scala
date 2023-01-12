package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDataConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains your input files. If the role you specify doesn’t have the appropriate permissions to access the specified Amazon S3 location, your request fails. IAM role ARNs have the format arn:partition:iam::account:role/role-name-with-path. For example: arn:aws:iam::111122223333:role/Admin. For more information, see IAM ARNs.
    */
  var DataAccessRoleArn: typings.awsSdk.clientsTranscribeserviceMod.DataAccessRoleArn
  
  /**
    * The Amazon S3 location (URI) of the text files you want to use to train your custom language model. Here's an example URI path: s3://DOC-EXAMPLE-BUCKET/my-model-training-data/ 
    */
  var S3Uri: Uri
  
  /**
    * The Amazon S3 location (URI) of the text files you want to use to tune your custom language model. Here's an example URI path: s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/ 
    */
  var TuningDataS3Uri: js.UndefOr[Uri] = js.undefined
}
object InputDataConfig {
  
  inline def apply(DataAccessRoleArn: DataAccessRoleArn, S3Uri: Uri): InputDataConfig = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputDataConfig] (val x: Self) extends AnyVal {
    
    inline def setDataAccessRoleArn(value: DataAccessRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setS3Uri(value: Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    inline def setTuningDataS3Uri(value: Uri): Self = StObject.set(x, "TuningDataS3Uri", value.asInstanceOf[js.Any])
    
    inline def setTuningDataS3UriUndefined: Self = StObject.set(x, "TuningDataS3Uri", js.undefined)
  }
}
