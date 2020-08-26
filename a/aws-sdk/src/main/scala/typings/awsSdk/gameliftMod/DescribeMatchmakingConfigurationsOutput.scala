package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMatchmakingConfigurationsOutput extends js.Object {
  /**
    * A collection of requested matchmaking configurations.
    */
  var Configurations: js.UndefOr[MatchmakingConfigurationList] = js.native
  /**
    * A token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeMatchmakingConfigurationsOutput {
  @scala.inline
  def apply(): DescribeMatchmakingConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMatchmakingConfigurationsOutput]
  }
  @scala.inline
  implicit class DescribeMatchmakingConfigurationsOutputOps[Self <: DescribeMatchmakingConfigurationsOutput] (val x: Self) extends AnyVal {
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
    def setConfigurationsVarargs(value: MatchmakingConfiguration*): Self = this.set("Configurations", js.Array(value :_*))
    @scala.inline
    def setConfigurations(value: MatchmakingConfigurationList): Self = this.set("Configurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurations: Self = this.set("Configurations", js.undefined)
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

