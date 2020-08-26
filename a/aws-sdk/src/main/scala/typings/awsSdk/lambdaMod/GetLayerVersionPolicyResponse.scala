package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLayerVersionPolicyResponse extends js.Object {
  /**
    * The policy document.
    */
  var Policy: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the current revision of the policy.
    */
  var RevisionId: js.UndefOr[String] = js.native
}

object GetLayerVersionPolicyResponse {
  @scala.inline
  def apply(): GetLayerVersionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLayerVersionPolicyResponse]
  }
  @scala.inline
  implicit class GetLayerVersionPolicyResponseOps[Self <: GetLayerVersionPolicyResponse] (val x: Self) extends AnyVal {
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
    def setPolicy(value: String): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
    @scala.inline
    def setRevisionId(value: String): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
  }
  
}

