package typings.backstopjs

import typings.backstopjs.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: js.UndefOr[Config | String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
}

object AnonConfig {
  @scala.inline
  def apply(config: Config | String = null, filter: String = null): AnonConfig = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig]
  }
}

