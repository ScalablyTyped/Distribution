package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInputsResponse extends js.Object {
  var Inputs: js.UndefOr[listOfInput] = js.native
  var NextToken: js.UndefOr[string] = js.native
}

object ListInputsResponse {
  @scala.inline
  def apply(Inputs: listOfInput = null, NextToken: string = null): ListInputsResponse = {
    val __obj = js.Dynamic.literal()
    if (Inputs != null) __obj.updateDynamic("Inputs")(Inputs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInputsResponse]
  }
}

