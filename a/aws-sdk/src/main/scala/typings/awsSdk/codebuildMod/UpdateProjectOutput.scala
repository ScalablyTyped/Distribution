package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectOutput extends js.Object {
  /**
    * Information about the build project that was changed.
    */
  var project: js.UndefOr[Project] = js.native
}

object UpdateProjectOutput {
  @scala.inline
  def apply(): UpdateProjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProjectOutput]
  }
  @scala.inline
  implicit class UpdateProjectOutputOps[Self <: UpdateProjectOutput] (val x: Self) extends AnyVal {
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
    def setProject(value: Project): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
  }
  
}

