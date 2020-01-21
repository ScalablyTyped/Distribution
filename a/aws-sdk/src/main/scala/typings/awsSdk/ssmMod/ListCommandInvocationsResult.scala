package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCommandInvocationsResult extends js.Object {
  /**
    * (Optional) A list of all invocations. 
    */
  var CommandInvocations: js.UndefOr[CommandInvocationList] = js.native
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object ListCommandInvocationsResult {
  @scala.inline
  def apply(CommandInvocations: CommandInvocationList = null, NextToken: NextToken = null): ListCommandInvocationsResult = {
    val __obj = js.Dynamic.literal()
    if (CommandInvocations != null) __obj.updateDynamic("CommandInvocations")(CommandInvocations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCommandInvocationsResult]
  }
}

