package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.setNetworkChangeCallback()
trait NetworkChangeResult extends js.Object {
  var isConnected: Boolean
  var `type`: Double
}

object NetworkChangeResult {
  @scala.inline
  def apply(isConnected: Boolean, `type`: Double): NetworkChangeResult = {
    val __obj = js.Dynamic.literal(isConnected = isConnected)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NetworkChangeResult]
  }
}

