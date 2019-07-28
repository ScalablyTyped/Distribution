package typings.backstopjs

import typings.backstopjs.backstopjsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: js.UndefOr[Config | String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
}

object Anon_Config {
  @scala.inline
  def apply(config: Config | String = null, filter: String = null): Anon_Config = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[Anon_Config]
  }
}

