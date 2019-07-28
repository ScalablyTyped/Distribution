package typings.cosmiconfig.cosmiconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderResult extends js.Object {
  var config: Config | Null
  var filepath: String
}

object LoaderResult {
  @scala.inline
  def apply(filepath: String, config: Config = null): LoaderResult = {
    val __obj = js.Dynamic.literal(filepath = filepath)
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[LoaderResult]
  }
}

