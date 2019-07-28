package typings.bashDashGlob.bashDashGlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var dot: js.UndefOr[Boolean] = js.undefined
  var dotglob: js.UndefOr[Boolean] = js.undefined
  var extglob: js.UndefOr[Boolean] = js.undefined
  var failglob: js.UndefOr[Boolean] = js.undefined
  var globstar: js.UndefOr[Boolean] = js.undefined
  var nocase: js.UndefOr[Boolean] = js.undefined
  var nocaseglob: js.UndefOr[Boolean] = js.undefined
  var nullglob: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: String = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    dotglob: js.UndefOr[Boolean] = js.undefined,
    extglob: js.UndefOr[Boolean] = js.undefined,
    failglob: js.UndefOr[Boolean] = js.undefined,
    globstar: js.UndefOr[Boolean] = js.undefined,
    nocase: js.UndefOr[Boolean] = js.undefined,
    nocaseglob: js.UndefOr[Boolean] = js.undefined,
    nullglob: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(dotglob)) __obj.updateDynamic("dotglob")(dotglob)
    if (!js.isUndefined(extglob)) __obj.updateDynamic("extglob")(extglob)
    if (!js.isUndefined(failglob)) __obj.updateDynamic("failglob")(failglob)
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(nocaseglob)) __obj.updateDynamic("nocaseglob")(nocaseglob)
    if (!js.isUndefined(nullglob)) __obj.updateDynamic("nullglob")(nullglob)
    __obj.asInstanceOf[Options]
  }
}

