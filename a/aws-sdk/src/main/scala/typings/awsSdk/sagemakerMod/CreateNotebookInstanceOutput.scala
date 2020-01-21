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
  def apply(NotebookInstanceArn: NotebookInstanceArn = null): CreateNotebookInstanceOutput = {
    val __obj = js.Dynamic.literal()
    if (NotebookInstanceArn != null) __obj.updateDynamic("NotebookInstanceArn")(NotebookInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotebookInstanceOutput]
  }
}

