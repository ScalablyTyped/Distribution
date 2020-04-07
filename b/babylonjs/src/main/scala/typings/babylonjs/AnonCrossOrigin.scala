package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCrossOrigin extends js.Object {
  var crossOrigin: String | Null
}

object AnonCrossOrigin {
  @scala.inline
  def apply(crossOrigin: String = null): AnonCrossOrigin = {
    val __obj = js.Dynamic.literal()
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCrossOrigin]
  }
}

