package typings.atAwsDashSdkTypes.buildHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeHttpOptions extends HttpOptions {
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  var socketTimeout: js.UndefOr[Double] = js.undefined
}

object NodeHttpOptions {
  @scala.inline
  def apply(connectionTimeout: Int | Double = null, socketTimeout: Int | Double = null): NodeHttpOptions = {
    val __obj = js.Dynamic.literal()
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeHttpOptions]
  }
}

