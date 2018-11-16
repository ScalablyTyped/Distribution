package typings
package connectDashTimeoutLib.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Request extends js.Object {
  /**
           * @summary Clears the timeout on the request.
           */
  def clearTimeout(): scala.Unit
  /**
           *
           * @return {boolean} true if timeout fired; false otherwise.
           */
  def timedout(event: java.lang.String, message: java.lang.String): scala.Boolean
}

