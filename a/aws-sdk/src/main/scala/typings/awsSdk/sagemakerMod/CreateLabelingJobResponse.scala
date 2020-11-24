package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLabelingJobResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the labeling job. You use this ARN to identify the labeling job.
    */
  var LabelingJobArn: typings.awsSdk.sagemakerMod.LabelingJobArn = js.native
}
object CreateLabelingJobResponse {
  
  @scala.inline
  def apply(LabelingJobArn: LabelingJobArn): CreateLabelingJobResponse = {
    val __obj = js.Dynamic.literal(LabelingJobArn = LabelingJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLabelingJobResponse]
  }
  
  @scala.inline
  implicit class CreateLabelingJobResponseOps[Self <: CreateLabelingJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLabelingJobArn(value: LabelingJobArn): Self = this.set("LabelingJobArn", value.asInstanceOf[js.Any])
  }
}
