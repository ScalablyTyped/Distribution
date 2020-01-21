package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrialComponentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentArn] = js.native
}

object CreateTrialComponentResponse {
  @scala.inline
  def apply(TrialComponentArn: TrialComponentArn = null): CreateTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    if (TrialComponentArn != null) __obj.updateDynamic("TrialComponentArn")(TrialComponentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrialComponentResponse]
  }
}

