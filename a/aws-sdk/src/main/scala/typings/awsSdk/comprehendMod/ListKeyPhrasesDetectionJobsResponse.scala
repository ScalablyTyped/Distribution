package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListKeyPhrasesDetectionJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job that is returned.
    */
  var KeyPhrasesDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.KeyPhrasesDetectionJobPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListKeyPhrasesDetectionJobsResponse {
  @scala.inline
  def apply(): ListKeyPhrasesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyPhrasesDetectionJobsResponse]
  }
  @scala.inline
  implicit class ListKeyPhrasesDetectionJobsResponseOps[Self <: ListKeyPhrasesDetectionJobsResponse] (val x: Self) extends AnyVal {
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
    def setKeyPhrasesDetectionJobPropertiesListVarargs(value: KeyPhrasesDetectionJobProperties*): Self = this.set("KeyPhrasesDetectionJobPropertiesList", js.Array(value :_*))
    @scala.inline
    def setKeyPhrasesDetectionJobPropertiesList(value: KeyPhrasesDetectionJobPropertiesList): Self = this.set("KeyPhrasesDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPhrasesDetectionJobPropertiesList: Self = this.set("KeyPhrasesDetectionJobPropertiesList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

