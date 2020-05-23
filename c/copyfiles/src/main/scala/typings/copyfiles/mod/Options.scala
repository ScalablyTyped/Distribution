package typings.copyfiles.mod

import typings.copyfiles.copyfilesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** include files & directories beginning with a dot (.) */
  var all: js.UndefOr[Boolean] = js.undefined
  /** throw error if nothing is copied */
  var error: js.UndefOr[Boolean] = js.undefined
  /** pattern or glob to exclude */
  var exclude: js.UndefOr[String] = js.undefined
  /** flatten the output */
  var flat: js.UndefOr[Boolean] = js.undefined
  /**
    * follow symbolink links
    * @default false
    */
  var follow: js.UndefOr[Boolean] = js.undefined
  /** do not overwrite destination files if they exist */
  var soft: js.UndefOr[Boolean] = js.undefined
  /**
    * slice a path off the bottom of the paths
    * @default 0
    */
  var up: js.UndefOr[Double | `true`] = js.undefined
  /** print more information to console */
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    exclude: String = null,
    flat: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Boolean] = js.undefined,
    soft: js.UndefOr[Boolean] = js.undefined,
    up: Double | `true` = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(soft)) __obj.updateDynamic("soft")(soft.get.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

