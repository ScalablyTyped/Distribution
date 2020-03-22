package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ddTrace.AnonQuery
import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [elasticsearch](https://github.com/elastic/elasticsearch-js) module.
  */
trait elasticsearch
  extends Integration
     with Analyzable {
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[AnonQuery] = js.undefined
}

object elasticsearch {
  @scala.inline
  def apply(
    analytics: Boolean | Double | (StringDictionary[Boolean | Double]) = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    hooks: AnonQuery = null,
    service: String = null
  ): elasticsearch = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[elasticsearch]
  }
}

