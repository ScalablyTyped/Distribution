package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCodeRepositoryOutput extends js.Object {
  /**
    * The ARN of the Git repository.
    */
  var CodeRepositoryArn: typings.awsSdk.sagemakerMod.CodeRepositoryArn = js.native
}

object UpdateCodeRepositoryOutput {
  @scala.inline
  def apply(CodeRepositoryArn: CodeRepositoryArn): UpdateCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCodeRepositoryOutput]
  }
  @scala.inline
  implicit class UpdateCodeRepositoryOutputOps[Self <: UpdateCodeRepositoryOutput] (val x: Self) extends AnyVal {
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
    def setCodeRepositoryArn(value: CodeRepositoryArn): Self = this.set("CodeRepositoryArn", value.asInstanceOf[js.Any])
  }
  
}

