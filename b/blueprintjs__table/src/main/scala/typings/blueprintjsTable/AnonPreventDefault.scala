package typings.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreventDefault extends js.Object {
  var preventDefault: Boolean
  var stopPropagation: Boolean
}

object AnonPreventDefault {
  @scala.inline
  def apply(preventDefault: Boolean, stopPropagation: Boolean): AnonPreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPreventDefault]
  }
}

