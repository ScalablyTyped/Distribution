package typings.bashGlob.mod

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
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (!js.isUndefined(dotglob)) __obj.updateDynamic("dotglob")(dotglob.asInstanceOf[js.Any])
    if (!js.isUndefined(extglob)) __obj.updateDynamic("extglob")(extglob.asInstanceOf[js.Any])
    if (!js.isUndefined(failglob)) __obj.updateDynamic("failglob")(failglob.asInstanceOf[js.Any])
    if (!js.isUndefined(globstar)) __obj.updateDynamic("globstar")(globstar.asInstanceOf[js.Any])
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.asInstanceOf[js.Any])
    if (!js.isUndefined(nocaseglob)) __obj.updateDynamic("nocaseglob")(nocaseglob.asInstanceOf[js.Any])
    if (!js.isUndefined(nullglob)) __obj.updateDynamic("nullglob")(nullglob.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

