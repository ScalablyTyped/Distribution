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
}

