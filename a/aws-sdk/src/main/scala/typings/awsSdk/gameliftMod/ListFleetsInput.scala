package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFleetsInput extends js.Object {
  /**
    * A unique identifier for a build to return fleets for. Use this parameter to return only fleets using the specified build. Use either the build ID or ARN value.To retrieve all fleets, leave this parameter empty.
    */
  var BuildId: js.UndefOr[typings.awsSdk.gameliftMod.BuildId] = js.native
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a Realtime script to return fleets for. Use this parameter to return only fleets using the specified script. Use either the script ID or ARN value.To retrieve all fleets, leave this parameter empty.
    */
  var ScriptId: js.UndefOr[typings.awsSdk.gameliftMod.ScriptId] = js.native
}

object ListFleetsInput {
  @scala.inline
  def apply(
    BuildId: BuildId = null,
    Limit: Int | scala.Double = null,
    NextToken: NonZeroAndMaxString = null,
    ScriptId: ScriptId = null
  ): ListFleetsInput = {
    val __obj = js.Dynamic.literal()
    if (BuildId != null) __obj.updateDynamic("BuildId")(BuildId.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScriptId != null) __obj.updateDynamic("ScriptId")(ScriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFleetsInput]
  }
}

