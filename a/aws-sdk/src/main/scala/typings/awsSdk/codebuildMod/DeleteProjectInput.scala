package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectInput extends js.Object {
  /**
    * The name of the build project.
    */
  var name: NonEmptyString = js.native
}

object DeleteProjectInput {
  @scala.inline
  def apply(name: NonEmptyString): DeleteProjectInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectInput]
  }
  @scala.inline
  implicit class DeleteProjectInputOps[Self <: DeleteProjectInput] (val x: Self) extends AnyVal {
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
    def setName(value: NonEmptyString): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

