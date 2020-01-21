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
  def apply(Configurations: MatchmakingConfigurationList = null, NextToken: NonZeroAndMaxString = null): DescribeMatchmakingConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMatchmakingConfigurationsOutput]
  }
}

