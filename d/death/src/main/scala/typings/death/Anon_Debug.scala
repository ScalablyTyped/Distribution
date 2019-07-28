package typings.death

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var SIGHUP: js.UndefOr[Boolean] = js.undefined
  var SIGINT: js.UndefOr[Boolean] = js.undefined
  var SIGQUIT: js.UndefOr[Boolean] = js.undefined
  var SIGTERM: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var uncaughtException: js.UndefOr[Boolean] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    SIGHUP: js.UndefOr[Boolean] = js.undefined,
    SIGINT: js.UndefOr[Boolean] = js.undefined,
    SIGQUIT: js.UndefOr[Boolean] = js.undefined,
    SIGTERM: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    uncaughtException: js.UndefOr[Boolean] = js.undefined
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

