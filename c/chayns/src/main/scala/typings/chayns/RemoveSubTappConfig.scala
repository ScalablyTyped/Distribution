package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.removeSubTapp()
trait RemoveSubTappConfig extends js.Object {
  var close: Boolean
  var remove: Boolean
  var tappID: Double
}

object RemoveSubTappConfig {
  @scala.inline
  def apply(close: Boolean, remove: Boolean, tappID: Double): RemoveSubTappConfig = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], tappID = tappID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveSubTappConfig]
  }
}

