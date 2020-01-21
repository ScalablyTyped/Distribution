package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateEnteredEventDetails extends js.Object {
  /**
    * The string that contains the JSON input data for the state.
    */
  var input: js.UndefOr[SensitiveData] = js.native
  /**
    * The name of the state.
    */
  var name: Name = js.native
}

object StateEnteredEventDetails {
  @scala.inline
  def apply(name: Name, input: SensitiveData = null): StateEnteredEventDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateEnteredEventDetails]
  }
}

