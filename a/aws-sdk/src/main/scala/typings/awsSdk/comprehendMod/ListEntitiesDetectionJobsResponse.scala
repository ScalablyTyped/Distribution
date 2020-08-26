package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitiesDetectionJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job that is returned.
    */
  var EntitiesDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.EntitiesDetectionJobPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListEntitiesDetectionJobsResponse {
  @scala.inline
  def apply(): ListEntitiesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesDetectionJobsResponse]
  }
  @scala.inline
  implicit class ListEntitiesDetectionJobsResponseOps[Self <: ListEntitiesDetectionJobsResponse] (val x: Self) extends AnyVal {
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
    def setEntitiesDetectionJobPropertiesListVarargs(value: EntitiesDetectionJobProperties*): Self = this.set("EntitiesDetectionJobPropertiesList", js.Array(value :_*))
    @scala.inline
    def setEntitiesDetectionJobPropertiesList(value: EntitiesDetectionJobPropertiesList): Self = this.set("EntitiesDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitiesDetectionJobPropertiesList: Self = this.set("EntitiesDetectionJobPropertiesList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

