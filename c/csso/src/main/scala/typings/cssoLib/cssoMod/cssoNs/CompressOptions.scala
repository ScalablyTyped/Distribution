package typings
package cssoLib.cssoMod.cssoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends js.Object {
  /**
    * Transform a copy of input AST if true. Useful in case of AST reuse.
    * @default false
    */
  @JSName("clone")
  var clone_FCompressOptions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify what comments to leave:
    * - 'exclamation' or true – leave all exclamation comments
    * - 'first-exclamation' – remove every comment except first one
    * - false – remove all comments
    * @default true
    */
  var comments: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Enables merging of @media rules with the same media query by splitted by other rules.
    * The optimisation is unsafe in general, but should work fine in most cases. Use it on your own risk.
    * @default false
    */
  var forceMediaMerge: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function to track every step of transformation.
    */
  var logger: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Disable or enable a structure optimisations.
    * @default true
    */
  var restructure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Usage data for advanced optimisations.
    */
  var usage: js.UndefOr[Usage] = js.undefined
}

object CompressOptions {
  @scala.inline
  def apply(
    clone: js.UndefOr[scala.Boolean] = js.undefined,
    comments: java.lang.String | scala.Boolean = null,
    forceMediaMerge: js.UndefOr[scala.Boolean] = js.undefined,
    logger: () => scala.Unit = null,
    restructure: js.UndefOr[scala.Boolean] = js.undefined,
    usage: Usage = null
  ): CompressOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(forceMediaMerge)) __obj.updateDynamic("forceMediaMerge")(forceMediaMerge)
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction0(logger))
    if (!js.isUndefined(restructure)) __obj.updateDynamic("restructure")(restructure)
    if (usage != null) __obj.updateDynamic("usage")(usage)
    __obj.asInstanceOf[CompressOptions]
  }
}

