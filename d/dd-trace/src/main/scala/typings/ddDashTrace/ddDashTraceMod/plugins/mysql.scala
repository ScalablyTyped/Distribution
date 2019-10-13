package typings.ddDashTrace.ddDashTraceMod.plugins

import typings.ddDashTrace.ddDashTraceMod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [mysql](https://github.com/mysqljs/mysql) module.
  */
trait mysql
  extends Integration
     with Analyzable

object mysql {
  @scala.inline
  def apply(
    analytics: Boolean | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    service: String = null
  ): mysql = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[mysql]
  }
}

