package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button extends js.Object {
  /**
    * Text that is visible to the user on the button.
    */
  var text: ButtonTextStringWithLength = js.native
  /**
    * The value sent to Amazon Lex when a user chooses the button. For example, consider button text "NYC." When the user chooses the button, the value sent can be "New York City."
    */
  var value: ButtonValueStringWithLength = js.native
}

object Button {
  @scala.inline
  def apply(text: ButtonTextStringWithLength, value: ButtonValueStringWithLength): Button = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

