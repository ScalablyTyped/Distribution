package typings.braintreeDashWeb.braintreeDashWebMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description Data about Hosted Fields fields, sent in {@link HostedFields~stateObject|stateObjects}.
  * @property {HTMLElement} container Reference to the container DOM element on your page associated with the current event.
  * @property {boolean} isFocused Whether or not the input is currently focused.
  * @property {boolean} isEmpty Whether or not the user has entered a value in the input.
  * @property {boolean} isPotentiallyValid
  * A determination based on the future validity of the input value.
  * This is helpful when a user is entering a card number and types <code>"41"</code>.
  * While that value is not valid for submission, it is still possible for
  * it to become a fully qualified entry. However, if the user enters <code>"4x"</code>
  * it is clear that the card number can never become valid and isPotentiallyValid will
  * return false.
  * @property {boolean} isValid Whether or not the value of the associated input is <i>fully</i> qualified for submission.
  */
trait HostedFieldsHostedFieldsFieldData extends js.Object {
  var container: HTMLElement
  var isEmpty: Boolean
  var isFocused: Boolean
  var isPotentiallyValid: Boolean
  var isValid: Boolean
}

object HostedFieldsHostedFieldsFieldData {
  @scala.inline
  def apply(
    container: HTMLElement,
    isEmpty: Boolean,
    isFocused: Boolean,
    isPotentiallyValid: Boolean,
    isValid: Boolean
  ): HostedFieldsHostedFieldsFieldData = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HostedFieldsHostedFieldsFieldData]
  }
}

