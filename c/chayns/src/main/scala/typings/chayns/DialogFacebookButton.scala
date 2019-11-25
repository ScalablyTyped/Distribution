package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogFacebookButton extends js.Object {
  var text: String
  var value: Double
}

object DialogFacebookButton {
  @scala.inline
  def apply(text: String, value: Double): DialogFacebookButton = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DialogFacebookButton]
  }
}

