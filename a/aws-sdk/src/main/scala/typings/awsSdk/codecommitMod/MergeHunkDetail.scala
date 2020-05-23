package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeHunkDetail extends js.Object {
  /**
    * The end position of the hunk in the merge result.
    */
  var endLine: js.UndefOr[LineNumber] = js.native
  /**
    * The base-64 encoded content of the hunk merged region that might contain a conflict.
    */
  var hunkContent: js.UndefOr[HunkContent] = js.native
  /**
    * The start position of the hunk in the merge result.
    */
  var startLine: js.UndefOr[LineNumber] = js.native
}

object MergeHunkDetail {
  @scala.inline
  def apply(
    endLine: js.UndefOr[LineNumber] = js.undefined,
    hunkContent: HunkContent = null,
    startLine: js.UndefOr[LineNumber] = js.undefined
  ): MergeHunkDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endLine)) __obj.updateDynamic("endLine")(endLine.get.asInstanceOf[js.Any])
    if (hunkContent != null) __obj.updateDynamic("hunkContent")(hunkContent.asInstanceOf[js.Any])
    if (!js.isUndefined(startLine)) __obj.updateDynamic("startLine")(startLine.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeHunkDetail]
  }
}

