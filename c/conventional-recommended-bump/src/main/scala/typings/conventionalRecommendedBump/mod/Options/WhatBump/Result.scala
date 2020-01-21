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
  def apply(level: Int | Double = null, reason: String = null): Result = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

