package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrialComponentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentArn] = js.native
}

object UpdateTrialComponentResponse {
  @scala.inline
  def apply(): UpdateTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTrialComponentResponse]
  }
  @scala.inline
  implicit class UpdateTrialComponentResponseOps[Self <: UpdateTrialComponentResponse] (val x: Self) extends AnyVal {
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
    def setTrialComponentArn(value: TrialComponentArn): Self = this.set("TrialComponentArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialComponentArn: Self = this.set("TrialComponentArn", js.undefined)
  }
  
}

