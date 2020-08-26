package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateJobOutput extends js.Object {
  /**
    * The ID of the job.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * The path to the location of where the select results are stored.
    */
  var jobOutputPath: js.UndefOr[String] = js.native
  /**
    * The relative URI path of the job.
    */
  var location: js.UndefOr[String] = js.native
}

object InitiateJobOutput {
  @scala.inline
  def apply(): InitiateJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateJobOutput]
  }
  @scala.inline
  implicit class InitiateJobOutputOps[Self <: InitiateJobOutput] (val x: Self) extends AnyVal {
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
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    @scala.inline
    def setJobOutputPath(value: String): Self = this.set("jobOutputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobOutputPath: Self = this.set("jobOutputPath", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

