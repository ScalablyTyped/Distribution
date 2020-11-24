package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchInferenceJobInput extends js.Object {
  
  /**
    * The URI of the Amazon S3 location that contains your input data. The Amazon S3 bucket must be in the same region as the API endpoint you are calling.
    */
  var s3DataSource: S3DataConfig = js.native
}
object BatchInferenceJobInput {
  
  @scala.inline
  def apply(s3DataSource: S3DataConfig): BatchInferenceJobInput = {
    val __obj = js.Dynamic.literal(s3DataSource = s3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchInferenceJobInput]
  }
  
  @scala.inline
  implicit class BatchInferenceJobInputOps[Self <: BatchInferenceJobInput] (val x: Self) extends AnyVal {
    
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
    def setS3DataSource(value: S3DataConfig): Self = this.set("s3DataSource", value.asInstanceOf[js.Any])
  }
}
