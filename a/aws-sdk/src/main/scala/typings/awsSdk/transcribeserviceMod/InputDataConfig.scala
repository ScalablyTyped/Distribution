package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDataConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the permissions you've given Amazon Transcribe to access your Amazon S3 buckets containing your media files or text data.
    */
  var DataAccessRoleArn: typings.awsSdk.transcribeserviceMod.DataAccessRoleArn = js.native
  
  /**
    * The Amazon S3 prefix you specify to access the plain text files that you use to train your custom language model.
    */
  var S3Uri: Uri = js.native
  
  /**
    * The Amazon S3 prefix you specify to access the plain text files that you use to tune your custom language model.
    */
  var TuningDataS3Uri: js.UndefOr[Uri] = js.native
}
object InputDataConfig {
  
  @scala.inline
  def apply(DataAccessRoleArn: DataAccessRoleArn, S3Uri: Uri): InputDataConfig = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
  
  @scala.inline
  implicit class InputDataConfigMutableBuilder[Self <: InputDataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataAccessRoleArn(value: DataAccessRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Uri(value: Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuningDataS3Uri(value: Uri): Self = StObject.set(x, "TuningDataS3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuningDataS3UriUndefined: Self = StObject.set(x, "TuningDataS3Uri", js.undefined)
  }
}
