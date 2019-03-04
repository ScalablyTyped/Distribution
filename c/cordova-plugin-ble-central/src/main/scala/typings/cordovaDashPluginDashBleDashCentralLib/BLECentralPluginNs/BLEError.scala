package typings
package cordovaDashPluginDashBleDashCentralLib.BLECentralPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BLEError extends js.Object {
  var errorMessage: java.lang.String
  var id: java.lang.String
  var name: java.lang.String
}

object BLEError {
  @scala.inline
  def apply(errorMessage: java.lang.String, id: java.lang.String, name: java.lang.String): BLEError = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage, id = id, name = name)
  
    __obj.asInstanceOf[BLEError]
  }
}

