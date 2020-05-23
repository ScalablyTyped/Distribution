package typings.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeAdjacentRules extends js.Object {
  /**
    * Sets all optimizations at this level unless otherwise specified
    */
  var all: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls adjacent rules merging; defaults to true
    */
  var mergeAdjacentRules: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls merging properties into shorthands; defaults to true
    */
  var mergeIntoShorthands: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls `@media` merging; defaults to true
    */
  var mergeMedia: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls non-adjacent rule merging; defaults to true
    */
  var mergeNonAdjacentRules: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls semantic merging; defaults to false
    */
  var mergeSemantically: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls property overriding based on understandably; defaults to true
    */
  var overrideProperties: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls non-adjacent rule reducing; defaults to true
    */
  var reduceNonAdjacentRules: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls duplicate `@font-face` removing; defaults to true
    */
  var removeDuplicateFontRules: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls duplicate `@media` removing; defaults to true
    */
  var removeDuplicateMediaBlocks: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls duplicate rules removing; defaults to true
    */
  var removeDuplicateRules: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls removing empty rules and nested blocks; defaults to `true`
    */
  var removeEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls unused at rule removing; defaults to false (available since 4.1.0)
    */
  var removeUnusedAtRules: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls rule restructuring; defaults to false
    */
  var restructureRules: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls which properties won't be optimized, defaults to `[]` which means all will be optimized (since 4.1.0)
    */
  var skipProperties: js.UndefOr[js.Array[String]] = js.undefined
}

object MergeAdjacentRules {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    mergeAdjacentRules: js.UndefOr[Boolean] = js.undefined,
    mergeIntoShorthands: js.UndefOr[Boolean] = js.undefined,
    mergeMedia: js.UndefOr[Boolean] = js.undefined,
    mergeNonAdjacentRules: js.UndefOr[Boolean] = js.undefined,
    mergeSemantically: js.UndefOr[Boolean] = js.undefined,
    overrideProperties: js.UndefOr[Boolean] = js.undefined,
    reduceNonAdjacentRules: js.UndefOr[Boolean] = js.undefined,
    removeDuplicateFontRules: js.UndefOr[Boolean] = js.undefined,
    removeDuplicateMediaBlocks: js.UndefOr[Boolean] = js.undefined,
    removeDuplicateRules: js.UndefOr[Boolean] = js.undefined,
    removeEmpty: js.UndefOr[Boolean] = js.undefined,
    removeUnusedAtRules: js.UndefOr[Boolean] = js.undefined,
    restructureRules: js.UndefOr[Boolean] = js.undefined,
    skipProperties: js.Array[String] = null
  ): MergeAdjacentRules = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeAdjacentRules)) __obj.updateDynamic("mergeAdjacentRules")(mergeAdjacentRules.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeIntoShorthands)) __obj.updateDynamic("mergeIntoShorthands")(mergeIntoShorthands.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeMedia)) __obj.updateDynamic("mergeMedia")(mergeMedia.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeNonAdjacentRules)) __obj.updateDynamic("mergeNonAdjacentRules")(mergeNonAdjacentRules.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeSemantically)) __obj.updateDynamic("mergeSemantically")(mergeSemantically.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideProperties)) __obj.updateDynamic("overrideProperties")(overrideProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reduceNonAdjacentRules)) __obj.updateDynamic("reduceNonAdjacentRules")(reduceNonAdjacentRules.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeDuplicateFontRules)) __obj.updateDynamic("removeDuplicateFontRules")(removeDuplicateFontRules.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeDuplicateMediaBlocks)) __obj.updateDynamic("removeDuplicateMediaBlocks")(removeDuplicateMediaBlocks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeDuplicateRules)) __obj.updateDynamic("removeDuplicateRules")(removeDuplicateRules.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeEmpty)) __obj.updateDynamic("removeEmpty")(removeEmpty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeUnusedAtRules)) __obj.updateDynamic("removeUnusedAtRules")(removeUnusedAtRules.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restructureRules)) __obj.updateDynamic("restructureRules")(restructureRules.get.asInstanceOf[js.Any])
    if (skipProperties != null) __obj.updateDynamic("skipProperties")(skipProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeAdjacentRules]
  }
}

