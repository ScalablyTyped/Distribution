package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetProjectsOutput extends js.Object {
  /**
    * Information about the requested build projects.
    */
  var projects: js.UndefOr[Projects] = js.native
  /**
    * The names of build projects for which information could not be found.
    */
  var projectsNotFound: js.UndefOr[ProjectNames] = js.native
}

object BatchGetProjectsOutput {
  @scala.inline
  def apply(): BatchGetProjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetProjectsOutput]
  }
  @scala.inline
  implicit class BatchGetProjectsOutputOps[Self <: BatchGetProjectsOutput] (val x: Self) extends AnyVal {
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
    def setProjectsVarargs(value: Project*): Self = this.set("projects", js.Array(value :_*))
    @scala.inline
    def setProjects(value: Projects): Self = this.set("projects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjects: Self = this.set("projects", js.undefined)
    @scala.inline
    def setProjectsNotFoundVarargs(value: NonEmptyString*): Self = this.set("projectsNotFound", js.Array(value :_*))
    @scala.inline
    def setProjectsNotFound(value: ProjectNames): Self = this.set("projectsNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectsNotFound: Self = this.set("projectsNotFound", js.undefined)
  }
  
}

