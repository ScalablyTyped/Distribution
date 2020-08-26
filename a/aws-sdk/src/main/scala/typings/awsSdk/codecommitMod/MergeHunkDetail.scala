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
  def apply(): MergeHunkDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeHunkDetail]
  }
  @scala.inline
  implicit class MergeHunkDetailOps[Self <: MergeHunkDetail] (val x: Self) extends AnyVal {
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
    def setEndLine(value: LineNumber): Self = this.set("endLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndLine: Self = this.set("endLine", js.undefined)
    @scala.inline
    def setHunkContent(value: HunkContent): Self = this.set("hunkContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHunkContent: Self = this.set("hunkContent", js.undefined)
    @scala.inline
    def setStartLine(value: LineNumber): Self = this.set("startLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartLine: Self = this.set("startLine", js.undefined)
  }
  
}

