package typings.cosmiconfig

import typings.cosmiconfig.distTypesMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: Config
  var filepath: String
  var isEmpty: js.UndefOr[Boolean] = js.undefined
}

object Anon_Config {
  @scala.inline
  def apply(config: Config, filepath: String, isEmpty: js.UndefOr[Boolean] = js.undefined): Anon_Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any])
    if (!js.isUndefined(isEmpty)) __obj.updateDynamic("isEmpty")(isEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Config]
  }
}

