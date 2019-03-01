package typings
package cosmiconfigLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: cosmiconfigLib.cosmiconfigMod.cosmiconfigNs.Config
  var filepath: java.lang.String
  var isEmpty: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Config {
  @scala.inline
  def apply(
    config: cosmiconfigLib.cosmiconfigMod.cosmiconfigNs.Config,
    filepath: java.lang.String,
    isEmpty: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("filepath")(filepath)
    if (!js.isUndefined(isEmpty)) __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.asInstanceOf[Anon_Config]
  }
}

