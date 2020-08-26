package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataRetrievalPolicyOutput extends js.Object {
  /**
    * Contains the returned data retrieval policy in JSON format.
    */
  var Policy: js.UndefOr[DataRetrievalPolicy] = js.native
}

object GetDataRetrievalPolicyOutput {
  @scala.inline
  def apply(): GetDataRetrievalPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataRetrievalPolicyOutput]
  }
  @scala.inline
  implicit class GetDataRetrievalPolicyOutputOps[Self <: GetDataRetrievalPolicyOutput] (val x: Self) extends AnyVal {
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
    def setPolicy(value: DataRetrievalPolicy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
  }
  
}

