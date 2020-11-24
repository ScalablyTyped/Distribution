package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDataConfig extends js.Object {
  
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
  implicit class InputDataConfigOps[Self <: InputDataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataAccessRoleArn(value: DataAccessRoleArn): Self = this.set("DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Uri(value: Uri): Self = this.set("S3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuningDataS3Uri(value: Uri): Self = this.set("TuningDataS3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTuningDataS3Uri: Self = this.set("TuningDataS3Uri", js.undefined)
  }
}
