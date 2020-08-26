package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectDetails extends js.Object {
  /**
    *  Website URL for this project in the AWS Mobile Hub console. 
    */
  var consoleUrl: js.UndefOr[ConsoleUrl] = js.native
  /**
    *  Date the project was created. 
    */
  var createdDate: js.UndefOr[Date] = js.native
  /**
    *  Date of the last modification of the project. 
    */
  var lastUpdatedDate: js.UndefOr[Date] = js.native
  var name: js.UndefOr[ProjectName] = js.native
  var projectId: js.UndefOr[ProjectId] = js.native
  var region: js.UndefOr[ProjectRegion] = js.native
  var resources: js.UndefOr[Resources] = js.native
  var state: js.UndefOr[ProjectState] = js.native
}

object ProjectDetails {
  @scala.inline
  def apply(): ProjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectDetails]
  }
  @scala.inline
  implicit class ProjectDetailsOps[Self <: ProjectDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConsoleUrl(value: ConsoleUrl): Self = this.set("consoleUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsoleUrl: Self = this.set("consoleUrl", js.undefined)
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    @scala.inline
    def setLastUpdatedDate(value: Date): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("lastUpdatedDate", js.undefined)
    @scala.inline
    def setName(value: ProjectName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProjectId(value: ProjectId): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setRegion(value: ProjectRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: Resources): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setState(value: ProjectState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

