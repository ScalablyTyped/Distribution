package typings
package copyfilesLib.copyfilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** include files & directories begining with a dot (.) */
  var all: js.UndefOr[scala.Boolean] = js.undefined
  /** throw error if nothing is copied */
  var error: js.UndefOr[scala.Boolean] = js.undefined
  /** pattern or glob to exclude */
  var exclude: js.UndefOr[java.lang.String] = js.undefined
  /** flatten the output */
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  /** do not overwrite destination files if they exist */
  var soft: js.UndefOr[scala.Boolean] = js.undefined
  /** slice a path off the bottom of the paths */
  var up: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /** print more information to console */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: java.lang.String = null,
    flat: js.UndefOr[scala.Boolean] = js.undefined,
    soft: js.UndefOr[scala.Boolean] = js.undefined,
    up: scala.Double | scala.Boolean = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (!js.isUndefined(soft)) __obj.updateDynamic("soft")(soft)
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

