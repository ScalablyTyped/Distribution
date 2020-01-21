package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInputRequest extends js.Object {
  /**
    * The definition of the input.
    */
  var inputDefinition: InputDefinition = js.native
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.native
  /**
    * The name of the input you want to update.
    */
  var inputName: InputName = js.native
}

object UpdateInputRequest {
  @scala.inline
  def apply(inputDefinition: InputDefinition, inputName: InputName, inputDescription: InputDescription = null): UpdateInputRequest = {
    val __obj = js.Dynamic.literal(inputDefinition = inputDefinition.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any])
    if (inputDescription != null) __obj.updateDynamic("inputDescription")(inputDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputRequest]
  }
}

