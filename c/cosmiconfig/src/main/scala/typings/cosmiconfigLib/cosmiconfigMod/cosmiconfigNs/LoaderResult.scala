package typings
package cosmiconfigLib.cosmiconfigMod.cosmiconfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderResult extends js.Object {
  var config: Config | scala.Null
  var filepath: java.lang.String
}

object LoaderResult {
  @scala.inline
  def apply(filepath: java.lang.String, config: Config = null): LoaderResult = {
    val __obj = js.Dynamic.literal(filepath = filepath)
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[LoaderResult]
  }
}

