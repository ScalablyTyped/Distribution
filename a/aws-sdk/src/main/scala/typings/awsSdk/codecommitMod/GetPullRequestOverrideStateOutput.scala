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
  def apply(): GetPullRequestOverrideStateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPullRequestOverrideStateOutput]
  }
  @scala.inline
  implicit class GetPullRequestOverrideStateOutputOps[Self <: GetPullRequestOverrideStateOutput] (val x: Self) extends AnyVal {
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
    def setOverridden(value: Overridden): Self = this.set("overridden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverridden: Self = this.set("overridden", js.undefined)
    @scala.inline
    def setOverrider(value: Arn): Self = this.set("overrider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrider: Self = this.set("overrider", js.undefined)
  }
  
}

