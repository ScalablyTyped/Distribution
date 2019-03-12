package typings
package connectDashTimeoutLib.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * @summary true if timeout fired; false otherwise.
    */
  var timedout: scala.Boolean
  /**
    * @summary Clears the timeout on the request.
    */
  def clearTimeout(): scala.Unit
}

object Request {
  @scala.inline
  def apply(clearTimeout: () => scala.Unit, timedout: scala.Boolean): Request = {
    val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction0(clearTimeout), timedout = timedout)
  
    __obj.asInstanceOf[Request]
  }
}

