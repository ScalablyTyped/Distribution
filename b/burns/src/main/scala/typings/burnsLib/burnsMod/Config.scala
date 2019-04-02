package typings
package burnsLib.burnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var broadcaster: js.UndefOr[js.Any] = js.undefined
  var defaultHandler: js.UndefOr[js.Any] = js.undefined
  var pusher: js.UndefOr[js.Any] = js.undefined
}

object Config {
  @scala.inline
  def apply(broadcaster: js.Any = null, defaultHandler: js.Any = null, pusher: js.Any = null): Config = {
    val __obj = js.Dynamic.literal()
    if (broadcaster != null) __obj.updateDynamic("broadcaster")(broadcaster)
    if (defaultHandler != null) __obj.updateDynamic("defaultHandler")(defaultHandler)
    if (pusher != null) __obj.updateDynamic("pusher")(pusher)
    __obj.asInstanceOf[Config]
  }
}

