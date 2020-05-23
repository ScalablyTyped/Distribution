package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  /**
    * Caches pages result instead of executing them each time.
    * Disabling cache could impact performance.
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * The port at which your application will be run
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * The folder where your application files like .html; .js and .css are going to be.
    * The value is passed to express.static() middleware.
    */
  var static: js.UndefOr[String] = js.undefined
  /**
    * Provide an express middleware function or an array of middleware functions.
    * Use: [compression(); bodyParser()]
    */
  var use: js.UndefOr[js.Any] = js.undefined
}

object Server {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    static: String = null,
    use: js.Any = null
  ): Server = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
}

