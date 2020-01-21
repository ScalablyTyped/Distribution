package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrialResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialArn] = js.native
}

object UpdateTrialResponse {
  @scala.inline
  def apply(TrialArn: TrialArn = null): UpdateTrialResponse = {
    val __obj = js.Dynamic.literal()
    if (TrialArn != null) __obj.updateDynamic("TrialArn")(TrialArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrialResponse]
  }
}

