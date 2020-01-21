package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListScriptsOutput extends js.Object {
  /**
    * A token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    * A set of properties describing the requested script.
    */
  var Scripts: js.UndefOr[ScriptList] = js.native
}

object ListScriptsOutput {
  @scala.inline
  def apply(NextToken: NonEmptyString = null, Scripts: ScriptList = null): ListScriptsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Scripts != null) __obj.updateDynamic("Scripts")(Scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListScriptsOutput]
  }
}

