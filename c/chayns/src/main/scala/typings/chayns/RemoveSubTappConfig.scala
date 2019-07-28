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
    val __obj = js.Dynamic.literal(close = close, remove = remove, tappID = tappID)
  
    __obj.asInstanceOf[RemoveSubTappConfig]
  }
}

