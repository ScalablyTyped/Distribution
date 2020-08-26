package typings.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeAdjacentRules extends js.Object {
  /**
    * Sets all optimizations at this level unless otherwise specified
    */
  var all: js.UndefOr[Boolean] = js.native
  /**
    * Controls adjacent rules merging; defaults to true
    */
  var mergeAdjacentRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls merging properties into shorthands; defaults to true
    */
  var mergeIntoShorthands: js.UndefOr[Boolean] = js.native
  /**
    * Controls `@media` merging; defaults to true
    */
  var mergeMedia: js.UndefOr[Boolean] = js.native
  /**
    * Controls non-adjacent rule merging; defaults to true
    */
  var mergeNonAdjacentRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls semantic merging; defaults to false
    */
  var mergeSemantically: js.UndefOr[Boolean] = js.native
  /**
    * Controls property overriding based on understandably; defaults to true
    */
  var overrideProperties: js.UndefOr[Boolean] = js.native
  /**
    * Controls non-adjacent rule reducing; defaults to true
    */
  var reduceNonAdjacentRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls duplicate `@font-face` removing; defaults to true
    */
  var removeDuplicateFontRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls duplicate `@media` removing; defaults to true
    */
  var removeDuplicateMediaBlocks: js.UndefOr[Boolean] = js.native
  /**
    * Controls duplicate rules removing; defaults to true
    */
  var removeDuplicateRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls removing empty rules and nested blocks; defaults to `true`
    */
  var removeEmpty: js.UndefOr[Boolean] = js.native
  /**
    * Controls unused at rule removing; defaults to false (available since 4.1.0)
    */
  var removeUnusedAtRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls rule restructuring; defaults to false
    */
  var restructureRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls which properties won't be optimized, defaults to `[]` which means all will be optimized (since 4.1.0)
    */
  var skipProperties: js.UndefOr[js.Array[String]] = js.native
}

object MergeAdjacentRules {
  @scala.inline
  def apply(): MergeAdjacentRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeAdjacentRules]
  }
  @scala.inline
  implicit class MergeAdjacentRulesOps[Self <: MergeAdjacentRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setMergeAdjacentRules(value: Boolean): Self = this.set("mergeAdjacentRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeAdjacentRules: Self = this.set("mergeAdjacentRules", js.undefined)
    @scala.inline
    def setMergeIntoShorthands(value: Boolean): Self = this.set("mergeIntoShorthands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeIntoShorthands: Self = this.set("mergeIntoShorthands", js.undefined)
    @scala.inline
    def setMergeMedia(value: Boolean): Self = this.set("mergeMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeMedia: Self = this.set("mergeMedia", js.undefined)
    @scala.inline
    def setMergeNonAdjacentRules(value: Boolean): Self = this.set("mergeNonAdjacentRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeNonAdjacentRules: Self = this.set("mergeNonAdjacentRules", js.undefined)
    @scala.inline
    def setMergeSemantically(value: Boolean): Self = this.set("mergeSemantically", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeSemantically: Self = this.set("mergeSemantically", js.undefined)
    @scala.inline
    def setOverrideProperties(value: Boolean): Self = this.set("overrideProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideProperties: Self = this.set("overrideProperties", js.undefined)
    @scala.inline
    def setReduceNonAdjacentRules(value: Boolean): Self = this.set("reduceNonAdjacentRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReduceNonAdjacentRules: Self = this.set("reduceNonAdjacentRules", js.undefined)
    @scala.inline
    def setRemoveDuplicateFontRules(value: Boolean): Self = this.set("removeDuplicateFontRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveDuplicateFontRules: Self = this.set("removeDuplicateFontRules", js.undefined)
    @scala.inline
    def setRemoveDuplicateMediaBlocks(value: Boolean): Self = this.set("removeDuplicateMediaBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveDuplicateMediaBlocks: Self = this.set("removeDuplicateMediaBlocks", js.undefined)
    @scala.inline
    def setRemoveDuplicateRules(value: Boolean): Self = this.set("removeDuplicateRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveDuplicateRules: Self = this.set("removeDuplicateRules", js.undefined)
    @scala.inline
    def setRemoveEmpty(value: Boolean): Self = this.set("removeEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveEmpty: Self = this.set("removeEmpty", js.undefined)
    @scala.inline
    def setRemoveUnusedAtRules(value: Boolean): Self = this.set("removeUnusedAtRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveUnusedAtRules: Self = this.set("removeUnusedAtRules", js.undefined)
    @scala.inline
    def setRestructureRules(value: Boolean): Self = this.set("restructureRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestructureRules: Self = this.set("restructureRules", js.undefined)
    @scala.inline
    def setSkipPropertiesVarargs(value: String*): Self = this.set("skipProperties", js.Array(value :_*))
    @scala.inline
    def setSkipProperties(value: js.Array[String]): Self = this.set("skipProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipProperties: Self = this.set("skipProperties", js.undefined)
  }
  
}

