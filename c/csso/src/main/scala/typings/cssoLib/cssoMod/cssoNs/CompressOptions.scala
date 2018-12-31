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

