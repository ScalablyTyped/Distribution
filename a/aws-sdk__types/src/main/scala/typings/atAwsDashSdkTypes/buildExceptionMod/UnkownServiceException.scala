package typings.atAwsDashSdkTypes.buildExceptionMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.Error
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnkownServiceException
  extends ServiceException[js.UndefOr[scala.Nothing]] {
  @JSName("name")
  var name_UnkownServiceException: Error
}

object UnkownServiceException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    message: String,
    name: Error,
    details: js.UndefOr[scala.Nothing] = js.undefined,
    stack: String = null
  ): UnkownServiceException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(details)) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnkownServiceException]
  }
}

