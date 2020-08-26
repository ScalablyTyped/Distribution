package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTargetsForPolicyResponse extends js.Object {
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  /**
    * The policy targets.
    */
  var targets: js.UndefOr[PolicyTargets] = js.native
}

object ListTargetsForPolicyResponse {
  @scala.inline
  def apply(): ListTargetsForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsForPolicyResponse]
  }
  @scala.inline
  implicit class ListTargetsForPolicyResponseOps[Self <: ListTargetsForPolicyResponse] (val x: Self) extends AnyVal {
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
    def setNextMarker(value: Marker): Self = this.set("nextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("nextMarker", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: PolicyTarget*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: PolicyTargets): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
  }
  
}

