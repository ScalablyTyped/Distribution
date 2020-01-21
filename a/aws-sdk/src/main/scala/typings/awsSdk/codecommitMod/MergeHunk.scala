package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeHunk extends js.Object {
  /**
    * Information about the merge hunk in the base of a merge or pull request.
    */
  var base: js.UndefOr[MergeHunkDetail] = js.native
  /**
    * Information about the merge hunk in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[MergeHunkDetail] = js.native
  /**
    * A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the same file or the same lines in a file were modified in both the source and destination of a merge or pull request. Valid values include true, false, and null. True when the hunk represents a conflict and one or more files contains a line conflict. File mode conflicts in a merge do not set this to true.
    */
  var isConflict: js.UndefOr[IsHunkConflict] = js.native
  /**
    * Information about the merge hunk in the source of a merge or pull request.
    */
  var source: js.UndefOr[MergeHunkDetail] = js.native
}

object MergeHunk {
  @scala.inline
  def apply(
    base: MergeHunkDetail = null,
    destination: MergeHunkDetail = null,
    isConflict: js.UndefOr[Boolean] = js.undefined,
    source: MergeHunkDetail = null
  ): MergeHunk = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (!js.isUndefined(isConflict)) __obj.updateDynamic("isConflict")(isConflict.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeHunk]
  }
}

