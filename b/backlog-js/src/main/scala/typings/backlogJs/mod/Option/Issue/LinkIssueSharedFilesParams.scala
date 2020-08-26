package typings.backlogJs.mod.Option.Issue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkIssueSharedFilesParams extends js.Object {
  var fileId: js.Array[Double] = js.native
}

object LinkIssueSharedFilesParams {
  @scala.inline
  def apply(fileId: js.Array[Double]): LinkIssueSharedFilesParams = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkIssueSharedFilesParams]
  }
  @scala.inline
  implicit class LinkIssueSharedFilesParamsOps[Self <: LinkIssueSharedFilesParams] (val x: Self) extends AnyVal {
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
    def setFileIdVarargs(value: Double*): Self = this.set("fileId", js.Array(value :_*))
    @scala.inline
    def setFileId(value: js.Array[Double]): Self = this.set("fileId", value.asInstanceOf[js.Any])
  }
  
}

