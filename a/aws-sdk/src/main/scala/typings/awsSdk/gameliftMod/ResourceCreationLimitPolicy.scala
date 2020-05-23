package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceCreationLimitPolicy extends js.Object {
  /**
    * The maximum number of game sessions that an individual can create during the policy period. 
    */
  var NewGameSessionsPerCreator: js.UndefOr[WholeNumber] = js.native
  /**
    * The time span used in evaluating the resource creation limit policy. 
    */
  var PolicyPeriodInMinutes: js.UndefOr[WholeNumber] = js.native
}

object ResourceCreationLimitPolicy {
  @scala.inline
  def apply(
    NewGameSessionsPerCreator: js.UndefOr[WholeNumber] = js.undefined,
    PolicyPeriodInMinutes: js.UndefOr[WholeNumber] = js.undefined
  ): ResourceCreationLimitPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NewGameSessionsPerCreator)) __obj.updateDynamic("NewGameSessionsPerCreator")(NewGameSessionsPerCreator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PolicyPeriodInMinutes)) __obj.updateDynamic("PolicyPeriodInMinutes")(PolicyPeriodInMinutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceCreationLimitPolicy]
  }
}

