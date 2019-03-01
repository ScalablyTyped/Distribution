package typings
package cleanDashCssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjacentSpace extends js.Object {
  /**
    * Controls extra space before `nav` element; defaults to `false`
    */
  var adjacentSpace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls removal of IE7 selector hacks, e.g. `*+html...`; defaults to `true`
    */
  var ie7Hack: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls maximum number of selectors in a single rule (since 4.1.0); defaults to `8191`
    */
  var mergeLimit: scala.Double
  /**
    * Controls a whitelist of mergeable pseudo classes; defaults to `[':active', ...]`
    */
  var mergeablePseudoClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Controls a whitelist of mergeable pseudo elements; defaults to `['::after', ...]`
    */
  var mergeablePseudoElements: js.Array[java.lang.String]
  /**
    * Controls merging of rules with multiple pseudo classes / elements (since 4.1.0); defaults to `true`
    */
  var multiplePseudoMerging: scala.Boolean
}

object Anon_AdjacentSpace {
  @scala.inline
  def apply(
    mergeLimit: scala.Double,
    mergeablePseudoElements: js.Array[java.lang.String],
    multiplePseudoMerging: scala.Boolean,
    adjacentSpace: js.UndefOr[scala.Boolean] = js.undefined,
    ie7Hack: js.UndefOr[scala.Boolean] = js.undefined,
    mergeablePseudoClasses: js.Array[java.lang.String] = null
  ): Anon_AdjacentSpace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mergeLimit")(mergeLimit)
    __obj.updateDynamic("mergeablePseudoElements")(mergeablePseudoElements)
    __obj.updateDynamic("multiplePseudoMerging")(multiplePseudoMerging)
    if (!js.isUndefined(adjacentSpace)) __obj.updateDynamic("adjacentSpace")(adjacentSpace)
    if (!js.isUndefined(ie7Hack)) __obj.updateDynamic("ie7Hack")(ie7Hack)
    if (mergeablePseudoClasses != null) __obj.updateDynamic("mergeablePseudoClasses")(mergeablePseudoClasses)
    __obj.asInstanceOf[Anon_AdjacentSpace]
  }
}

