package typings.conventionalRecommendedBump.mod.Options.WhatBump

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var level: js.UndefOr[Double] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
}

object Result {
  @scala.inline
  def apply(level: js.UndefOr[Double] = js.undefined, reason: String = null): Result = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

