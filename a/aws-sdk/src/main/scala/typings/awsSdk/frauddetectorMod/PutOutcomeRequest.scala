package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutOutcomeRequest extends js.Object {
  /**
    * The outcome description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The name of the outcome.
    */
  var name: identifier = js.native
}

object PutOutcomeRequest {
  @scala.inline
  def apply(name: identifier, description: description = null): PutOutcomeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOutcomeRequest]
  }
}

