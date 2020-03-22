package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [fs](https://nodejs.org/api/fs.html) module.
  */
trait fs
  extends Integration
     with Analyzable

object fs {
  @scala.inline
  def apply(
    analytics: Boolean | Double | (StringDictionary[Boolean | Double]) = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    service: String = null
  ): fs = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[fs]
  }
}

