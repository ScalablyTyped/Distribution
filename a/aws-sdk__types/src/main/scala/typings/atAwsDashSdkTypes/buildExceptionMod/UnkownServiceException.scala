package typings.atAwsDashSdkTypes.buildExceptionMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.Error
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
    message: String,
    name: Error,
    details: js.UndefOr[scala.Nothing] = js.undefined,
    stack: String = null
  ): UnkownServiceException = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (!js.isUndefined(details)) __obj.updateDynamic("details")(details)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UnkownServiceException]
  }
}

