package typings
package deathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var SIGHUP: js.UndefOr[scala.Boolean] = js.undefined
  var SIGINT: js.UndefOr[scala.Boolean] = js.undefined
  var SIGQUIT: js.UndefOr[scala.Boolean] = js.undefined
  var SIGTERM: js.UndefOr[scala.Boolean] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var uncaughtException: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    SIGHUP: js.UndefOr[scala.Boolean] = js.undefined,
    SIGINT: js.UndefOr[scala.Boolean] = js.undefined,
    SIGQUIT: js.UndefOr[scala.Boolean] = js.undefined,
    SIGTERM: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    uncaughtException: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SIGHUP)) __obj.updateDynamic("SIGHUP")(SIGHUP)
    if (!js.isUndefined(SIGINT)) __obj.updateDynamic("SIGINT")(SIGINT)
    if (!js.isUndefined(SIGQUIT)) __obj.updateDynamic("SIGQUIT")(SIGQUIT)
    if (!js.isUndefined(SIGTERM)) __obj.updateDynamic("SIGTERM")(SIGTERM)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(uncaughtException)) __obj.updateDynamic("uncaughtException")(uncaughtException)
    __obj.asInstanceOf[Anon_Debug]
  }
}

