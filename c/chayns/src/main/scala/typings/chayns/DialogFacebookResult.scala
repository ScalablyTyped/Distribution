package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogFacebookResult extends js.Object {
  var buttonType: Double
  var selection: js.Array[DialogFacebookResultSelection]
}

object DialogFacebookResult {
  @scala.inline
  def apply(buttonType: Double, selection: js.Array[DialogFacebookResultSelection]): DialogFacebookResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType, selection = selection)
  
    __obj.asInstanceOf[DialogFacebookResult]
  }
}

