package typings.ddDashTrace.ddDashTraceMod.plugins

import typings.ddDashTrace.ddDashTraceMod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [ioredis](https://github.com/luin/ioredis) module.
  */
trait ioredis
  extends Integration
     with Analyzable

object ioredis {
  @scala.inline
  def apply(
    analytics: Boolean | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    service: String = null
  ): ioredis = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[ioredis]
  }
}

