package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotebookInstanceLifecycleConfigOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigArn: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigArn] = js.native
}

object CreateNotebookInstanceLifecycleConfigOutput {
  @scala.inline
  def apply(): CreateNotebookInstanceLifecycleConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotebookInstanceLifecycleConfigOutput]
  }
  @scala.inline
  implicit class CreateNotebookInstanceLifecycleConfigOutputOps[Self <: CreateNotebookInstanceLifecycleConfigOutput] (val x: Self) extends AnyVal {
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
    def setNotebookInstanceLifecycleConfigArn(value: NotebookInstanceLifecycleConfigArn): Self = this.set("NotebookInstanceLifecycleConfigArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotebookInstanceLifecycleConfigArn: Self = this.set("NotebookInstanceLifecycleConfigArn", js.undefined)
  }
  
}

