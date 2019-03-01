package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogFacebookButton extends js.Object {
  var text: java.lang.String
  var value: scala.Double
}

object DialogFacebookButton {
  @scala.inline
  def apply(text: java.lang.String, value: scala.Double): DialogFacebookButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DialogFacebookButton]
  }
}

