package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPullRequestOverrideStateOutput extends js.Object {
  /**
    * A Boolean value that indicates whether a pull request has had its rules set aside (TRUE) or whether all approval rules still apply (FALSE).
    */
  var overridden: js.UndefOr[Overridden] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user or identity that overrode the rules and their requirements for the pull request.
    */
  var overrider: js.UndefOr[Arn] = js.native
}

object GetPullRequestOverrideStateOutput {
  @scala.inline
  def apply(overridden: js.UndefOr[Overridden] = js.undefined, overrider: Arn = null): GetPullRequestOverrideStateOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overridden)) __obj.updateDynamic("overridden")(overridden.get.asInstanceOf[js.Any])
    if (overrider != null) __obj.updateDynamic("overrider")(overrider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPullRequestOverrideStateOutput]
  }
}

