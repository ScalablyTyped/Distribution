package typings.babelTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfident extends js.Object {
  var confident: Boolean
  var value: js.Any
}

object AnonConfident {
  @scala.inline
  def apply(confident: Boolean, value: js.Any): AnonConfident = {
    val __obj = js.Dynamic.literal(confident = confident.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConfident]
  }
}

