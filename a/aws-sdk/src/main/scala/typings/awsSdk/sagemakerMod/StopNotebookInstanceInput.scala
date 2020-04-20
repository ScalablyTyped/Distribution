package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopNotebookInstanceInput extends js.Object {
  /**
    * The name of the notebook instance to terminate.
    */
  var NotebookInstanceName: typings.awsSdk.sagemakerMod.NotebookInstanceName = js.native
}

object StopNotebookInstanceInput {
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): StopNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopNotebookInstanceInput]
  }
}

