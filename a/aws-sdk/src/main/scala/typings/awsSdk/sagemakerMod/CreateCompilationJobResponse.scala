package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCompilationJobResponse extends js.Object {
  /**
    * If the action is successful, the service sends back an HTTP 200 response. Amazon SageMaker returns the following data in JSON format:    CompilationJobArn: The Amazon Resource Name (ARN) of the compiled job.  
    */
  var CompilationJobArn: typings.awsSdk.sagemakerMod.CompilationJobArn = js.native
}

object CreateCompilationJobResponse {
  @scala.inline
  def apply(CompilationJobArn: CompilationJobArn): CreateCompilationJobResponse = {
    val __obj = js.Dynamic.literal(CompilationJobArn = CompilationJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCompilationJobResponse]
  }
  @scala.inline
  implicit class CreateCompilationJobResponseOps[Self <: CreateCompilationJobResponse] (val x: Self) extends AnyVal {
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
    def setCompilationJobArn(value: CompilationJobArn): Self = this.set("CompilationJobArn", value.asInstanceOf[js.Any])
  }
  
}

