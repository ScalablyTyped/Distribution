package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentPathResponse extends js.Object {
  /**
    * The path information.
    */
  var Path: js.UndefOr[ResourcePath] = js.native
}

object GetDocumentPathResponse {
  @scala.inline
  def apply(): GetDocumentPathResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentPathResponse]
  }
  @scala.inline
  implicit class GetDocumentPathResponseOps[Self <: GetDocumentPathResponse] (val x: Self) extends AnyVal {
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
    def setPath(value: ResourcePath): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
  }
  
}

