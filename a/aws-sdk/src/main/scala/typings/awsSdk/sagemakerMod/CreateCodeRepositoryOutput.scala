package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCodeRepositoryOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new repository.
    */
  var CodeRepositoryArn: typings.awsSdk.sagemakerMod.CodeRepositoryArn = js.native
}

object CreateCodeRepositoryOutput {
  @scala.inline
  def apply(CodeRepositoryArn: CodeRepositoryArn): CreateCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCodeRepositoryOutput]
  }
}

