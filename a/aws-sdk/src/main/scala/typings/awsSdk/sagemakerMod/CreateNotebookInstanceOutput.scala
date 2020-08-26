package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotebookInstanceOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notebook instance. 
    */
  var NotebookInstanceArn: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookInstanceArn] = js.native
}

object CreateNotebookInstanceOutput {
  @scala.inline
  def apply(): CreateNotebookInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotebookInstanceOutput]
  }
  @scala.inline
  implicit class CreateNotebookInstanceOutputOps[Self <: CreateNotebookInstanceOutput] (val x: Self) extends AnyVal {
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
    def setNotebookInstanceArn(value: NotebookInstanceArn): Self = this.set("NotebookInstanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotebookInstanceArn: Self = this.set("NotebookInstanceArn", js.undefined)
  }
  
}

