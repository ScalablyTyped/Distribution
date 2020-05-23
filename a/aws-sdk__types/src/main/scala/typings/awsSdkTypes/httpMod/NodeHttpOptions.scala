package typings.awsSdkTypes.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeHttpOptions extends HttpOptions {
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  var socketTimeout: js.UndefOr[Double] = js.undefined
}

object NodeHttpOptions {
  @scala.inline
  def apply(
    connectionTimeout: js.UndefOr[Double] = js.undefined,
    socketTimeout: js.UndefOr[Double] = js.undefined
  ): NodeHttpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connectionTimeout)) __obj.updateDynamic("connectionTimeout")(connectionTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(socketTimeout)) __obj.updateDynamic("socketTimeout")(socketTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeHttpOptions]
  }
}

