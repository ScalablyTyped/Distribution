package typings.atAwsDashSdkUtilDashErrorDashConstructor.atAwsDashSdkUtilDashErrorDashConstructorMod

import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceExceptionOption extends js.Object {
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /** a human readable description of this exception */
  var message: js.UndefOr[String] = js.undefined
  /** name of exception */
  var name: js.UndefOr[String] = js.undefined
  /** the name of the operation that throws the exception */
  var operationName: js.UndefOr[String] = js.undefined
  /** parsed exception object normalized according to its API model */
  var rawException: js.UndefOr[js.Any] = js.undefined
}

object ServiceExceptionOption {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    message: String = null,
    name: String = null,
    operationName: String = null,
    rawException: js.Any = null
  ): ServiceExceptionOption = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (rawException != null) __obj.updateDynamic("rawException")(rawException.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceExceptionOption]
  }
}

