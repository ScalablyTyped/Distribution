package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchInferenceJobOutput extends js.Object {
  
  /**
    * Information on the Amazon S3 bucket in which the batch inference job's output is stored.
    */
  var s3DataDestination: S3DataConfig = js.native
}
object BatchInferenceJobOutput {
  
  @scala.inline
  def apply(s3DataDestination: S3DataConfig): BatchInferenceJobOutput = {
    val __obj = js.Dynamic.literal(s3DataDestination = s3DataDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchInferenceJobOutput]
  }
  
  @scala.inline
  implicit class BatchInferenceJobOutputOps[Self <: BatchInferenceJobOutput] (val x: Self) extends AnyVal {
    
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
    def setS3DataDestination(value: S3DataConfig): Self = this.set("s3DataDestination", value.asInstanceOf[js.Any])
  }
}
