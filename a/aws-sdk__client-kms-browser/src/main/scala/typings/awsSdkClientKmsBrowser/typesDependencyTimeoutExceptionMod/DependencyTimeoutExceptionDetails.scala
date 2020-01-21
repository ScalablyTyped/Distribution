package typings.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyTimeoutExceptionDetails extends js.Object {
  /**
    * _ErrorMessageType shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object DependencyTimeoutExceptionDetails {
  @scala.inline
  def apply(message: String = null): DependencyTimeoutExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyTimeoutExceptionDetails]
  }
}

