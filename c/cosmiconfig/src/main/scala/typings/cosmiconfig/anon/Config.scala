package typings.cosmiconfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var config: typings.cosmiconfig.typesMod.Config
  var filepath: String
  var isEmpty: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    config: typings.cosmiconfig.typesMod.Config,
    filepath: String,
    isEmpty: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any])
    if (!js.isUndefined(isEmpty)) __obj.updateDynamic("isEmpty")(isEmpty.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

