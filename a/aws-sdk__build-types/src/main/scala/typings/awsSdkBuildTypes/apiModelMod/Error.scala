package typings.awsSdkBuildTypes.apiModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var httpStatusCode: js.UndefOr[scala.Double] = js.undefined
  var senderFault: js.UndefOr[scala.Boolean] = js.undefined
}

object Error {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    httpStatusCode: js.UndefOr[scala.Double] = js.undefined,
    senderFault: js.UndefOr[scala.Boolean] = js.undefined
  ): Error = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(httpStatusCode)) __obj.updateDynamic("httpStatusCode")(httpStatusCode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(senderFault)) __obj.updateDynamic("senderFault")(senderFault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

