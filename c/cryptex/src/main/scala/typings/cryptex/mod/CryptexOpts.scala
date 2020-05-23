package typings.cryptex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptexOpts extends js.Object {
  var cacheKey: js.UndefOr[Boolean] = js.undefined
  var cacheKeyTimeout: js.UndefOr[Double] = js.undefined
  var config: js.UndefOr[CryptexConfig] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  var file: js.UndefOr[String] = js.undefined
}

object CryptexOpts {
  @scala.inline
  def apply(
    cacheKey: js.UndefOr[Boolean] = js.undefined,
    cacheKeyTimeout: js.UndefOr[Double] = js.undefined,
    config: CryptexConfig = null,
    env: String = null,
    file: String = null
  ): CryptexOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheKey)) __obj.updateDynamic("cacheKey")(cacheKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheKeyTimeout)) __obj.updateDynamic("cacheKeyTimeout")(cacheKeyTimeout.get.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptexOpts]
  }
}

