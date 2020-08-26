package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTopicsDetectionJobsResponse extends js.Object {
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list containing the properties of each job that is returned.
    */
  var TopicsDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.TopicsDetectionJobPropertiesList] = js.native
}

object ListTopicsDetectionJobsResponse {
  @scala.inline
  def apply(): ListTopicsDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicsDetectionJobsResponse]
  }
  @scala.inline
  implicit class ListTopicsDetectionJobsResponseOps[Self <: ListTopicsDetectionJobsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTopicsDetectionJobPropertiesListVarargs(value: TopicsDetectionJobProperties*): Self = this.set("TopicsDetectionJobPropertiesList", js.Array(value :_*))
    @scala.inline
    def setTopicsDetectionJobPropertiesList(value: TopicsDetectionJobPropertiesList): Self = this.set("TopicsDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicsDetectionJobPropertiesList: Self = this.set("TopicsDetectionJobPropertiesList", js.undefined)
  }
  
}

