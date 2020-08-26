package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresignedNotebookInstanceUrlOutput extends js.Object {
  /**
    * A JSON object that contains the URL string. 
    */
  var AuthorizedUrl: js.UndefOr[NotebookInstanceUrl] = js.native
}

object CreatePresignedNotebookInstanceUrlOutput {
  @scala.inline
  def apply(): CreatePresignedNotebookInstanceUrlOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePresignedNotebookInstanceUrlOutput]
  }
  @scala.inline
  implicit class CreatePresignedNotebookInstanceUrlOutputOps[Self <: CreatePresignedNotebookInstanceUrlOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorizedUrl(value: NotebookInstanceUrl): Self = this.set("AuthorizedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizedUrl: Self = this.set("AuthorizedUrl", js.undefined)
  }
  
}

