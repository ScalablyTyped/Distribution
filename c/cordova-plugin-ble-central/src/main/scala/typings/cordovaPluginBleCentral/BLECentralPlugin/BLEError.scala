package typings.cordovaPluginBleCentral.BLECentralPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BLEError extends js.Object {
  var errorMessage: String
  var id: String
  var name: String
}

object BLEError {
  @scala.inline
  def apply(errorMessage: String, id: String, name: String): BLEError = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BLEError]
  }
}

