package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HPOResourceConfig extends js.Object {
  /**
    * The maximum number of training jobs when you create a solution version. The maximum value for maxNumberOfTrainingJobs is 40.
    */
  var maxNumberOfTrainingJobs: js.UndefOr[HPOResource] = js.native
  /**
    * The maximum number of parallel training jobs when you create a solution version. The maximum value for maxParallelTrainingJobs is 10.
    */
  var maxParallelTrainingJobs: js.UndefOr[HPOResource] = js.native
}

object HPOResourceConfig {
  @scala.inline
  def apply(): HPOResourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPOResourceConfig]
  }
  @scala.inline
  implicit class HPOResourceConfigOps[Self <: HPOResourceConfig] (val x: Self) extends AnyVal {
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
    def setMaxNumberOfTrainingJobs(value: HPOResource): Self = this.set("maxNumberOfTrainingJobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNumberOfTrainingJobs: Self = this.set("maxNumberOfTrainingJobs", js.undefined)
    @scala.inline
    def setMaxParallelTrainingJobs(value: HPOResource): Self = this.set("maxParallelTrainingJobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxParallelTrainingJobs: Self = this.set("maxParallelTrainingJobs", js.undefined)
  }
  
}

