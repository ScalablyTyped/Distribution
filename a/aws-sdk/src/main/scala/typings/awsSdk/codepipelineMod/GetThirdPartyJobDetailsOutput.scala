package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetThirdPartyJobDetailsOutput extends js.Object {
  /**
    * The details of the job, including any protected values defined for the job.
    */
  var jobDetails: js.UndefOr[ThirdPartyJobDetails] = js.native
}

object GetThirdPartyJobDetailsOutput {
  @scala.inline
  def apply(): GetThirdPartyJobDetailsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetThirdPartyJobDetailsOutput]
  }
  @scala.inline
  implicit class GetThirdPartyJobDetailsOutputOps[Self <: GetThirdPartyJobDetailsOutput] (val x: Self) extends AnyVal {
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
    def setJobDetails(value: ThirdPartyJobDetails): Self = this.set("jobDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobDetails: Self = this.set("jobDetails", js.undefined)
  }
  
}

