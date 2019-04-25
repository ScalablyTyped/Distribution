package typings
package burnsLib.burnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Burns configuration settings
  */
trait Config extends js.Object {
  var broadcaster: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var defaultHandler: js.UndefOr[burnsLib.HandlerFn] = js.undefined
  var pusher: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    broadcaster: java.lang.String = null,
    defaultHandler: burnsLib.HandlerFn = null,
    pusher: stdLib.Record[java.lang.String, _] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (broadcaster != null) __obj.updateDynamic("broadcaster")(broadcaster)
    if (defaultHandler != null) __obj.updateDynamic("defaultHandler")(defaultHandler)
    if (pusher != null) __obj.updateDynamic("pusher")(pusher)
    __obj.asInstanceOf[Config]
  }
}

