package typings
package chromeLib.chromeNs.gcmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GcmError extends js.Object {
  /** Additional details related to the error, when available. */
  var detail: js.Object
  /** The error message describing the problem. */
  var errorMessage: java.lang.String
  /** Optional. The ID of the message with this error, if error is related to a specific message. */
  var messageId: js.UndefOr[java.lang.String] = js.undefined
}

