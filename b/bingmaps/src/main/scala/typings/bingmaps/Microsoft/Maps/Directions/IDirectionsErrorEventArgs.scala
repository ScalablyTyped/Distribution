package typings.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectionsErrorEventArgs extends js.Object {
  /** The error message. */
  var message: String
  /** The code which identifies the error that occurred. */
  var responseCode: RouteResponseCode
}

object IDirectionsErrorEventArgs {
  @scala.inline
  def apply(message: String, responseCode: RouteResponseCode): IDirectionsErrorEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDirectionsErrorEventArgs]
  }
}

