package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadPipelineResponse extends js.Object {
  
  /**
    * A section of the response body that provides information about the pipeline.
    */
  var Pipeline: js.UndefOr[typings.awsSdk.elastictranscoderMod.Pipeline] = js.native
  
  /**
    * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the pipeline. Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS key, reduces processing time and prevents cross-regional charges.
    */
  var Warnings: js.UndefOr[typings.awsSdk.elastictranscoderMod.Warnings] = js.native
}
object ReadPipelineResponse {
  
  @scala.inline
  def apply(): ReadPipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPipelineResponse]
  }
  
  @scala.inline
  implicit class ReadPipelineResponseOps[Self <: ReadPipelineResponse] (val x: Self) extends AnyVal {
    
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
    def setPipeline(value: Pipeline): Self = this.set("Pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipeline: Self = this.set("Pipeline", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: Warning*): Self = this.set("Warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: Warnings): Self = this.set("Warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("Warnings", js.undefined)
  }
}
