package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesKMSInvalidStateExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _KMSInvalidStateExceptionDetails extends js.Object {
  /**
    * <p>A message that provides information about the error.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _KMSInvalidStateExceptionDetails {
  @scala.inline
  def apply(message: String = null): _KMSInvalidStateExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_KMSInvalidStateExceptionDetails]
  }
}

