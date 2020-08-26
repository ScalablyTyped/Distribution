package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThirdPartyJobDetails extends js.Object {
  /**
    * The data to be returned by the third party job worker.
    */
  var data: js.UndefOr[ThirdPartyJobData] = js.native
  /**
    * The identifier used to identify the job details in AWS CodePipeline.
    */
  var id: js.UndefOr[ThirdPartyJobId] = js.native
  /**
    * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Use this number in an AcknowledgeThirdPartyJob request.
    */
  var nonce: js.UndefOr[Nonce] = js.native
}

object ThirdPartyJobDetails {
  @scala.inline
  def apply(): ThirdPartyJobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyJobDetails]
  }
  @scala.inline
  implicit class ThirdPartyJobDetailsOps[Self <: ThirdPartyJobDetails] (val x: Self) extends AnyVal {
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
    def setData(value: ThirdPartyJobData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setId(value: ThirdPartyJobId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setNonce(value: Nonce): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
  }
  
}

