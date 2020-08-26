package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCodeRepositoryInput extends js.Object {
  /**
    * The name of the Git repository to delete.
    */
  var CodeRepositoryName: EntityName = js.native
}

object DeleteCodeRepositoryInput {
  @scala.inline
  def apply(CodeRepositoryName: EntityName): DeleteCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCodeRepositoryInput]
  }
  @scala.inline
  implicit class DeleteCodeRepositoryInputOps[Self <: DeleteCodeRepositoryInput] (val x: Self) extends AnyVal {
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
    def setCodeRepositoryName(value: EntityName): Self = this.set("CodeRepositoryName", value.asInstanceOf[js.Any])
  }
  
}

