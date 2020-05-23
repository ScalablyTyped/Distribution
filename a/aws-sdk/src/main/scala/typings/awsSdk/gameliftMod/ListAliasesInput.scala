package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAliasesInput extends js.Object {
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * A descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    * The routing type to filter results on. Use this parameter to retrieve only aliases with a certain routing type. To retrieve all aliases, leave this parameter empty. Possible routing types include the following:    SIMPLE -- The alias resolves to one specific fleet. Use this type when routing to active fleets.    TERMINAL -- The alias does not resolve to a fleet but instead can be used to display a message to the user. A terminal alias throws a TerminalRoutingStrategyException with the RoutingStrategy message embedded.  
    */
  var RoutingStrategyType: js.UndefOr[typings.awsSdk.gameliftMod.RoutingStrategyType] = js.native
}

object ListAliasesInput {
  @scala.inline
  def apply(
    Limit: js.UndefOr[PositiveInteger] = js.undefined,
    Name: NonEmptyString = null,
    NextToken: NonEmptyString = null,
    RoutingStrategyType: RoutingStrategyType = null
  ): ListAliasesInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RoutingStrategyType != null) __obj.updateDynamic("RoutingStrategyType")(RoutingStrategyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAliasesInput]
  }
}

