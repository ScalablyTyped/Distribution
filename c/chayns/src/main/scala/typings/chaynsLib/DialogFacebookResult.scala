package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogFacebookResult extends js.Object {
  var buttonType: scala.Double
  var selection: js.Array[DialogFacebookResultSelection]
}

object DialogFacebookResult {
  @scala.inline
  def apply(buttonType: scala.Double, selection: js.Array[DialogFacebookResultSelection]): DialogFacebookResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType, selection = selection)
  
    __obj.asInstanceOf[DialogFacebookResult]
  }
}

