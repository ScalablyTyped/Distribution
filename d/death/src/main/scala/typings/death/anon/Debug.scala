package typings.death.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Debug extends js.Object {
  var SIGHUP: js.UndefOr[Boolean] = js.undefined
  var SIGINT: js.UndefOr[Boolean] = js.undefined
  var SIGQUIT: js.UndefOr[Boolean] = js.undefined
  var SIGTERM: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var uncaughtException: js.UndefOr[Boolean] = js.undefined
}

object Debug {
  @scala.inline
  def apply(
    SIGHUP: js.UndefOr[Boolean] = js.undefined,
    SIGINT: js.UndefOr[Boolean] = js.undefined,
    SIGQUIT: js.UndefOr[Boolean] = js.undefined,
    SIGTERM: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    uncaughtException: js.UndefOr[Boolean] = js.undefined
  ): Debug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SIGHUP)) __obj.updateDynamic("SIGHUP")(SIGHUP.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SIGINT)) __obj.updateDynamic("SIGINT")(SIGINT.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SIGQUIT)) __obj.updateDynamic("SIGQUIT")(SIGQUIT.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SIGTERM)) __obj.updateDynamic("SIGTERM")(SIGTERM.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uncaughtException)) __obj.updateDynamic("uncaughtException")(uncaughtException.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debug]
  }
}

