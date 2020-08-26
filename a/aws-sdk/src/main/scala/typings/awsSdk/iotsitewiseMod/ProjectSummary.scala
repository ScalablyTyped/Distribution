package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSummary extends js.Object {
  /**
    * The date the project was created, in Unix epoch time.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The project's description.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The ID of the project.
    */
  var id: ID = js.native
  /**
    * The date the project was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the project.
    */
  var name: Name = js.native
}

object ProjectSummary {
  @scala.inline
  def apply(id: ID, name: Name): ProjectSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSummary]
  }
  @scala.inline
  implicit class ProjectSummaryOps[Self <: ProjectSummary] (val x: Self) extends AnyVal {
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
    def setId(value: ID): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationDate(value: Timestamp): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLastUpdateDate(value: Timestamp): Self = this.set("lastUpdateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateDate: Self = this.set("lastUpdateDate", js.undefined)
  }
  
}

