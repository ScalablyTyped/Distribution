package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectionsErrorEventArgs extends js.Object {
  /** The error message. */
  var message: java.lang.String
  /** The code which identifies the error that occurred. */
  var responseCode: RouteResponseCode
}

object IDirectionsErrorEventArgs {
  @scala.inline
  def apply(message: java.lang.String, responseCode: RouteResponseCode): IDirectionsErrorEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("responseCode")(responseCode)
    __obj.asInstanceOf[IDirectionsErrorEventArgs]
  }
}

