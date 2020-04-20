package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCompilationJobRequest extends js.Object {
  /**
    * The name of the model compilation job that you want information about.
    */
  var CompilationJobName: EntityName = js.native
}

object DescribeCompilationJobRequest {
  @scala.inline
  def apply(CompilationJobName: EntityName): DescribeCompilationJobRequest = {
    val __obj = js.Dynamic.literal(CompilationJobName = CompilationJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCompilationJobRequest]
  }
}

