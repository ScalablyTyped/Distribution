package typings.caseSensitivePathsWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Show more information
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Run before emit instead of after resolve for individual files
    */
  var useBeforeEmitHook: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined, useBeforeEmitHook: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(useBeforeEmitHook)) __obj.updateDynamic("useBeforeEmitHook")(useBeforeEmitHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

